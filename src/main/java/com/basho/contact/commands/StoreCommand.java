package com.basho.contact.commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.basho.contact.Pair;
import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.builders.RiakObjectBuilder;
import com.basho.riak.client.operations.StoreObject;

public class StoreCommand extends RiakCommand<ResultSymbol> {

	static abstract class StoreOpt {
		public abstract StoreObject<IRiakObject> setOption(
				StoreObject<IRiakObject> o, Object value);
	}

	public String key;
	public List<Pair> indexes = null;
	
	private static Map<String, StoreOpt> optionsMap = new HashMap<String, StoreOpt>();

	private static int objectToInt(Object o) {
		if (o instanceof String) {
			return Integer.parseInt((String) o);
		} else if (o instanceof Integer) {
			return ((Integer) o).intValue();
		} else {
			// TODO: this is a bit harsh
			throw new RuntimeException("Invalid option value " + o);
		}
	}

	private static boolean objectToBoolean(Object o) {
		if (o instanceof String) {
			return Boolean.parseBoolean((String) o);
		} else if (o instanceof Boolean) {
			return ((Boolean) o).booleanValue();
		} else {
			// TODO: this is a bit harsh
			throw new RuntimeException("Invalid option value " + o);
		}
	}

	static {
		optionsMap.put("w", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.w(objectToInt(value));
			}
		});
		optionsMap.put("dw", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.dw(objectToInt(value));
			}
		});
		optionsMap.put("pw", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.pw(objectToInt(value));
			}
		});

		optionsMap.put("return_body", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.returnBody(objectToBoolean(value));
			}
		});
		optionsMap.put("if_not_modified", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.ifNotModified(objectToBoolean(value));
			}
		});
		optionsMap.put("if_none_match", new StoreOpt() {
			public StoreObject<IRiakObject> setOption(
					StoreObject<IRiakObject> o, Object value) {
				return o.ifNoneMatch(objectToBoolean(value));
			}
		});
	}

	private StoreObject<IRiakObject> processOptions(RuntimeContext runtimeCtx,
			StoreObject<IRiakObject> o) {
		if (options != null) {
			for (String key : options.keySet()) {
				Object val = options.get(key);
				if (!optionsMap.containsKey(key)) {
					runtimeCtx.appendError("Unknown store option:" + key);
				} else {
					o = optionsMap.get(key).setOption(o, val);
				}
			}
			return o;
		} else {
			return o;
		}
	}

	// // case "return_head" : I don't see a return_head option in the Java
	// client?
	/*
	 * optional bytes key = 2; optional bytes vclock = 3; required RpbContent
	 * content = 4;
	 */

	// TODO: watch for errors here
	private RiakObjectBuilder addIndexes(RiakObjectBuilder builder) {
		if(indexes != null) {
			for(Pair p : indexes) {
				if(p.getKey().endsWith("_bin")) {
					builder = builder.addIndex(p.getKey(), p.getValue().toString());
				} else if(p.getKey().endsWith("_int")) {
					// TODO: watch for errors here
					builder = builder.addIndex(p.getKey(), Long.parseLong(p.getValue().toString()));
				}
				System.out.println(p);
			}
		}
		return builder;
	}
	
	@Override
	public ResultSymbol exec(RuntimeContext runtimeCtx) {
		IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
		if (client != null) {
			if (this.bucket != null) {
				try {
					RiakObjectBuilder builder = 
							RiakObjectBuilder
								.newBuilder(this.bucket, key)
								.withContentType(content.getContentType().toString())
								.withValue(this.content.getValue());
					builder = addIndexes(builder);
					IRiakObject obj = builder.build(); 
					// TODO: cache this
					Bucket b = client.fetchBucket(this.bucket).execute();
					StoreObject<IRiakObject> so = processOptions(runtimeCtx,
							b.store(obj));
					runtimeCtx.getActionListener().preStoreAction(so);
					ResultSymbol result = new ResultSymbol(so.execute());
					runtimeCtx.getActionListener().postStoreAction(result.value);
					// TODO: return_body should check for true
					if (this.options != null && this.options.containsKey("return_body")) {
						// TODO: move to JS
						runtimeCtx.appendOutput(result.toString());
					}
					return result;
				} catch (RiakRetryFailedException e) {
					e.printStackTrace();
					runtimeCtx.appendError("Can't store object in bucket", e);
					return null;
				}
			} else {
				runtimeCtx.appendError("Bucket not selected");
				return null;
			}
		}
		return null;
	}

}
