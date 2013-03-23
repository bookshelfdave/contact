package com.basho.contact.actions;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.basho.contact.commands.params.*;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.basho.contact.RuntimeContext;

public class JSActionListener implements ContactActionListener {

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
	private String postFetchBody = "if(riak_object != undefined) { out.println(riak_object.getValueAsString()); }";
	private String preFetchBody = "";
	private String preStoreBody = "";
	private String postStoreBody = "if(riak_object != undefined) { out.println(riak_object.getValueAsString()); }";
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
	private String postGetBucketProps = "";
	private String preConnectBody = "";
	private String postConnectBody = "out.println('Connected to Riak @ ' + riak_host + ':' + riak_pb_port);";
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

    private void wrapObjectWithAnnotations(Object o) {
        Field[] fields = o.getClass().getFields();
        for(Field f: fields) {
            if(f.isAnnotationPresent(Binding.class)) {
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
    public void preFetchAction(FetchParams.Pre params) {
		evalWithParams(params, POSTFETCH);
    }

    public void postFetchAction(FetchParams.Post params) {
        evalWithParams(params, POSTFETCH);
    }

    public void preConnectAction(ConnectParams.Pre params) {
        evalWithParams(params, PRECONNECT);
    }
    public void postConnectAction(ConnectParams.Post params) {
        evalWithParams(params, POSTCONNECT);
    }

    public void preStoreAction(StoreParams.Pre params) {
		evalWithParams(params, PRESTORE);
	}

	public void postStoreAction(StoreParams.Post params) {
		evalWithParams(params, POSTSTORE);
	}

	public void preDeleteAction(DeleteParams.Pre params) {
		evalWithParams(params, PREDELETE);
	}

	public void postDeleteAction(DeleteParams.Post params) {
        evalWithParams(params, POSTDELETE);
	}

	public void preQuery2iAction(Query2iParams.Pre params) {
		evalWithParams(params, PREQUERY2I);
	}

	public void postQuery2iAction(Query2iParams.Post params) {
		evalWithParams(params, POSTQUERY2I);
	}

	public void preMapredAction(MapRedParams.Pre params) {

	}

	public void postMapredAction(MapRedParams.Post params) {
	}

	public void preListBucketsAction(ListBucketsParams.Pre params) {
		evalWithParams(params, PRELISTBUCKETS);
	}

	public void postListBucketsAction(ListBucketsParams.Post params) {
        evalWithParams(params, POSTLISTBUCKETS);
	}

	public void preListKeysAction(ListKeysParams.Pre params) {
		evalWithParams(params, PRELISTKEYS);
	}

	public void postListKeysAction(ListKeysParams.Post params) {
		evalWithParams(params, POSTLISTKEYS);
	}

	public void preGetBucketPropsAction(GetBucketPropsParams.Pre params) {
		evalWithParams(params, PREGETBUCKETPROPS);
	}

	public void postGetBucketPropsAction(GetBucketPropsParams.Post params) {
		evalWithParams(params, POSTGETBUCKETPROPS);
	}


}
