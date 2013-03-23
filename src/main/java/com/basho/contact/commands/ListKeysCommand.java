package com.basho.contact.commands;

import java.util.ArrayList;
import java.util.List;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;

public class ListKeysCommand extends RiakCommand<ResultSymbol, ListKeysParams.Pre> {

    public ListKeysCommand() {
        super(ListKeysParams.Pre.class);
    }

	@Override
	public ResultSymbol exec(RuntimeContext runtimeCtx) {
		IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
		if(client != null) {
			if(params.bucket != null) {
				try {
					// TODO: optimize this to skip fetch/create bucket every time
					params.ctx = runtimeCtx;
                    runtimeCtx.getActionListener().preListKeysAction(params);

					Bucket b = client.fetchBucket(params.bucket).execute();
					List<String> keys = new ArrayList<String>();
					// DO I need a copy here? Seems like it
					for(String k : b.keys()) {
						keys.add(k);
					}
                    ListKeysParams.Post postParams = new ListKeysParams.Post();
                    postParams.ctx = runtimeCtx;
                    postParams.keys = keys;
                    postParams.bucket = params.bucket;
					runtimeCtx.getActionListener().postListKeysAction(postParams);
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
