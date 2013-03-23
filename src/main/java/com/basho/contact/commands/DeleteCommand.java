package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.DeleteParams;
import com.basho.contact.symbols.ResultSymbol;

public class DeleteCommand extends RiakCommand<ResultSymbol, DeleteParams.Pre> {

    public DeleteCommand() {
        super(DeleteParams.Pre.class);
    }

	@Override
	public ResultSymbol exec(RuntimeContext ctx) {
		return null;
	}


}
