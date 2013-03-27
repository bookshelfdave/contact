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

package com.basho.contact;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.symbols.ContactSymbol;
import com.basho.riak.client.IRiakClient;

public abstract class BucketCommand<K extends ContactSymbol<?>, O extends ActionParams> extends RiakCommand<K, O> {
    private String name = "";

    public BucketCommand(String name, Class<O> c) {
        super(c);
        this.name = name;
    }

    public abstract K bucketExec(RuntimeContext runtimeCtx, IRiakClient client, String bucket);

    @Override
    public K exec(RuntimeContext runtimeCtx) {
        IRiakClient client = runtimeCtx.getConnectionProvider().getDefaultClient(runtimeCtx);
        if (client != null) {
            if (this.params.bucket != null) {
                K val = null;
                try {
                    val = bucketExec(runtimeCtx, client, this.params.bucket);
                } catch (Exception e) {
                    // should be taken care of in the command
                    // famous last words...
                }

            } else {
                runtimeCtx.appendError("Bucket not selected for " + name + " op.");
                return null;
            }
        } else {
            runtimeCtx.appendError("Not connected to Riak for " + name + " op.");
        }
        return null;
    }
}
