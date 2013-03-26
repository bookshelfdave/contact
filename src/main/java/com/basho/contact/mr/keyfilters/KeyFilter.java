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
