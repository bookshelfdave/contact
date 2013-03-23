package com.basho.contact.commands.params;

import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;

import java.util.Set;


public class ListBucketsParams {
    public static class Pre extends ActionParams {

    }

    public static class Post extends ActionParams {
        @Binding(name = "buckets")
        public Set<String> buckets = null;
    }
}
