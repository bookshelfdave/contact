package com.basho.contact.symbols;

public class ContactSymbol<V> {
	public enum SymbolType {
		STRING,
		INT,
		CONNECTION,
		RESULT,
		RESULTS,
		OPTIONSLIST,
		QUERY2IRESULTS,
	}
	
	public String name;
	public SymbolType type;
	public V value;
	public boolean displayed = false;
}
