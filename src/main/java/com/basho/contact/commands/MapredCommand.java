package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.MapRedParams;
import com.basho.contact.symbols.ResultsSymbol;

public class MapredCommand extends RiakCommand<ResultsSymbol, MapRedParams.Pre> {

    public MapredCommand() {
        super(MapRedParams.Pre.class);
    }

	@Override
	public ResultsSymbol exec(RuntimeContext ctx) {
		//ctx.getNextPBClient().mapReduce()
		
		return null;
	}


}
