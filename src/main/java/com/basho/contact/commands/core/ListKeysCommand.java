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
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.ListKeysParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;

import java.util.ArrayList;
import java.util.List;

public class ListKeysCommand extends BucketCommand<ResultSymbol, ListKeysParams.Pre> {

    public ListKeysCommand() {
        super("list keys", ListKeysParams.Pre.class);
    }

    @Override
    protected ResultSymbol bucketExec(RuntimeContext runtimeCtx, String bucket) {
        try {
            // TODO: optimize this to skip fetch/create bucket every time
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preListKeysAction(params);

            Bucket b = conn.fetchBucket(params.bucket).execute();
            List<String> keys = new ArrayList<String>();
            // DO I need a copy here? Seems like it
            for (String k : b.keys()) {
                keys.add(k);
            }
            ListKeysParams.Post postParams = new ListKeysParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.keys = keys;
            postParams.bucket = params.bucket;
            runtimeCtx.getActionListener().postListKeysAction(postParams);
            return null;
        } catch (RiakException e) {
            runtimeCtx.appendError("Can't list keys in bucket", e);
        }

        return null;
    }

}
