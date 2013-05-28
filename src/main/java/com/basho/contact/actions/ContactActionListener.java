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

package com.basho.contact.actions;

import com.basho.contact.commands.core.params.*;

public interface ContactActionListener {
    public void init();

    public void term();

    public void preConnectAction(ConnectParams.Pre params);

    public void postConnectAction(ConnectParams.Post params);

    public void preFetchAction(FetchParams.Pre params);

    public void postFetchAction(FetchParams.Post params);

    public void preStoreAction(StoreParams.Pre params);

    public void postStoreAction(StoreParams.Post params);

    public void preDeleteAction(DeleteParams.Pre params);

    public void postDeleteAction(DeleteParams.Post params);

    public void preQuery2iAction(Query2iParams.Pre params);

    public void postQuery2iAction(Query2iParams.Post params);

    public void preMapredAction(MapRedParams.Pre params);

    public void postMapredAction(MapRedParams.Post params);

    public void preListBucketsAction(ListBucketsParams.Pre params);

    public void postListBucketsAction(ListBucketsParams.Post params);

    public void preListKeysAction(ListKeysParams.Pre params);

    public void postListKeysAction(ListKeysParams.Post params);

    public void preGetBucketPropsAction(GetBucketPropsParams.Pre params);

    public void postGetBucketPropsAction(GetBucketPropsParams.Post params);

    public void preSetBucketPropsAction(SetBucketPropsParams.Pre params);

    public void postSetBucketPropsAction(SetBucketPropsParams.Post params);

    public void loadScript(String filename);

    public void evalScript(String script);

    public void preConnections(ConnectionsParams.Pre params);

    public void postConnections(ConnectionsParams.Post params);

    public void preCountKeys(CountKeysParams.Pre params);

    public void postCountKeys(CountKeysParams.Post params);

    public void preGetBucket(GetBucketParams.Pre params);

    public void postGetBucket(GetBucketParams.Post params);

    public ContactConflictResolverMill getResolverMill();
}
