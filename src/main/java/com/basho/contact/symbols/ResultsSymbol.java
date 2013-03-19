package com.basho.contact.symbols;

import java.util.List;

public class ResultsSymbol extends ContactSymbol<List<?>> {
	public ResultsSymbol(List<?> v) {
		this.value = v;
		this.type = ContactSymbol.SymbolType.RESULTS;
	}
	
	public String toString() {
		StringBuilder buf = new StringBuilder();
		boolean nl = true;
		for(Object o : value) {
			if(!nl) {
				buf.append("\n");
			}
			buf.append(o);
			nl= false;
		}
		return buf.toString();
	}

}
