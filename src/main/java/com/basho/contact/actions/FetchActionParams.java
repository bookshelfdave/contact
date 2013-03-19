package com.basho.contact.actions;


import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;

import java.util.Map;

public class FetchActionParams {
    public static class Pre {
        // hmm, maybe pojos would be better here

        @JSObject(jsName = "bucket", returnValue = true)
        public String bucket;

        @JSObject(jsName = "key", returnValue = true)
        public String key;

        @JSObject(jsName = "options", returnValue = true)
        public Map<String, Object> options;

        @JSObject(jsName = "fetchObj", returnValue = true)
        public FetchObject<IRiakObject> fetchObj;
    }

    public static class Post {
        @JSObject(jsName = "bucket", returnValue = false)
        public String bucket;

        @JSObject(jsName = "key", returnValue = false)
        public String key;

        @JSObject(jsName = "options", returnValue = false)
        public Map<String, Object> options;

        @JSObject(jsName = "options", returnValue = false)
        IRiakObject object;
    }
}
