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

import com.basho.contact.commands.*;
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

    static abstract class SetBucketPropsOpt extends CommandOption<WriteBucket> {}

    private static CommandOptions<WriteBucket, SetBucketPropsOpt> commandOptions =
            new CommandOptions<WriteBucket, SetBucketPropsOpt>();

    static {
        commandOptions.addOption("n_val", new SetBucketPropsOpt() {
            @Override
            public WriteBucket setOption(WriteBucket o, Object value) throws Exception {
                return o.nVal(CommandUtils.objectToInt(value));
            }
        });
        commandOptions.addOption("allow_siblings", new SetBucketPropsOpt() {
            @Override
            public WriteBucket setOption(WriteBucket o, Object value) throws Exception {
                return o.allowSiblings(CommandUtils.objectToBoolean(value));
            }
        });
    }


    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        //System.out.println("Set bucket props for bucket " + bucket + params.options);

        if(params.options != null && params.options.size() > 0) {
            for(String key : params.options.keySet()) {
                try {
                    WriteBucket b = conn.createBucket(bucket);
                    b = commandOptions.processOptions(runtimeCtx, b, params);
                    b.execute();
                } catch (RiakRetryFailedException e) {
                    runtimeCtx.appendError(e);
                } catch (InvalidOptionValueException e) {
                    runtimeCtx.appendError(e);
                }
            }
        }
        return null;
    }
}
