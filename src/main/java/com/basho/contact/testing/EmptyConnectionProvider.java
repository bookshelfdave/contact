package com.basho.contact.testing;


import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.riak.client.IRiakClient;

public class EmptyConnectionProvider implements ContactConnectionProvider {
    public IRiakClient getDefaultClient(RuntimeContext ctx) {
        return null;
    }

    public IRiakClient getClientByName(String name, RuntimeContext ctx) {
        return null;
    }

    public IRiakClient createDefaultConnection(String host, int port, RuntimeContext ctx) {
        return null;
    }

    public IRiakClient createNamedConnection(String host, int port, String name, RuntimeContext ctx) {
        return null;
    }
}
