package com.basho.contact.commands.core;

import com.basho.contact.commands.BucketCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.UpdateParams;
import com.basho.contact.symbols.VoidSymbol;

public class UpdateCommand extends BucketCommand<VoidSymbol, UpdateParams.Pre> {
    public UpdateCommand() {
        super("update", UpdateParams.Pre.class);
    }
    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {

        return new VoidSymbol();
    }
}
