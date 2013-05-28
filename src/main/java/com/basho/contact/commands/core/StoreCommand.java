/*
 * -------------------------------------------------------------------
 * Contact: a language and interactive shell for Riak
 *
 * Copyright (c) 2013 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.basho.contact.commands.core;

import com.basho.contact.*;
import com.basho.contact.commands.core.params.StoreParams;
import com.basho.contact.parser.Content;
import com.basho.contact.parser.Pair;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.builders.RiakObjectBuilder;
import com.basho.riak.client.cap.*;
import com.basho.riak.client.convert.ConversionException;
import com.basho.riak.client.convert.Converter;
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
            }
        }
        return builder;
    }


    @Override
    protected ResultSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            RiakObjectBuilder builder =
                    RiakObjectBuilder
                            .newBuilder(params.bucket, params.key);
            if(params.content.getContentType() == Content.ContentType.USER_DEFINED) {
                builder = builder.withContentType(params.content.getUserDefinedContentType());
            } else {
                builder = builder.withContentType(params.content.getContentType().toString());
            }

            builder = builder.withValue(params.content.getValue());
            builder = addIndexes(builder);

            IRiakObject obj = builder.build();

            // TODO: cache this
            Bucket b = conn.fetchBucket(params.bucket).execute();

            StoreObject<IRiakObject> so = processOptions(runtimeCtx, b.store(obj));

            if(b.getAllowSiblings()) {
//                so.withResolver(new ConflictResolver<IRiakObject>() {
//                    @Override
//                    public IRiakObject resolve(Collection<IRiakObject> siblings) {
//                        if (siblings.size() > 1) {
//                            return siblings.iterator().next();
//                        } else if (siblings.size() == 1) {
//                            return siblings.iterator().next();
//                        } else {
//                            return null;
//                        }
//
//                    }
//                });
                so.withResolver(runtimeCtx.getActionListener().getResolverMill().getResolverForBucket(bucket));
                so.withConverter(new Converter<IRiakObject>() {
                    @Override
                    public IRiakObject fromDomain(IRiakObject domainObject, VClock vclock) throws ConversionException {
                        return domainObject;
                    }

                    @Override
                    public IRiakObject toDomain(IRiakObject riakObject) throws ConversionException {
                        return riakObject;
                    }
                });
            }
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
            runtimeCtx.appendError("Can't store object in bucket", e);
            return null;
        }
    }

    private boolean returnBody() {
        if(params.options.containsKey("return_body")) {
            return CommandUtils.objectToBoolean(params.options.get("return_body"));
        } else {
            return false;
        }
    }
}
