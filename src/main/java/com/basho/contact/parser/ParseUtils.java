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

package com.basho.contact.parser;


import org.junit.Test;

import static org.junit.Assert.*;

public class ParseUtils {
    public static String getDataContent(String content) {
        if(content.startsWith("~%~\n")) {
            content=content.substring(4);
        } else {
            content=content.substring(3);
        }
        if(content.endsWith("\n~%~")) {
            content=content.substring(0, content.length() - 4);
        }  else {
            content=content.substring(0, content.length() - 3);
        }
        if(content.contains("\\~%~")) {
             content = content.replaceAll("\\\\~%~","~%~");
        }
        return content;
    }

    public static String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            String v = rawVal.substring(1, rawVal.length() - 1);
            if(v.contains("\\\"")) {
                v = v.replaceAll("\\\\\"","\"");
            }
            return v;
        }
    }

    @Test
    public void testStripQuotes() {
        // TODO: edge cases
        //assertEquals("this is \"a test\"", stripQuotes("\"this is \"a test\"\""));
        String orig ="\"{\\\"Foo\\\":1}\"";
        System.out.println(orig);
        assertEquals("{\"Foo\":1}",stripQuotes(orig));
    }

    @Test
    public void testDataContent() {
        assertEquals("This is a test", getDataContent("~%~This is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test\n~%~"));
        assertEquals("This is a ~%~test~%~", getDataContent("~%~This is a \\~%~test\\~%~~%~"));
    }

}
