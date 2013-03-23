package com.basho.contact.commands;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;

import java.util.List;

public class Query2iParams {
    public static class Pre extends ActionParams {
        @Binding(name = "index_name")
        public String indexName;

        @Binding(name = "index_val")
        public String indexVal;

        @Binding(name = "index_min")
        public String min;

        @Binding(name = "index_max")
        public String max;
    }

    public static class Post extends ActionParams {
        @Binding(name = "index_name")
        public String indexName;

        @Binding(name = "index_val")
        public String indexVal;

        @Binding(name = "index_min")
        public String min;

        @Binding(name = "index_max")
        public String max;

        @Binding(name = "results")
        public List<?> results;
    }
}
