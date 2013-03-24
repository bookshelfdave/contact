package com.basho.contact;

// used for non-language console features (ie help, exit, etc)
public interface ConsoleCommand {
    public void run(String line);
}
