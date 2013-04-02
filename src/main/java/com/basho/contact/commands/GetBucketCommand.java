package com.basho.contact.commands;


import com.basho.contact.BucketCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.GetBucketParams;
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
