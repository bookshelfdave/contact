package com.basho.contact.actions;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.basho.contact.RuntimeContext;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;
import com.basho.riak.client.operations.StoreObject;
import com.basho.riak.client.query.indexes.FetchIndex;

public class JSActionListener implements ContactActionListener {

	/* IRiakObject
     * getKey,numLinks,hashCode,wait,getUsermeta,getIntIndex,removeIntIndex,addIndex,
     * removeUsermeta,setContentType,notifyAll,iterator,equals,hasUsermeta,getVClock,
     * addLink,getVtag,removeLink,toString,getValue,getContentType,userMetaEntries,
     * addUsermeta,notify,hasLinks,allIntIndexesV2,getIntIndexV2,getClass,getBinIndex,
     * getValueAsString,getMeta,setValue,getVClockAsString,getLinks,allBinIndexes,
     * getBucket,allIntIndexes,removeBinIndex,hasLink,getLastModified
     */
    
	//    String body = "var methods = []; " +
	//    			  " for (var m in obj) { " +
	//    			  " if (typeof obj[m] == \"function\") { " +
	//    			  " methods.push(m); " +
	//				  " } " +
	//				  "} out.println(methods.join(','));";
	    
	
	public static String PREFETCH = "prefetch";
	public static String POSTFETCH = "postfetch";
	public static String PRESTORE = "prestore";
	public static String POSTSTORE = "poststore";
	public static String PREDELETE = "predelete";
	public static String POSTDELETE = "postdelete";
	public static String PREQUERY2I = "prequery2i";
	public static String POSTQUERY2I = "postquery2i";
	public static String PREMAPRED = "premapred";
	public static String POSTMAPRED = "postmapred";
	public static String PRELISTBUCKETS = "prelistbuckets";
	public static String POSTLISTBUCKETS = "postlistbuckets";
	public static String PRELISTKEYS = "prelistkeys";
	public static String POSTLISTKEYS = "postlistkeys";
	public static String PREGETBUCKETPROPS = "pregetbucketprops";
	public static String POSTGETBUCKETPROPS = "postgetbucketprops";
	public static String PRECONNECT = "preconnect";
	public static String POSTCONNECT = "postconnect";
	Context jsctx = null;
	Scriptable jsscope = null;
	// skip getters and setters, they are just taking up space
	private String postFetchBody = "if(obj != undefined) { out.println(bucket + ':' + key + '=' + obj.getValueAsString()); }";
	private String preFetchBody = "";
	private String preStoreBody = "";
	private String postStoreBody = "if(obj != undefined) { out.println(obj.getValueAsString()); }";
	private String preDeleteBody = "";
	private String postDeleteBody = "";
	private String preQuery2iBody = "";
	private String postQuery2iBody = "if(results != undefined) { out.println(results); }";
	private String preMapredBody = "";
	private String postMapredBody = "";
	private String preListBucketsBody = "";
	private String postListBucketsBody = "out.println(buckets);";
	private String preListKeysBody = "";
	private String postListKeysBody = "for(var i = 0; i < keys.size(); i++) { out.println(keys.get(i)); }";
	private String preGetBucketProps = "";
	private String postGetBucketProps = "out.println(props);";
	private String preConnectBody = "";
	private String postConnectBody = "out.println('Connected to Riak @ ' + riak_host + ':' + riak_port);";
	private RuntimeContext runtimeCtx = null;
	private Map<String, String> js = new HashMap<String,String>();
	
	
	
	public JSActionListener(RuntimeContext ctx, PrintStream out, PrintStream err) {
		this.runtimeCtx = ctx;
		setupDefaults();
		jsctx = Context.enter();
		jsscope = jsctx.initStandardObjects();
		Object wrappedOut = Context.javaToJS(out, jsscope);
		ScriptableObject.putProperty(jsscope, "out", wrappedOut);

		Object wrappedErr = Context.javaToJS(err, jsscope);
		ScriptableObject.putProperty(jsscope, "err", wrappedErr);		
	}

	private void setupDefaults() {
		js.put(PREFETCH, preFetchBody);
		js.put(POSTFETCH, postFetchBody);
		js.put(PRESTORE, preStoreBody);
		js.put(POSTSTORE, postStoreBody);
		js.put(PREDELETE, preDeleteBody);
		js.put(POSTDELETE, postDeleteBody);
		js.put(PREQUERY2I, preQuery2iBody);
		js.put(POSTQUERY2I, postQuery2iBody);
		js.put(PREMAPRED, preMapredBody);
		js.put(POSTMAPRED, postMapredBody);
		js.put(PRELISTBUCKETS, preListBucketsBody);
		js.put(POSTLISTBUCKETS, postListBucketsBody);
		js.put(PRELISTKEYS, preListKeysBody);
		js.put(POSTLISTKEYS, postListKeysBody);
		js.put(PREGETBUCKETPROPS, preGetBucketProps);
		js.put(POSTGETBUCKETPROPS, postGetBucketProps);
		js.put(PRECONNECT, preConnectBody);
		js.put(POSTCONNECT, postConnectBody);
	}
	
	public void setJSBody(String name, String body) {
		if(js.containsKey(name)) {
			js.put(name, body);
		} else {
			runtimeCtx.appendError("Trying to set a body for an invalid action:" + name);
		}
	}
	
	public String getJSBody(String name) {
		if(js.containsKey(name)) {
			return js.get(name);
		} else {
			runtimeCtx.appendError("Trying to get a body for an invalid action:" + name);
			return "";
		}
	}
	
	public Set<String> getAvailableActions() {
		return js.keySet();
	}
	
	public void init() {
		
	}
		
	public void term() {
		Context.exit();
	}

	private void wrapObject(Object o, String name) {
		Object wrappedObj = Context.javaToJS(o, jsscope);
		ScriptableObject.putProperty(jsscope, name, wrappedObj);
	}

	private void evalWithParams(Object params, String commandName) {
        wrapObjectWithAnnotations(params);
		// TODO: introduce a scope (via a function?) to contain objects
		// so we don't leak!
		try {
			String body = js.get(commandName);
			if(body != null && !body.isEmpty()) {
				jsctx.evaluateString(jsscope, body, commandName, 1, null);
			}
		} catch (Exception e) {
			runtimeCtx.appendError("Error processing Javascript:" + e.getMessage());
		}
	}

    private void eval(String commandName) {
        // TODO: introduce a scope (via a function?) to contain objects
        // so we don't leak!
        try {
            String body = js.get(commandName);
            if(body != null && !body.isEmpty()) {
                jsctx.evaluateString(jsscope, body, commandName, 1, null);
            }
        } catch (Exception e) {
            runtimeCtx.appendError("Error processing Javascript:" + e.getMessage());
        }
    }

    private void wrapObjectWithAnnotations(Object o) {
        Field[] fields = o.getClass().getFields();
        for(Field f: fields) {
            if(f.isAnnotationPresent(Binding.class)) {
                //System.out.println("Found " + f.getName());
                Binding b = f.getAnnotation(Binding.class);
                String boundName = b.name();
                try {
                    Object fieldValue = f.get(o);
                    Object wrappedObj = Context.javaToJS(fieldValue, jsscope);
                    ScriptableObject.putProperty(jsscope, boundName, wrappedObj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public FetchActionParams.Pre preFetchAction(FetchActionParams.Pre params) {
		evalWithParams(params, POSTFETCH);
        return null;
    }

    public FetchActionParams.Post postFetchAction(FetchActionParams.Post params) {
        evalWithParams(params, POSTFETCH);
        return null;
    }

    public void preStoreAction(StoreObject<IRiakObject> storeObj) {
		wrapObject(storeObj, "storeObj");
		eval(PRESTORE);
	}

	public void postStoreAction(IRiakObject obj) {
		wrapObject(obj, "obj");
		eval(POSTSTORE);
	}

	public void preDeleteAction() {
		//wrapObject(obj, "obj");
		eval(PREDELETE);
	}

	public void postDeleteAction(IRiakObject obj) {
		//wrapObject(obj, "obj");
		eval(POSTDELETE);
	}

	public void preQuery2iAction(FetchIndex<?> index) {
		//wrapObject(obj, "obj");
		eval(PREQUERY2I);
	}

	public void postQuery2iAction(List<?> data) {
		wrapObject(data, "results");
		eval(POSTQUERY2I);
	}

	public void preMapredAction() {

	}

	public void postMapredAction() {
	}

	public void preListBucketsAction() {
		//wrapObject(data, "objects");
		eval(PRELISTBUCKETS);
	}

	public void postListBucketsAction(Set<String> buckets) {
		wrapObject(buckets, "buckets");
		eval(POSTLISTBUCKETS);
	}

	public void preListKeysAction(String bucket) {
		wrapObject(bucket, "bucket");
		eval(PRELISTKEYS);
	}

	public void postListKeysAction(List<String> keys) {
		wrapObject(keys, "keys");
		eval(POSTLISTKEYS);
	}

	public void preGetBucketPropsAction(String bucket) {
		wrapObject(bucket, "bucket");
		eval(PREGETBUCKETPROPS);
	}

	public void postGetBucketPropsAction(Map<String, Object> props) {
		wrapObject(props, "props");
		eval(POSTGETBUCKETPROPS);		
	}

	public void preConnectAction(String host, String port) {
		wrapObject(host, "riak_host");
		wrapObject(port, "riak_port");		
		eval(PRECONNECT);
	}

	public void postConnectAction(String host, String port, IRiakClient client) {
		wrapObject(host, "riak_host");
		wrapObject(port, "riak_port");
		wrapObject(client, "riak_client");
		eval(POSTCONNECT);
	}
}
