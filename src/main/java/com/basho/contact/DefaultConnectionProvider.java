package com.basho.contact;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakFactory;
import com.basho.riak.client.raw.pbc.PBClientConfig;

import java.util.HashMap;
import java.util.Map;

public class DefaultConnectionProvider implements ContactConnectionProvider {
    public static String DEFAULT_CONNECTION_NAME = "default";

    private Map<String, IRiakClient> pbclients = new HashMap<String, IRiakClient>();

    public IRiakClient getDefaultClient(RuntimeContext ctx) {
        return getClientByName(DEFAULT_CONNECTION_NAME, ctx);
    }

    public IRiakClient getClientByName(String name, RuntimeContext ctx) {
        // TODO: conn might not exist
        if (!pbclients.containsKey(name)) {
            ctx.appendError("Not connected to Riak with connection " + name);
        }
        return pbclients.get(name);
    }

    public IRiakClient createDefaultConnection(String host, int port, RuntimeContext ctx) {
        return createNamedConnection(host, port, DEFAULT_CONNECTION_NAME, ctx);
    }

    public IRiakClient createNamedConnection(String host, int pbport,
                                             String name, RuntimeContext ctx) {
        try {
            PBClientConfig pbconf = new PBClientConfig.Builder().withHost(host)
                    .withPort(pbport).build();
            IRiakClient riakClient = RiakFactory.newClient(pbconf);
            riakClient.ping();
            pbclients.put(name, riakClient);
            return riakClient;
        } catch (Exception e) {
            ctx.appendError("Error making pb connection to " + host + ":", e);
        }
        // the devil
        return null;
    }

}
