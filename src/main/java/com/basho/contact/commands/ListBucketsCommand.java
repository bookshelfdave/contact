package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.ListBucketsParams;
import com.basho.contact.symbols.StringSetSymbol;
import com.basho.riak.client.RiakException;

import java.util.Set;

public class ListBucketsCommand extends RiakCommand<StringSetSymbol, ListBucketsParams.Pre> {

    public ListBucketsCommand() {
        super(ListBucketsParams.Pre.class);
    }

    @Override
    public StringSetSymbol exec(RuntimeContext runtimeCtx) {
        try {
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preListBucketsAction(params);
            Set<String> buckets = (Set<String>) runtimeCtx.getConnectionProvider().
                    getDefaultClient(runtimeCtx).listBuckets();
            ListBucketsParams.Post postParams = new ListBucketsParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.buckets = buckets;
            runtimeCtx.getActionListener().postListBucketsAction(postParams);
            StringSetSymbol result = new StringSetSymbol(buckets);
            return result;
        } catch (RiakException e) {
            e.printStackTrace();
        }

        return null;
    }
}
