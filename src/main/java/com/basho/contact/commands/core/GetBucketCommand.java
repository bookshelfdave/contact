package com.basho.contact.commands.core;


import com.basho.contact.commands.BucketCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.GetBucketParams;
import com.basho.contact.symbols.VoidSymbol;

public class GetBucketCommand extends BucketCommand<VoidSymbol, GetBucketParams.Pre> {
    public GetBucketCommand() {
        super("get bucket", GetBucketParams.Pre.class);
    }

    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String nobucket) {
        runtimeCtx.getActionListener().preGetBucket(params);
        GetBucketParams.Post postParams = new GetBucketParams.Post();
        postParams.bucket = params.bucket;
        runtimeCtx.getActionListener().postGetBucket(postParams);
        return new VoidSymbol();
    }
}
