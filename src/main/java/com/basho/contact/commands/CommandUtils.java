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

package com.basho.contact.commands;

public class CommandUtils {

    // TODO: don't throw a runtime exception here
    public static int objectToInt(Object o) throws Exception {
        if (o instanceof String) {
            return Integer.parseInt((String) o);
        } else if (o instanceof Integer) {
            return ((Integer) o).intValue();
        } else {
            throw new Exception("Invalid option value " + o);
        }
    }

    // TODO: don't throw a runtime exception here
    public static boolean objectToBoolean(Object o) throws Exception {
        if (o instanceof String) {
            return Boolean.parseBoolean((String) o);
        } else if (o instanceof Boolean) {
            return ((Boolean) o).booleanValue();
        } else {
            throw new Exception("Invalid option value " + o);
        }
    }

}
