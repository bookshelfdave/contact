package com.basho.contact.actions;

import com.basho.contact.Content;
import com.basho.contact.RuntimeContext;

import java.util.Map;

public class ActionParams {
    @Binding(name = "bucket", copy=true)
    public String bucket = null;

    @Binding(name="options", copy=true)
    public Map<String, Object> options = null;

    @Binding(name="contact", copy=true)
    public RuntimeContext ctx;

}
