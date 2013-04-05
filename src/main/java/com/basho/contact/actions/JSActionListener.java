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

import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.*;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.cap.ConflictResolver;
import com.basho.riak.client.cap.UnresolvedConflictException;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JSActionListener implements ContactActionListener, ContactConflictResolverMill {

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
    public static String PRESETBUCKETPROPS = "presetbucketprops";
    public static String POSTSETBUCKETPROPS = "postsetbucketprops";

    public static String PRECONNECT = "preconnect";
    public static String POSTCONNECT = "postconnect";
    public static String PRECONNECTIONS = "preconnections";
    public static String POSTCONNECTIONS = "postconnections";
    public static String PRECOUNTKEYS = "precountkeys";
    public static String POSTCOUNTKEYS = "postcountkeys";
    public static String PREGETBUCKET = "pregetbucket";
    public static String POSTGETBUCKET = "postgetbucket";


    Scriptable jsscope = null;

    private RuntimeContext runtimeCtx = null;
    private Map<String, String> js = new HashMap<String, String>();
    private Map<String, ConflictResolver<IRiakObject>> resolversByBucket = new HashMap<String, ConflictResolver<IRiakObject>>();
    static int resolverid = 0;

    ConflictResolver<IRiakObject> defaultResolver;

    public JSActionListener(RuntimeContext ctx, PrintStream out, PrintStream err) {
        this.runtimeCtx = ctx;
        setupDefaults();
        Context cx = Context.enter();
        jsscope = cx.initStandardObjects();
        Object wrappedOut = Context.javaToJS(out, jsscope);
        ScriptableObject.putProperty(jsscope, "out", wrappedOut);

        Object wrappedErr = Context.javaToJS(err, jsscope);
        ScriptableObject.putProperty(jsscope, "err", wrappedErr);
        defaultResolver = new ConflictResolver<IRiakObject>() {
            @Override
            public IRiakObject resolve(Collection<IRiakObject> siblings) {
                if (siblings.size() > 1) {
                    JSActionListener.this.runtimeCtx.appendError("Siblings detected, resolving with first sibling");
                    return siblings.iterator().next();
                } else if (siblings.size() == 1) {
                    return siblings.iterator().next();
                } else {
                    return null;
                }
            }
        };

        // setup some default objects
        evalScript("var print = function(s) { out.print(s); };");
        evalScript("var println = function(s) { out.println(s); };");
        Context.exit();
    }

    private void setupDefaults() {
        js.put(PREFETCH, "");
        js.put(POSTFETCH, "if(riak_object != undefined) { println(riak_object.getValueAsString()); }");
        js.put(PRESTORE, "");
        js.put(POSTSTORE, "if(riak_object != undefined) { println(riak_object.getValueAsString()); }");
        js.put(PREDELETE, "");
        js.put(POSTDELETE, "");
        js.put(PREQUERY2I, "");
        js.put(POSTQUERY2I, "if(results != undefined && doFetch == false) { println(results); }");
        js.put(PREMAPRED, "");
        js.put(POSTMAPRED, "");
        js.put(PRELISTBUCKETS, "");
        js.put(POSTLISTBUCKETS, "println(buckets);");
        js.put(PRELISTKEYS, "");
        js.put(POSTLISTKEYS, "for(var i = 0; i < keys.size(); i++) { println(keys.get(i)); }");
        js.put(PREGETBUCKETPROPS, "");
        js.put(POSTGETBUCKETPROPS, "if(bucket_props != undefined) { println(bucket_props); }");

        js.put(PRESETBUCKETPROPS, "");
        js.put(POSTSETBUCKETPROPS, "");

        js.put(PRECONNECT, "");
        js.put(POSTCONNECT, "println('Connecting to Riak @ ' + riak_host + ':' + riak_pb_port);");
        js.put(PRECONNECTIONS, "");
        js.put(POSTCONNECTIONS, "println('Connections'); println(connections);");
        js.put(PRECONNECTIONS, "");
        js.put(POSTCONNECTIONS, "println('Connections'); println(connections);");
        js.put(PRECOUNTKEYS, "println('Counting keys for ' + bucket + '...');");
        js.put(POSTCOUNTKEYS, "println('Bucket ' + bucket + ' contains ' + keycount + ' keys');");
        js.put(PREGETBUCKET, "");
        js.put(POSTGETBUCKET, "println(bucket);");
    }

    public void setJSBody(String name, String body) {
        if (js.containsKey(name)) {
            js.put(name, body);
        } else {
            runtimeCtx.appendError("Trying to set a body for an invalid action:" + name);
        }
    }

    public String getJSBody(String name) {
        if (js.containsKey(name)) {
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

    }

    private void evalWithParams(Object params, String commandName) {
        wrapObjectWithAnnotations(params);

        // TODO: introduce a scope (via a function?) to contain objects
        // so we don't leak!

        try {
            String body = js.get(commandName);
            if (body != null && !body.isEmpty()) {
                Context localContext = Context.enter();
                localContext.evaluateString(jsscope, body, commandName, 1, null);
                Context.exit();
            }
        } catch (Exception e) {
            runtimeCtx.appendError("Error processing Javascript:" + e.getMessage());
        }
    }

    private void wrapObjectWithAnnotations(Object o) {
        try {
            Context.enter();
            Field[] fields = o.getClass().getFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(Binding.class)) {
                    Binding b = f.getAnnotation(Binding.class);
                    String boundName = b.name();
                    try {
                        //System.out.println("Binding " + boundName);
                        Object fieldValue = f.get(o);
                        Object wrappedObj = Context.javaToJS(fieldValue, jsscope);
                        ScriptableObject.putProperty(jsscope, boundName, wrappedObj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } finally {
            Context.exit();
        }
    }

    @Override
    public void preFetchAction(FetchParams.Pre params) {
        evalWithParams(params, PREFETCH);
    }

    @Override
    public void postFetchAction(FetchParams.Post params) {
        evalWithParams(params, POSTFETCH);
    }

    @Override
    public void preConnectAction(ConnectParams.Pre params) {
        evalWithParams(params, PRECONNECT);
    }

    @Override
    public void postConnectAction(ConnectParams.Post params) {
        evalWithParams(params, POSTCONNECT);
    }

    @Override
    public void preStoreAction(StoreParams.Pre params) {
        evalWithParams(params, PRESTORE);
    }

    @Override
    public void postStoreAction(StoreParams.Post params) {
        evalWithParams(params, POSTSTORE);
    }

    @Override
    public void preDeleteAction(DeleteParams.Pre params) {
        evalWithParams(params, PREDELETE);
    }

    @Override
    public void postDeleteAction(DeleteParams.Post params) {
        evalWithParams(params, POSTDELETE);
    }

    @Override
    public void preQuery2iAction(Query2iParams.Pre params) {
        evalWithParams(params, PREQUERY2I);
    }

    @Override
    public void postQuery2iAction(Query2iParams.Post params) {
        evalWithParams(params, POSTQUERY2I);
    }

    @Override
    public void preMapredAction(MapRedParams.Pre params) {

    }

    @Override
    public void postMapredAction(MapRedParams.Post params) {
    }

    @Override
    public void preListBucketsAction(ListBucketsParams.Pre params) {
        evalWithParams(params, PRELISTBUCKETS);
    }

    @Override
    public void postListBucketsAction(ListBucketsParams.Post params) {
        evalWithParams(params, POSTLISTBUCKETS);
    }

    @Override
    public void preListKeysAction(ListKeysParams.Pre params) {
        evalWithParams(params, PRELISTKEYS);
    }

    @Override
    public void postListKeysAction(ListKeysParams.Post params) {
        evalWithParams(params, POSTLISTKEYS);
    }

    @Override
    public void preGetBucketPropsAction(GetBucketPropsParams.Pre params) {
        evalWithParams(params, PREGETBUCKETPROPS);
    }

    @Override
    public void postGetBucketPropsAction(GetBucketPropsParams.Post params) {
        evalWithParams(params, POSTGETBUCKETPROPS);
    }

    public void loadScript(String filename) {
        File f = new File(filename);
        if(f.exists()) {
            try {
                String content = org.apache.commons.io.FileUtils.readFileToString(f);
                Context cx = Context.enter();
                cx.evaluateString(jsscope, content, "<script: " + filename + ">", 1, null);
            } catch (IOException e) {
                // TODO: report these to the runtimeCtx?
                System.err.println("Error loading script: " + e.getMessage());
            } finally {
                Context.exit();
            }
        } else {
            // TODO: report these to the runtimeCtx?
            System.err.println("Error loading script: Script file " + filename + " does not exist");
        }
    }

    public void evalScript(String script) {
        Context cx = Context.enter();

        try {
            cx.evaluateString(jsscope, script, "<contact_script>", 1, null);
        } catch (Exception e) {
            runtimeCtx.appendError(e);
        } finally {
            Context.exit();
        }
    }

    public Object evalResolverScript(Collection<IRiakObject> siblings, String script, String fnname) {
        Context cx = Context.enter();
        Object wrappedObj = Context.javaToJS(siblings, jsscope);
        ScriptableObject.putProperty(jsscope, "siblings", wrappedObj);
        Object result = null;
        try {
            cx.evaluateString(jsscope, script, "<js_resolver>", 1, null);
            Object fObj = jsscope.get(fnname, jsscope);
            Object functionArgs[] = { wrappedObj };
            Function f = (Function)fObj;
            result = f.call(cx, jsscope, jsscope, functionArgs);
            result = Context.jsToJava(result,IRiakObject.class);
        } catch (Exception e) {
            runtimeCtx.appendError(e);
        } finally {
            Context.exit();
        }
        return result;
    }

    @Override
    public void preConnections(ConnectionsParams.Pre params) {
        evalWithParams(params, PRECONNECTIONS);
    }

    @Override
    public void postConnections(ConnectionsParams.Post params) {
        evalWithParams(params, POSTCONNECTIONS);
    }

    @Override
    public void preCountKeys(CountKeysParams.Pre params) {
        evalWithParams(params, PRECOUNTKEYS);
    }

    @Override
    public void postCountKeys(CountKeysParams.Post params) {
        evalWithParams(params, POSTCOUNTKEYS);
    }

    @Override
    public void preGetBucket(GetBucketParams.Pre params) {
        evalWithParams(params, PREGETBUCKET);
    }

    @Override
    public void postGetBucket(GetBucketParams.Post params) {
        evalWithParams(params, POSTGETBUCKET);
    }

    @Override
    public void preSetBucketPropsAction(SetBucketPropsParams.Pre params) {
        evalWithParams(params, PRESETBUCKETPROPS);
    }

    @Override
    public void postSetBucketPropsAction(SetBucketPropsParams.Post params) {
        evalWithParams(params, POSTSETBUCKETPROPS);
    }

    @Override
    public ConflictResolver<IRiakObject> getResolverForBucket(String bucket) {
        if(resolversByBucket.containsKey(bucket)) {
            return resolversByBucket.get(bucket);
        } else {
            return defaultResolver;
        }
    }

    @Override
    public void defineResolver(String bucket, String body) {
        final String fnname = "resolver_" + (resolverid++);
        final String jsBody = "var " + fnname + " = " + body;
        ConflictResolver<IRiakObject> resolver = new ConflictResolver<IRiakObject>() {
            @Override
            public IRiakObject resolve(Collection<IRiakObject> siblings) {
                Object result = null;
                try {
                    result = evalResolverScript(siblings, jsBody, fnname);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    JSActionListener.this.runtimeCtx.appendError(e);
                }
                return (IRiakObject)result;
            }
        };

        resolversByBucket.put(bucket, resolver);
    }

    @Override
    public ContactConflictResolverMill getResolverMill() {
        return this;
    }

    @Override
    public void clearResolver(String bucket) {
         resolversByBucket.remove(bucket);
    }
}
