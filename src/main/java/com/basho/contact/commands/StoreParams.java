package com.basho.contact.commands;

import com.basho.contact.Content;
import com.basho.contact.Pair;
import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.IRiakObject;

import java.util.List;


public class StoreParams {
    public static class Pre extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "indexes")
        public List<Pair> indexes = null;

        @Binding(name = "content")
        public Content content;
    }

    public static class Post extends ActionParams {
        @Binding(name = "riak_object")
        public IRiakObject object;
    }
}
