package com.basho.contact.commands;

import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.GetBucketPropsParams;
import com.basho.contact.symbols.ResultSymbol;

public class GetBucketPropsCommand extends RiakCommand<ResultSymbol, GetBucketPropsParams.Pre> {

    public GetBucketPropsCommand() {
        super(GetBucketPropsParams.Pre.class);
    }

    @Override
    public ResultSymbol exec(RuntimeContext runtimeCtx) {
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
        return null;
    }
}
