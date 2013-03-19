package com.basho.contact.symbols;

import com.basho.riak.client.IRiakClient;


public class ConnectionSymbol extends ContactSymbol<IRiakClient> {
	private String host = "";
	private int port = 0;
	
	public ConnectionSymbol(String host, int port) {
		this.type = ContactSymbol.SymbolType.CONNECTION;
		this.host = host;
		this.port = port;
	}
	
	public String toString() {
		return "<riak_connection " + this.host + ":" + this.port + ">";
	}
}
