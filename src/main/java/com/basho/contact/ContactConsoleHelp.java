package com.basho.contact;

import java.io.PrintStream;

public class ContactConsoleHelp {
    PrintStream out;

    public ContactConsoleHelp(PrintStream out) {
        this.out = out;
    }

    public void displayGeneralHelp() {
        out.println("For a list of commands, type:");
        out.println("  help commands");
        out.println("");
        out.println("For help on an individual command, type:");
        out.println("  help <commandname>");

    }

    public void displayHelpForCommand(String command) {
        out.println("Help for command " + command.trim() + " not implemented");
    }

    public void displayCommands() {
        out.println("  connect");
        out.println("  fetch");
        out.println("  store");
        out.println("  delete");
        out.println("  query2i");
        out.println("  list keys ***Don't use on a production system!");
        out.println("  list buckets ***Don't use on a production system!");
        out.println("  set");
        out.println("  get");
    }

    public void help(String line) {
        String[] chunks = line.split(" ");
        if (chunks.length == 1) {
            displayGeneralHelp();
        } else if (chunks[1].trim().equalsIgnoreCase("commands")) {
            displayCommands();
        } else {
            displayHelpForCommand(chunks[1]);
        }
    }
}
