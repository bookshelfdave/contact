package com.basho.contact;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.actions.JSActionListener;
import com.basho.contact.symbols.ContactSymbol;

public class RuntimeContext {

	// these might make more sense in the ContactWalker
	private List<Throwable> errors = new ArrayList<Throwable>();
	
	ContactConnectionProvider connections = null;

	private Map<String, ContactSymbol<?>> bindings = new HashMap<String, ContactSymbol<?>>();
	
	public ContactSymbol<?> lastResult = null;
	public NonSymbolOutput lastOutput = null; // for commands that don't return
												// a symbol,
												// but still need to display
												// text (ie show)

	private StringBuilder output = new StringBuilder();
	private String currentBucket = null;
    private ContactActionListener listener = null;

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
		errors.clear();
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
}
