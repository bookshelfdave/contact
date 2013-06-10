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

import com.basho.contact.BucketCommand;
import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.ContactExecutor;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.FetchCommand;
import com.basho.contact.commands.core.StoreCommand;
import com.basho.contact.security.DefaultAccessPolicy;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.bucket.FetchBucket;
import com.basho.riak.client.operations.StoreObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StoreCommandTest extends AbstractBucketCommandTest {
    @Override
    public BucketCommand<?, ?> getCommand() {
        return new StoreCommand();
    }

    @Override
    public String getCommandName() {
        return "store";
    }

    @Test
    public void testParams() {
        StoreCommand command = new StoreCommand();
        ContactConnectionProvider connProvider = new EmptyConnectionProvider() {
            @Override
            public IRiakClient getDefaultClient(RuntimeContext ctx) {
                IRiakClient client = mock(IRiakClient.class);
                FetchBucket fb = mock(FetchBucket.class);
                when(client.fetchBucket(anyString())).thenReturn(fb);
                return client;
            }
        };
        RuntimeContext ctx = mock(RuntimeContext.class);
        doCallRealMethod().when(ctx).reset();
        doCallRealMethod().when(ctx).appendError(anyString());
        doCallRealMethod().when(ctx).getErrors();
        when(ctx.getAccessPolicy()).thenReturn(new DefaultAccessPolicy());
        final Map<String, Object> results = new HashMap<String, Object>();

        StoreObject<IRiakObject> storeObject = new StoreObject<IRiakObject>(null, null, null, null) {
            @Override
            public StoreObject<IRiakObject> w(int w) {
                results.put("w", w);
                return this;
            }

            @Override
            public StoreObject<IRiakObject> pw(int pw) {
                results.put("pw", pw);
                return this;
            }

            @Override
            public StoreObject<IRiakObject> dw(int dw) {
                results.put("dw", dw);
                return this;
            }

            @Override
            public StoreObject<IRiakObject> returnBody(boolean returnBody) {
                results.put("return_body", returnBody);
                return this;
            }

            @Override
            public StoreObject<IRiakObject> ifNoneMatch(boolean ifNoneMatch) {
                results.put("if_none_match", ifNoneMatch);
                return this;
            }

            @Override
            public StoreObject<IRiakObject> ifNotModified(boolean ifNotModified) {
                results.put("if_not_modified", ifNotModified);
                return this;
            }
        };

        command.params.bucket = "Foo";
        command.params.key    = "Bar";
        Map<String, String> options = new HashMap<String, String>();

        options.put("w", "10");
        options.put("pw", "11");
        options.put("dw", "12");
        options.put("return_body", "true");
        options.put("if_not_modified", "false");
        options.put("if_none_match", "true");

        command.params.options = options;
        command.processOptions(ctx, storeObject);

        assertEquals(10, results.get("w"));
        assertEquals(11, results.get("pw"));
        assertEquals(12, results.get("dw"));
        assertEquals(true, results.get("return_body"));
        assertEquals(false, results.get("if_not_modified"));
        assertEquals(true, results.get("if_none_match"));
    }

}
