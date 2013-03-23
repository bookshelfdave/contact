package com.basho.contact.commands.params;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;

public class FetchParams {
    public static class Pre extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "fetchObj")
        public FetchObject<IRiakObject> fetchObj;
    }

    public static class Post extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "riak_object")
        public IRiakObject object;
    }
}
