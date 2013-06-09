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

import com.basho.contact.ContactErrorListener;
import com.basho.contact.RuntimeContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class ContactParserTest {

    @Test
    public void testConnections() {
        try {
            String script = ContactParserTest.loadResource("connection.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testFetch() {
        try {
            String script = ContactParserTest.loadResource("fetch.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testStore() {
        try {
            String script = ContactParserTest.loadResource("store.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void testHereDoc() {
        try {
            String script = ContactParserTest.loadResource("here_doc.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testDelete() {
        try {
            String script = ContactParserTest.loadResource("delete.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testQuery() {
        try {
            String script = ContactParserTest.loadResource("query.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testResolver() {
        try {
            String script = ContactParserTest.loadResource("resolver.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void testMisc() {
        try {
            String script = ContactParserTest.loadResource("misc.test");
            testScript(script);
        } catch (Throwable e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    private void testScript(String script) throws Throwable {
        RuntimeContext ctx = new RuntimeContext(null, System.out, System.err);
        ANTLRInputStream input = new ANTLRInputStream(script);
        ContactLexer lexer = new ContactLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ContactParser parser = new ContactParser(tokens);
        // combine these two into one
        parser.addErrorListener(new ContactErrorListener(ctx));
        parser.prog();
    }

    public static String loadResource(String name) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(name);
        File f = new File(url.getPath());
        return org.apache.commons.io.FileUtils.readFileToString(f);
    }
}
