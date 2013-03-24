package com.basho.contact.symbols;

import com.basho.riak.client.IRiakObject;

public class ResultSymbol extends ContactSymbol<IRiakObject> {
    public ResultSymbol(IRiakObject v) {
        this.value = v;
        this.type = ContactSymbol.SymbolType.RESULT;
    }

    public String toString() {
        if (value != null) {
            return this.value.getValueAsString();
        } else {
            return "";
        }

    }
}
