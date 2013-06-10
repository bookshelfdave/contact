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
import com.basho.contact.commands.core.params.DeleteParams;
import com.basho.contact.symbols.VoidSymbol;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.operations.DeleteObject;
import com.basho.riak.client.operations.StoreObject;

import java.util.HashMap;
import java.util.Map;

public class DeleteCommand extends BucketCommand<VoidSymbol, DeleteParams.Pre> {

    public DeleteCommand() {
        super("delete", DeleteParams.Pre.class);
    }


    static abstract class DeleteOpt extends CommandOption<DeleteObject> {}

    private static CommandOptions<DeleteObject, DeleteOpt> commandOptions =
            new CommandOptions<DeleteObject, DeleteOpt>();

    static {

        /*
        optional uint32 rw = 3;
        optional bytes vclock = 4;
        optional uint32 r = 5;
        optional uint32 w = 6;
        optional uint32 pr = 7;
        optional uint32 pw = 8;
        optional uint32 dw = 9;
         */

        commandOptions.addOption("rw", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.rw(CommandUtils.objectToInt(value));
            }
        });

        commandOptions.addOption("r", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.r(CommandUtils.objectToInt(value));
            }
        });

        commandOptions.addOption("w", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.w(CommandUtils.objectToInt(value));
            }
        });

        commandOptions.addOption("pr", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.pr(CommandUtils.objectToInt(value));
            }
        });

        commandOptions.addOption("pw", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.pw(CommandUtils.objectToInt(value));
            }
        });

        commandOptions.addOption("dw", new DeleteOpt() {
            public DeleteObject setOption(
                    DeleteObject o, Object value) throws Exception {
                return o.dw(CommandUtils.objectToInt(value));
            }
        });

        // TODO: get vlock to work here
        //        optionsMap.put("vclock", new DeleteOpt() {
        //            public DeleteObject setOption(
        //                    DeleteObject o, Object value) {
        //                VClock
        //                return o.vclock(CommandUtils.objectToInt(value));
        //            }
        //        });
    }

    @Override
    protected VoidSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            // TODO: optimize this to skip fetch/create bucket every time
            Bucket b = conn.fetchBucket(this.params.bucket).execute();
            DeleteObject deleteObj = commandOptions.processOptions(runtimeCtx, b.delete(params.key), params);
            params.deleteObject = deleteObj;
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preDeleteAction(params);
            deleteObj.execute();
            VoidSymbol sym = new VoidSymbol();

            DeleteParams.Post postParams = new DeleteParams.Post();
            postParams.bucket = this.params.bucket;
            postParams.key = params.key;
            postParams.options = this.params.options;
            postParams.ctx = runtimeCtx;
            runtimeCtx.getActionListener().postDeleteAction(postParams);
            return sym;
        } catch (RiakException e) {
            runtimeCtx.appendError("Can't delete object", e);
        } catch (InvalidOptionValueException e) {
            runtimeCtx.appendError(e);
        }

        return null;
    }


}
