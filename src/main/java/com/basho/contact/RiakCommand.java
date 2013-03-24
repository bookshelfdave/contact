package com.basho.contact;

import com.basho.contact.actions.ActionParams;
import com.basho.contact.symbols.ContactSymbol;

public abstract class RiakCommand<K extends ContactSymbol<?>, O extends ActionParams> {
    public O params;
    private Class<O> clazz;

    public abstract K exec(RuntimeContext ctx);

    public RiakCommand(Class<O> c) {
        clazz = c;
        try {
            params = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
