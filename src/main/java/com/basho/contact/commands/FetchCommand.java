package com.basho.contact.commands;

import java.util.HashMap;
import java.util.Map;

import com.basho.contact.RuntimeContext;
import com.basho.contact.actions.FetchActionParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.operations.FetchObject;

public class FetchCommand extends RiakCommand<ResultSymbol> {
	public String key;
	
	static abstract class FetchOpt {
		public abstract FetchObject<IRiakObject> setOption(
				FetchObject<IRiakObject> o, Object value);
	}

	private static Map<String, FetchOpt> optionsMap = new HashMap<String, FetchOpt>();

	// TODO: put these in a utils pkg somewhere
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
//	    optional bytes if_modified = 7;
//	    optional bool head = 8;
//	    optional bool deletedvclock = 9;
		
		optionsMap.put("r", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				return o.r(objectToInt(value));
			}
		});

		optionsMap.put("pr", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				return o.pr(objectToInt(value));
			}
		});

		optionsMap.put("basic_quorum", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				return o.basicQuorum(objectToBoolean(value));
			}
		});

		optionsMap.put("notfound_ok", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				return o.notFoundOK(objectToBoolean(value));
			}
		});
		
//		optionsMap.put("head", new FetchOpt() {
//			public FetchObject<IRiakObject> setOption(
//					FetchObject<IRiakObject> o, Object value) {
//				return o.(objectToBoolean(value));
//			}
//		});
		
		optionsMap.put("deletedvclock", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				return o.returnDeletedVClock(objectToBoolean(value));
			}
		});
	}

	private FetchObject<IRiakObject> processOptions(RuntimeContext runtimeCtx, FetchObject<IRiakObject> o) {
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

	@Override
	public ResultSymbol exec(RuntimeContext runtimeCtx) {
		IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
		if(client != null) {
			if(this.bucket != null) {
				try {
					// TODO: optimize this to skip fetch/create bucket every time
					
					Bucket b = client.fetchBucket(this.bucket).execute();
					FetchObject<IRiakObject> fo = processOptions(runtimeCtx, b.fetch(key));

					//runtimeCtx.getActionListener().preFetchAction(fo);
					ResultSymbol sym = new ResultSymbol(fo.execute());
					if(sym.value != null) {
                        FetchActionParams.Post postParams = new FetchActionParams.Post();
                        postParams.bucket = this.bucket;
                        postParams.key = this.key;
                        postParams.options = this.options;
                        postParams.object = sym.value;
						runtimeCtx.getActionListener().postFetchAction(postParams);
						// basic output
						runtimeCtx.appendOutput(sym.toString());
						return sym;
					}
				} catch (RiakRetryFailedException e) {
					runtimeCtx.appendError("Can't store object in bucket", e);
				}
			} else {
				runtimeCtx.appendError("Bucket not selected to fetch from");
				return null;
			}
		}
		return null;
	}

}
