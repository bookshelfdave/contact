package com.basho.contact.symbols;

import java.util.List;

public class Query2IResultsSymbol extends ContactSymbol<List<?>> {
    public Query2IResultsSymbol(List<?> v) {
        this.value = v;
        this.type = ContactSymbol.SymbolType.QUERY2IRESULTS;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        boolean nl = true;
        for (Object o : value) {
            if (!nl) {
                buf.append("\n");
            }
            buf.append(o);
            nl = false;
        }
        return buf.toString();
    }

}
