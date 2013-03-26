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
import com.basho.riak.client.cap.ConflictResolver;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import java.util.Collection;

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
            if (body != null && !body.isEmpty()) {
                result = jsctx.evaluateString(jsscope, body, "<riak_conflict_resolver>", 1, null);
            }
        } catch (Exception e) {
            runtimeCtx.appendError("Error processing Javascript:" + e.getMessage());
        }
        return result;
    }

    public Object resolve(Collection<Object> objects) {
        wrapObject(objects, "objects");
        return eval();
    }

}
