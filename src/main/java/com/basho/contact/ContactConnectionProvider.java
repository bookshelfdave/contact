package com.basho.contact;

import com.basho.riak.client.IRiakClient;

public interface ContactConnectionProvider {
	
	public IRiakClient getDefaultClient(RuntimeContext ctx);
	public IRiakClient getClientByName(String name, RuntimeContext ctx);
	
	public IRiakClient createDefaultConnection(String host, int port, RuntimeContext ctx);
	public IRiakClient createNamedConnection(String host, int port, String name, RuntimeContext ctx);
}
