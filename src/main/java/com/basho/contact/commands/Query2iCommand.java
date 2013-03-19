package com.basho.contact.commands;

import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.Query2IResultsSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.query.indexes.BinIndex;
import com.basho.riak.client.query.indexes.FetchIndex;
import com.basho.riak.client.query.indexes.IntIndex;

public class Query2iCommand extends RiakCommand<Query2IResultsSymbol> {
	public String indexName;
	public String indexVal;

	public String min;
	public String max;

	@Override
	public Query2IResultsSymbol exec(RuntimeContext runtimeCtx) {
		IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
		if (client != null) {
			if (this.bucket != null) {
				try {
//					System.out.println("Index query:" + indexName);
//					System.out.println("Index value:" + indexVal);
//					System.out.println("Index min:" + min);
//					System.out.println("Index max:" + max);

					// TODO: optimize this to skip fetch/create bucket every time
					Bucket b = client.fetchBucket(this.bucket).execute();
					
					FetchIndex<?> index = null;
					if (indexVal != null) {
						// 2i exact query
						if (indexName.endsWith("_bin")) {
							index = b.fetchIndex(BinIndex.named(indexName)).withValue(indexVal);
						} else if (indexName.endsWith("_int")) {
							long val = 0;
							try {
								val = Long.parseLong(indexVal);
							} catch (Exception e) {
								throw new RuntimeException("Invalid 2i query exact value");
							}
							index = b.fetchIndex(IntIndex.named(indexName)).withValue(val);
						}

					} else if (min != null && max != null) {
						if (indexName.endsWith("_bin")) {
							index = b.fetchIndex(BinIndex.named(indexName)).from(min).to(max);
						} else if (indexName.endsWith("_int")) {
							long from = 0;
							long to = 0;
							try {
								from = Long.parseLong(min);
							} catch (Exception e) {
								// shouldn't be a runtime exception
								throw new RuntimeException(
										"Invalid 2i query \"from\" parameter");
							}
							try {
								to = Long.parseLong(max);
							} catch (Exception e) {
								// shouldn't be a runtime exception
								throw new RuntimeException(
										"Invalid 2i query \"to\" parameter");
							}
							index = b.fetchIndex(IntIndex.named(indexName))
									.from(from)
									.to(to);
						}
					} else {
						// these shouldn't be runtime exceptions
						throw new RuntimeException(
								"Invalid 2i query parameters");
					}
					runtimeCtx.getActionListener().preQuery2iAction(index);
					Query2IResultsSymbol results = new Query2IResultsSymbol(index.execute());
					runtimeCtx.getActionListener().postQuery2iAction(results.value);
					return results;
				} catch (RiakException e) {
					runtimeCtx.appendError("Error executing 2i query", e);
				}
			} else {
				runtimeCtx
						.appendError("Can't perfom a 2i query without a bucket");
				return null;
			}
		}
		return null;
	}

}
