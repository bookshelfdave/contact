package com.basho.contact.symbols;


import java.util.Set;

public class StringSetSymbol extends ContactSymbol<Set<String>>{

    public StringSetSymbol(Set<String> s) {
        this.value = s;
    }

}
