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

package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.ListBucketsParams;
import com.basho.contact.symbols.StringSetSymbol;
import com.basho.riak.client.RiakException;

import java.util.Set;

public class ListBucketsCommand extends RiakCommand<StringSetSymbol, ListBucketsParams.Pre> {

    public ListBucketsCommand() {
        super(ListBucketsParams.Pre.class);
    }

    @Override
    public StringSetSymbol exec(RuntimeContext runtimeCtx) {
        try {
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preListBucketsAction(params);
            Set<String> buckets = (Set<String>) runtimeCtx.getConnectionProvider().
                    getDefaultClient(runtimeCtx).listBuckets();
            ListBucketsParams.Post postParams = new ListBucketsParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.buckets = buckets;
            runtimeCtx.getActionListener().postListBucketsAction(postParams);
            StringSetSymbol result = new StringSetSymbol(buckets);
            return result;
        } catch (RiakException e) {
            e.printStackTrace();
        }

        return null;
    }
}
