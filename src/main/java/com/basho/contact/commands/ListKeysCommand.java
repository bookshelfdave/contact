package com.basho.contact.commands;

import java.util.ArrayList;
import java.util.List;

import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;

public class ListKeysCommand extends RiakCommand<ResultSymbol> {

	@Override
	public ResultSymbol exec(RuntimeContext runtimeCtx) {
		IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
		if(client != null) {
			if(this.bucket != null) {
				try {
					// TODO: optimize this to skip fetch/create bucket every time
					runtimeCtx.getNotifier().preListKeysAction(this.bucket);

					Bucket b = client.fetchBucket(this.bucket).execute();
					List<String> keys = new ArrayList<String>();
					// DO I need a copy here? Seems like it
					for(String k : b.keys()) {
						keys.add(k);
					}
					runtimeCtx.getNotifier().postListKeysAction(keys);
					return null;
				} catch (RiakException e) {
					runtimeCtx.appendError("Can't list keys in bucket", e);
				}
			} else {
				runtimeCtx.appendError("Bucket not selected to list");
				return null;
			}
		}
		return null;
	}

}
