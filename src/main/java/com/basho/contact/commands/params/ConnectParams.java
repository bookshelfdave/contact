package com.basho.contact.commands.params;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.IRiakClient;

public class ConnectParams {
    public static class Pre extends ActionParams {
        @Binding(name = "riak_host")
        public String host;

        @Binding(name = "riak_pb_port")
        public int pbPort;
    }

    public static class Post extends ActionParams {
        @Binding(name = "riak_host")
        public String host;
        @Binding(name = "riak_pb_port")
        public int pbPort;
        @Binding(name = "riak_client", javadoc = true)
        public IRiakClient client;
    }
}
