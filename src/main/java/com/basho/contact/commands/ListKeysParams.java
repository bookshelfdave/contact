package com.basho.contact.commands;

import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;

import java.util.List;

public class ListKeysParams {
    public static class Pre extends ActionParams {
    }

    public static class Post extends ActionParams {
        @Binding(name = "keys")
        public List<String> keys;
    }
}
