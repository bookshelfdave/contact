/*
 * -------------------------------------------------------------------
 * Contact: a language and interactive shell for Riak
 *
 * Copyright (c) 2013 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

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
