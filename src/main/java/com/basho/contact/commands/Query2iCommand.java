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

import com.basho.contact.BucketCommand;
import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.Query2iParams;
import com.basho.contact.symbols.Query2IResultsSymbol;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.query.indexes.BinIndex;
import com.basho.riak.client.query.indexes.FetchIndex;
import com.basho.riak.client.query.indexes.IntIndex;

public class Query2iCommand extends BucketCommand<Query2IResultsSymbol, Query2iParams.Pre> {

    public Query2iCommand() {
        super("query2i", Query2iParams.Pre.class);
    }

    @Override
    public Query2IResultsSymbol bucketExec(RuntimeContext runtimeCtx, IRiakClient client, String bucket) {
        try {
            // TODO: optimize this to skip fetch/create bucket every time
            Bucket b = client.fetchBucket(params.bucket).execute();

            FetchIndex<?> index = null;
            if (params.indexVal != null) {
                // 2i exact query
                // TODO: make grammar recognize valid 2i index names
                if (params.indexName.endsWith("_bin")) {
                    index = b.fetchIndex(BinIndex.named(params.indexName)).withValue(params.indexVal);
                } else if (params.indexName.endsWith("_int")) {
                    long val = 0;
                    try {
                        val = Long.parseLong(params.indexVal);
                    } catch (Exception e) {
                        throw new RuntimeException("Invalid 2i query exact value");
                    }
                    index = b.fetchIndex(IntIndex.named(params.indexName)).withValue(val);
                }

            } else if (params.min != null && params.max != null) {
                if (params.indexName.endsWith("_bin")) {
                    index = b.fetchIndex(BinIndex.named(params.indexName)).from(params.min).to(params.max);
                } else if (params.indexName.endsWith("_int")) {
                    long from = 0;
                    long to = 0;
                    try {
                        from = Long.parseLong(params.min);
                    } catch (Exception e) {
                        // shouldn't be a runtime exception
                        throw new RuntimeException(
                                "Invalid 2i query \"from\" parameter");
                    }
                    try {
                        to = Long.parseLong(params.max);
                    } catch (Exception e) {
                        // shouldn't be a runtime exception
                        throw new RuntimeException(
                                "Invalid 2i query \"to\" parameter");
                    }
                    index = b.fetchIndex(IntIndex.named(params.indexName))
                            .from(from)
                            .to(to);
                }
            } else {
                // these shouldn't be runtime exceptions
                throw new RuntimeException(
                        "Invalid 2i query parameters");
            }
            params.ctx = runtimeCtx;
            runtimeCtx.getActionListener().preQuery2iAction(params);
            Query2IResultsSymbol results = new Query2IResultsSymbol(index.execute());

            Query2iParams.Post postParams = new Query2iParams.Post();
            postParams.ctx = runtimeCtx;
            postParams.bucket = params.bucket;
            postParams.results = results.value;
            postParams.indexName = params.indexName;
            postParams.indexVal = params.indexVal;
            postParams.max = params.max;
            postParams.min = params.min;
            runtimeCtx.getActionListener().postQuery2iAction(postParams);
            return results;
        } catch (RiakException e) {
            runtimeCtx.appendError("Error executing 2i query", e);
        }

        return null;
    }


}
