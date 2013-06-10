package com.basho.contact.commands.core;

import com.basho.contact.commands.BucketCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.CountKeysParams;
import com.basho.contact.symbols.VoidSymbol;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.query.MapReduceResult;
import com.basho.riak.client.query.functions.JSSourceFunction;
import com.basho.riak.client.query.functions.NamedJSFunction;

import java.util.Collection;

public class CountKeysCommand extends BucketCommand<VoidSymbol, CountKeysParams.Pre> {
    public CountKeysCommand() {
        super("count keys", CountKeysParams.Pre.class);
    }

    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            runtimeCtx.getActionListener().preCountKeys(this.params);
            MapReduceResult result =  this.conn.mapReduce(this.params.bucket)
                  .addMapPhase(new JSSourceFunction("function(riakobj) {return [1]; }"), false)
                  .addReducePhase(new NamedJSFunction("Riak.reduceSum"), true).execute();
            String rawResult = result.getResultRaw();
            Collection<Long> results = result.getResult(Long.class);
            long count = -1;
            if(!results.isEmpty()) {
                Long l = results.iterator().next();
                count = l;
            }
            CountKeysParams.Post postParams = new CountKeysParams.Post();
            postParams.keyCount = count;
            postParams.bucket = this.params.bucket;
            runtimeCtx.getActionListener().postCountKeys(postParams);
        } catch (RiakException e) {
            runtimeCtx.appendError(e);

        }
        return new VoidSymbol();
    }
}
