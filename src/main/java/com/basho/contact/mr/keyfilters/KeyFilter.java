package com.basho.contact.mr.keyfilters;

public class KeyFilter {

    public enum KeyFilterType {
        KF_STRING,
        KF_INT,
        KF_BOOLEAN,
        KF_ANY,
        KF_ANY_LIST
    }

    ;

    KeyFilterType[] inputTypes;
    int[] optionalArgs = null;
    String name;

    public KeyFilter(String name, KeyFilterType... inputs) {
        this.name = name;
        this.inputTypes = inputs;
    }

    public KeyFilterType[] getInputTypes() {
        return inputTypes;
    }

    public String getName() {
        return name;
    }

    public int[] getOptionalArgs() {
        return optionalArgs;
    }

    public void setOptionalArgs(int args[]) {
        optionalArgs = args;
    }

    public void setInputTypes(KeyFilterType[] inputTypes) {
        this.inputTypes = inputTypes;
    }

    public void setName(String name) {
        this.name = name;
    }


}
