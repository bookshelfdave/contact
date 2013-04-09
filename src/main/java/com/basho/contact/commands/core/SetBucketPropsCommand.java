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
import com.basho.contact.commands.core.params.SetBucketPropsParams;
import com.basho.contact.symbols.VoidSymbol;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.WriteBucket;

import java.util.HashMap;
import java.util.Map;

public class SetBucketPropsCommand extends BucketCommand<VoidSymbol, SetBucketPropsParams.Pre> {

    public SetBucketPropsCommand() {
        super("set bucket properties", SetBucketPropsParams.Pre.class);
    }

    static abstract class SetBucketProp {
        public abstract WriteBucket setProp(
                WriteBucket o, Object value);
    }


    private static Map<String, SetBucketProp> propsMap = new HashMap<String, SetBucketProp>();

    static {
        propsMap.put("n_val", new SetBucketProp() {
            @Override
            public WriteBucket setProp(WriteBucket o, Object value) {
                return o.nVal(CommandUtils.objectToInt(value));
            }
        });
        propsMap.put("allow_siblings", new SetBucketProp() {
            @Override
            public WriteBucket setProp(WriteBucket o, Object value) {
                return o.allowSiblings(CommandUtils.objectToBoolean(value));
            }
        });
    }

    private WriteBucket processOptions(RuntimeContext runtimeCtx, WriteBucket o) {
        if (params.options != null) {
            for (String key : params.options.keySet()) {
                Object val = params.options.get(key);
                if (!propsMap.containsKey(key)) {
                    runtimeCtx.appendError("Unknown bucket property:" + key);
                } else {
                    o = propsMap.get(key).setProp(o, val);
                }
            }
            return o;
        } else {
            return o;
        }
    }


    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        //System.out.println("Set bucket props for bucket " + bucket + params.options);

        if(params.options != null && params.options.size() > 0) {
            for(String key : params.options.keySet()) {
                WriteBucket b = conn.createBucket(bucket);

                b = processOptions(runtimeCtx, b);
                try {
                    b.execute();
                } catch (RiakRetryFailedException e) {
                    runtimeCtx.appendError(e);
                }
            }
        }
        return null;
    }
}
