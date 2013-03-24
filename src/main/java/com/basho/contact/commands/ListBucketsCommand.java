package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.ListBucketsParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.RiakException;

import java.util.Set;

public class ListBucketsCommand extends RiakCommand<ResultSymbol, ListBucketsParams.Pre> {

    public ListBucketsCommand() {
        super(ListBucketsParams.Pre.class);
    }

    @Override
    public ResultSymbol exec(RuntimeContext runtimeCtx) {
        try {
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preListBucketsAction(params);
            Set<String> buckets = (Set<String>) runtimeCtx.getConnectionProvider().
                    getDefaultClient(runtimeCtx).listBuckets();
            ListBucketsParams.Post postParams = new ListBucketsParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.buckets = buckets;
            runtimeCtx.getActionListener().postListBucketsAction(postParams);
        } catch (RiakException e) {
            e.printStackTrace();
        }

        return null;
    }

}
