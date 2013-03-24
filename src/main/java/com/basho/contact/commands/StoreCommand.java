package com.basho.contact.commands;

import com.basho.contact.BucketCommand;
import com.basho.contact.CommandUtils;
import com.basho.contact.Pair;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.StoreParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.builders.RiakObjectBuilder;
import com.basho.riak.client.operations.StoreObject;

import java.util.HashMap;
import java.util.Map;

public class StoreCommand extends BucketCommand<ResultSymbol, StoreParams.Pre> {

    public StoreCommand() {
        super("store", StoreParams.Pre.class);
    }

    static abstract class StoreOpt {
        public abstract StoreObject<IRiakObject> setOption(
                StoreObject<IRiakObject> o, Object value);
    }

    private static Map<String, StoreOpt> optionsMap = new HashMap<String, StoreOpt>();

    static {
        optionsMap.put("w", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.w(CommandUtils.objectToInt(value));
            }
        });
        optionsMap.put("dw", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.dw(CommandUtils.objectToInt(value));
            }
        });
        optionsMap.put("pw", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.pw(CommandUtils.objectToInt(value));
            }
        });
        optionsMap.put("return_body", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.returnBody(CommandUtils.objectToBoolean(value));
            }
        });
        optionsMap.put("if_not_modified", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.ifNotModified(CommandUtils.objectToBoolean(value));
            }
        });
        optionsMap.put("if_none_match", new StoreOpt() {
            public StoreObject<IRiakObject> setOption(
                    StoreObject<IRiakObject> o, Object value) {
                return o.ifNoneMatch(CommandUtils.objectToBoolean(value));
            }
        });
    }


    private StoreObject<IRiakObject> processOptions(RuntimeContext runtimeCtx,
                                                    StoreObject<IRiakObject> o) {
        if (params.options != null) {
            for (String key : params.options.keySet()) {
                Object val = params.options.get(key);
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
        if (params.indexes != null) {
            for (Pair p : params.indexes) {
                if (p.getKey().endsWith("_bin")) {
                    builder = builder.addIndex(p.getKey(), p.getValue().toString());
                } else if (p.getKey().endsWith("_int")) {
                    // TODO: watch for errors here
                    builder = builder.addIndex(p.getKey(), Long.parseLong(p.getValue().toString()));
                }
                System.out.println(p);
            }
        }
        return builder;
    }


    @Override
    public ResultSymbol bucketExec(RuntimeContext runtimeCtx, IRiakClient client, String bucket) {
        try {
            RiakObjectBuilder builder =
                    RiakObjectBuilder
                            .newBuilder(params.bucket, params.key)
                            .withContentType(params.content.getContentType().toString())
                            .withValue(params.content.getValue());
            builder = addIndexes(builder);
            IRiakObject obj = builder.build();
            // TODO: cache this
            Bucket b = client.fetchBucket(params.bucket).execute();
            StoreObject<IRiakObject> so = processOptions(runtimeCtx,
                    b.store(obj));
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preStoreAction(params);
            ResultSymbol result = new ResultSymbol(so.execute());
            StoreParams.Post postParams = new StoreParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.object = result.value;
            runtimeCtx.getActionListener().postStoreAction(postParams);
            // TODO: return_body should check for true
//					if (params.options != null && params.options.containsKey("return_body")) {
//						// TODO: move to JS
//						runtimeCtx.appendOutput(result.toString());
//					}
            return result;
        } catch (RiakRetryFailedException e) {
            e.printStackTrace();
            runtimeCtx.appendError("Can't store object in bucket", e);
            return null;
        }
    }
}
