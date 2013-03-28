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
import com.basho.contact.commands.params.GetBucketPropsParams;
import com.basho.contact.symbols.ResultSymbol;
import com.basho.riak.client.IRiakClient;

public class GetBucketPropsCommand extends BucketCommand<ResultSymbol, GetBucketPropsParams.Pre> {

    public GetBucketPropsCommand() {
        super("get bucket properties", GetBucketPropsParams.Pre.class);
    }

    @Override
    protected ResultSymbol bucketExec(RuntimeContext runtimeCtx, IRiakClient client, String bucket) {
        return null;
    }
//    @Override
//    public ResultSymbol exec(RuntimeContext runtimeCtx) {
//		IRiakClient httpClient = runtimeCtx.getNextHTTPClient();
//		if(httpClient != null) {
//			if(this.bucket != null) {
//				try {
//					Bucket b = httpClient.fetchBucket(bucket).execute();
//					runtimeCtx.getNotifier().preGetBucketPropsAction(bucket);
//					Map<String, Object> props = new HashMap<String, Object>();
//					props.put("allow_siblings", b.getAllowSiblings());
//					props.put("backend", b.getBackend());
//					props.put("basic_quorum", b.getBasicQuorum());
//					props.put("dw", b.getDW().getIntValue());
//					props.put("last_write_wins", b.getLastWriteWins());
//					props.put("name", b.getName());
//					props.put("not_found_ok",b.getNotFoundOK());
//					props.put("n_val",b.getNVal());
//					props.put("pr",b.getPR());
//					props.put("pw",b.getPW());
//					props.put("r",b.getR());
//					props.put("rw",b.getRW());
//					props.put("search",b.getSearch());
//					props.put("small_vclock",b.getSmallVClock());
//					props.put("w",b.getW());
//					props.put("young_vclock",b.getYoungVClock());
//					props.put("old_vclock",b.getOldVClock());
//
//					List<String> postCommitHooks = new ArrayList<String>();
//					if(b.getPostcommitHooks() != null) {
//						for(NamedErlangFunction f : b.getPostcommitHooks()) {
//							postCommitHooks.add(f.getMod() + ":" + f.getFun());
//						}
//					}
//					props.put("post_commit_hooks", postCommitHooks);
//
//					//TODO: look into why one is NamedErlangFunction and the other is just NamedFunction
//					List<String> preCommitHooks = new ArrayList<String>();
//					if(b.getPrecommitHooks() != null) {
//						for(NamedFunction f : b.getPrecommitHooks()) {
//							preCommitHooks.add(f.toString());
//						}
//					}
//					props.put("pre_commit_hooks",preCommitHooks);
//
//					runtimeCtx.getNotifier().postGetBucketPropsAction(props);
//
//				} catch (RiakRetryFailedException e) {
//					runtimeCtx.appendError("Error fetching bucket properties for " + bucket + ":" + e.getMessage());
//				}
//			}
//		}
//        return null;
//    }
}
