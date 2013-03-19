package com.basho.contact.actions;

import java.util.Collection;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.basho.contact.RuntimeContext;
import com.basho.riak.client.cap.ConflictResolver;

public class JSConflictResolver implements ConflictResolver<Object> {

	Context jsctx = null;
	Scriptable jsscope = null;
	private RuntimeContext runtimeCtx = null;

	String body = "return objects.get(0);";
	
	public JSConflictResolver(RuntimeContext ctx) {
		this.runtimeCtx = ctx;
		jsctx = Context.enter();
		jsscope = jsctx.initStandardObjects();
		Object wrappedOut = Context.javaToJS(System.out, jsscope);
		ScriptableObject.putProperty(jsscope, "out", wrappedOut);

		Object wrappedErr = Context.javaToJS(System.err, jsscope);
		ScriptableObject.putProperty(jsscope, "err", wrappedErr);
	}
	
	private void wrapObject(Object o, String name) {
		Object wrappedObj = Context.javaToJS(o, jsscope);
		ScriptableObject.putProperty(jsscope, name, wrappedObj);
	}

	private Object eval() {
		// TODO: introduce a scope (via a function?) to contain objects
		// so we don't leak!
		Object result = null;
		try {
			if(body != null && !body.isEmpty()) {
				result = jsctx.evaluateString(jsscope, body, "<riak_conflict_resolver>", 1, null);
			}
		} catch (Exception e) {
			runtimeCtx.appendError("Error processing Javascript:" + e.getMessage());
		}
		return result;
	}

	
	@Override
	public Object resolve(Collection<Object> objects) {
		wrapObject(objects, "objects");
		return eval();
	}

}
