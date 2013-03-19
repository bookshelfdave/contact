package com.basho.contact.actions;


import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;

import java.util.Map;

public class FetchActionParams {
    public static class Pre {
        public String bucket;
        public String key;
        public Map<String, Object> options;
        public FetchObject<IRiakObject> fetchObj;
    }

    public static class Post {
        public String bucket;
        public String key;
        public Map<String, Object> options;
        IRiakObject object;
    }
}
