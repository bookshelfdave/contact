package com.basho.contact.commands.params;

import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.operations.DeleteObject;

public class DeleteParams {
    public static class Pre extends ActionParams {
        @Binding(name = "key")
        public String key;

        @Binding(name = "deleteObject")
        public DeleteObject deleteObject;
    }

    public static class Post extends ActionParams {
        @Binding(name = "key")
        public String key;

    }
}
