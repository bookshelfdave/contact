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


import org.junit.Test;

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
        return content;
    }

    @Test
    public void testDataContent() {
        org.junit.Assert.assertEquals("This is a test", getDataContent("~%~This is a test~%~"));
        org.junit.Assert.assertEquals("This is a test",getDataContent("~%~\nThis is a test~%~"));
        org.junit.Assert.assertEquals("This is a test",getDataContent("~%~\nThis is a test~%~"));
        org.junit.Assert.assertEquals("This is a test",getDataContent("~%~\nThis is a test\n~%~"));
    }

}
