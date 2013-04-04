package com.basho.contact.commands;

import com.basho.contact.BucketCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.UpdateParams;
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
