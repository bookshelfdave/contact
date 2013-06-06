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

import com.basho.contact.BucketCommand;
import com.basho.contact.CommandUtils;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.FetchParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.operations.FetchObject;

import java.util.HashMap;
import java.util.Map;

public class FetchCommand extends BucketCommand<ResultSymbol, FetchParams.Pre> {

    public FetchCommand() {
        super("fetch", FetchParams.Pre.class);
    }

    static abstract class FetchOpt {
        public abstract FetchObject<IRiakObject> setOption(
                FetchObject<IRiakObject> o, Object value);
    }

    private static Map<String, FetchOpt> optionsMap = new HashMap<String, FetchOpt>();


    static {
//	    optional bytes if_modified = 7;
//	    optional bool deletedvclock = 9;

        // TODO: I don't need objectToInt anymore if everything passed in is a string
        optionsMap.put("r", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) {
                return o.r(CommandUtils.objectToInt(value));
            }
        });
        optionsMap.put("pr", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) {
                return o.pr(CommandUtils.objectToInt(value));
            }
        });
        optionsMap.put("basic_quorum", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) {
                return o.basicQuorum(CommandUtils.objectToBoolean(value));
            }
        });
        optionsMap.put("notfound_ok", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) {
                return o.notFoundOK(CommandUtils.objectToBoolean(value));
            }
        });
		optionsMap.put("head", new FetchOpt() {
			public FetchObject<IRiakObject> setOption(
					FetchObject<IRiakObject> o, Object value) {
				if(CommandUtils.objectToBoolean(value)) {
                    return o.headOnly();
                } else {
                    return o;
                }
			}
		});
        optionsMap.put("deletedvclock", new FetchOpt() {
            public FetchObject<IRiakObject> setOption(
                    FetchObject<IRiakObject> o, Object value) {
                return o.returnDeletedVClock(CommandUtils.objectToBoolean(value));
            }
        });
    }

    public FetchObject<IRiakObject> processOptions(RuntimeContext runtimeCtx, FetchObject<IRiakObject> o) {
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

    @Override
    protected ResultSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            // TODO: optimize this to skip fetch/create bucket every time
            Bucket b = conn.fetchBucket(this.params.bucket).execute();
            FetchObject<IRiakObject> fo = processOptions(runtimeCtx, b.fetch(params.key));
            if(b.getAllowSiblings()) {
                fo = fo.withResolver(runtimeCtx.getActionListener().getResolverMill().getResolverForBucket(bucket));

            }
            params.fetchObj = fo;
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preFetchAction(params);

            ResultSymbol sym = new ResultSymbol(fo.execute());

            FetchParams.Post postParams = new FetchParams.Post();
            postParams.bucket = this.params.bucket;
            postParams.key = params.key;
            postParams.options = this.params.options;
            postParams.object = sym.value;
            postParams.ctx = runtimeCtx;
            runtimeCtx.getActionListener().postFetchAction(postParams);
            return sym;

        } catch (RiakRetryFailedException e) {
            runtimeCtx.appendError("Can't store object in bucket", e);
        }
        return null;
    }


}
