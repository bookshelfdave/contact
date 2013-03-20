package com.basho.contact.actions;


import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;

import java.lang.reflect.Field;
import java.util.Map;

public class FetchActionParams {
    public static class Pre {
        @Binding(name = "bucket")
        public String bucket;

        @Binding(name = "key")
        public String key;

        @Binding(name = "options")
        public Map<String, Object> options;

        @Binding(name = "fetchObj")
        public FetchObject<IRiakObject> fetchObj;
    }

    public static class Post {
        @Binding(name = "bucket")
        public String bucket;

        @Binding(name = "key")
        public String key;

        @Binding(name = "options")
        public Map<String, Object> options;

        @Binding(name = "obj")
        public IRiakObject object;
    }



//    public static void main(String args[]) {
//        FetchActionParams.Pre p = new FetchActionParams.Pre();
//        p.bucket = "foo";
//        p.key = "bar";
//        wrapObjectWithAnnotations(p);
//    }
}
