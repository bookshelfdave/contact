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

package com.basho.contact;

import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.actions.JSActionListener;
import com.basho.contact.symbols.ContactSymbol;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuntimeContext {

    private List<Throwable> errors = new ArrayList<Throwable>();
    private boolean parseError = false;

    ContactConnectionProvider connections = null;

    private Map<String, ContactSymbol<?>> bindings = new HashMap<String, ContactSymbol<?>>();

    public ContactSymbol<?> lastResult = null;
    // TODO: do I still need this?
    public NonSymbolOutput lastOutput = null; // for commands that don't return
                                              // a symbol,
                                              // but still need to display
                                              // text (ie show)

    private StringBuilder output = new StringBuilder();
    private ContactActionListener listener = null;

    // use bucket "Foo" sets this value.
    // TODO: change it to a Bucket object
    private String currentBucket = null;
    private Map<String, String> currentFetchOptions = new HashMap<String, String>();
    private Map<String, String> currentStoreOptions = new HashMap<String, String>();
    private Map<String, String> currentDeleteOptions = new HashMap<String, String>();
    private Map<String, String> currentQuery2iOptions = new HashMap<String, String>();

    public boolean trace = false;


    // this always needs to be instantiated
    JSActionListener jsActionListener;

    public RuntimeContext(ContactConnectionProvider connections, PrintStream out, PrintStream err) {
        this.connections = connections;
        jsActionListener = new JSActionListener(this, out, err);
        this.listener = jsActionListener;
    }

    public ContactConnectionProvider getConnectionProvider() {
        return connections;
    }

    // the jsActionListener should always be instantiated
    public JSActionListener getJSActionListener() {
        return jsActionListener;
    }

    public ContactActionListener getActionListener() {
        return listener;
    }

    public void reset() {
        output = new StringBuilder();
        errors = new ArrayList<Throwable>();
        parseError = false;
    }

    public boolean isParseError() {
        return parseError;
    }

    public void setParseError(boolean parseError) {
        this.parseError = parseError;
    }

    public void appendOutput(String line) {
        output.append(line);
        output.append("\n");
    }

    public String getOutput() {
        return output.toString();
    }

    public void appendError(String msg, Throwable e) {
        errors.add(new Exception(msg, e));
    }

    public void appendError(Throwable e) {
        errors.add(e);
    }

    public void appendError(String e) {
        errors.add(new Exception(e));
    }

    public List<Throwable> getErrors() {
        return errors;
    }

    public void bind(String name, ContactSymbol<?> sym) {
        // System.out.println("Binding " + name + " to " + sym);
        bindings.put(name, sym);
    }

    public ContactSymbol<?> getBinding(String name,
                                       ContactSymbol.SymbolType expectedType) {
        if (bindings.containsKey(name)) {
            ContactSymbol<?> sym = bindings.get(name);
            if (sym.type == expectedType) {
                return sym;
            } else {
                appendError("Type mismatch");
                return null;
            }
        } else {
            appendError("Unknown binding " + name);
            return null;
        }
    }

    public String getCurrentBucket() {
        return currentBucket;
    }

    public void setCurrentBucket(String currentBucket) {
        this.currentBucket = currentBucket;
    }

    public Map<String, String> getCurrentFetchOptions() {
        return currentFetchOptions;
    }

    public void setCurrentFetchOptions(Map<String, String> currentFetchOptions) {
        this.currentFetchOptions = currentFetchOptions;
    }

    public Map<String, String> getCurrentStoreOptions() {
        return currentStoreOptions;
    }

    public void setCurrentStoreOptions(Map<String, String> currentStoreOptions) {
        this.currentStoreOptions = currentStoreOptions;
    }

    public Map<String, String> getCurrentDeleteOptions() {
        return currentDeleteOptions;
    }

    public void setCurrentDeleteOptions(Map<String, String> currentDeleteOptions) {
        this.currentDeleteOptions = currentDeleteOptions;
    }

    public Map<String, String> getCurrentQuery2iOptions() {
        return currentQuery2iOptions;
    }

    public void setCurrentQuery2iOptions(Map<String, String> currentQuery2iOptions) {
        this.currentQuery2iOptions = currentQuery2iOptions;
    }
}
