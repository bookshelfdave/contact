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

package com.basho.contact.testing;


import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.commands.params.*;

public class EmptyActionListener implements ContactActionListener {
    public void init() {
    }

    public void term() {
    }

    @Override
    public void preConnectAction(ConnectParams.Pre params) {
    }

    @Override
    public void postConnectAction(ConnectParams.Post params) {
    }

    @Override
    public void preFetchAction(FetchParams.Pre params) {
    }

    @Override
    public void postFetchAction(FetchParams.Post params) {
    }

    @Override
    public void preStoreAction(StoreParams.Pre params) {
    }

    @Override
    public void postStoreAction(StoreParams.Post params) {
    }

    @Override
    public void preDeleteAction(DeleteParams.Pre params) {
    }

    @Override
    public void postDeleteAction(DeleteParams.Post params) {
    }

    @Override
    public void preQuery2iAction(Query2iParams.Pre params) {
    }

    @Override
    public void postQuery2iAction(Query2iParams.Post params) {
    }

    @Override
    public void preMapredAction(MapRedParams.Pre params) {
    }

    @Override
    public void postMapredAction(MapRedParams.Post params) {
    }

    @Override
    public void preListBucketsAction(ListBucketsParams.Pre params) {
    }

    @Override
    public void postListBucketsAction(ListBucketsParams.Post params) {
    }

    @Override
    public void preListKeysAction(ListKeysParams.Pre params) {
    }

    @Override
    public void postListKeysAction(ListKeysParams.Post params) {
    }

    @Override
    public void preGetBucketPropsAction(GetBucketPropsParams.Pre params) {
    }

    @Override
    public void postGetBucketPropsAction(GetBucketPropsParams.Post params) {
    }

    @Override
    public void loadScript(String filename) {

    }

    @Override
    public void evalScript(String script) {

    }

    @Override
    public void preConnections(ConnectionsParams.Pre params) {

    }

    @Override
    public void postConnections(ConnectionsParams.Post params) {

    }

    @Override
    public void preCountKeys(CountKeysParams.Pre params) {

    }

    @Override
    public void postCountKeys(CountKeysParams.Post params) {

    }

    @Override
    public void preGetBucket(GetBucketParams.Pre params) {

    }

    @Override
    public void postGetBucket(GetBucketParams.Post params) {

    }

    @Override
    public void preSetBucketPropsAction(SetBucketPropsParams.Pre params) {

    }

    @Override
    public void postSetBucketPropsAction(SetBucketPropsParams.Post params) {

    }
}
