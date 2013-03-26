package com.basho.contact;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.symbols.ContactSymbol;
import com.basho.riak.client.IRiakClient;

public abstract class BucketCommand<K extends ContactSymbol<?>, O extends ActionParams> extends RiakCommand<K, O> {
    private String name = "";

    public BucketCommand(String name, Class<O> c) {
        super(c);
        this.name = name;
    }

    public abstract K bucketExec(RuntimeContext runtimeCtx, IRiakClient client, String bucket);

    @Override
    public K exec(RuntimeContext runtimeCtx) {
        IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
        if (client != null) {
            if (this.params.bucket != null) {
                return bucketExec(runtimeCtx, client, this.params.bucket);
            } else {
                runtimeCtx.appendError("Bucket not selected for " + name + " op.");
                return null;
            }
        } else {
            runtimeCtx.appendError("Not connected to Riak for " + name + " op.");
        }
        return null;
    }
}
