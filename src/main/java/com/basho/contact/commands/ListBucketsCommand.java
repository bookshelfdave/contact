package com.basho.contact.commands;

import java.util.Set;

import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.RiakException;

public class ListBucketsCommand extends RiakCommand<ResultSymbol>{

	@Override
	public ResultSymbol exec(RuntimeContext runtimeCtx) {
		try {
			runtimeCtx.getActionListener().preListBucketsAction();
			Set<String> buckets = (Set<String>)runtimeCtx.getConnectionProvider().
					getDefaultClient(runtimeCtx).listBuckets();
			runtimeCtx.getActionListener().postListBucketsAction(buckets);
		} catch (RiakException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
