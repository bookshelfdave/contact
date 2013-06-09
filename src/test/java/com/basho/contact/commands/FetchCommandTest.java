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
import com.basho.contact.commands.core.params.FetchParams;
import com.basho.contact.security.DefaultAccessPolicy;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.bucket.FetchBucket;
import com.basho.riak.client.operations.FetchObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class FetchCommandTest extends AbstractBucketCommandTest {
    @Override
    public BucketCommand<?, ?> getCommand() {
        return new FetchCommand();
    }

    @Override
    public String getCommandName() {
        return "fetch";
    }

    @Test
    public void testParams() {
        FetchCommand command = new FetchCommand();
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

        FetchObject<IRiakObject> fetchObject = new FetchObject<IRiakObject>(null, null, null, null) {
            @Override
            public FetchObject<IRiakObject> r(int r) {
                results.put("r", r);
                return this;
            }

            @Override
            public FetchObject<IRiakObject> pr(int pr) {
                results.put("pr", pr);
                return this;
            }

            @Override
            public FetchObject<IRiakObject> basicQuorum(boolean basicQuorum) {
                results.put("basic_quorum", basicQuorum);
                return this;
            }

            @Override
            public FetchObject<IRiakObject> returnDeletedVClock(boolean returnDeletedVClock) {
                results.put("deletedvclock", returnDeletedVClock);
                return this;

            }

            @Override
            public FetchObject<IRiakObject> notFoundOK(boolean notFoundOK) {
                results.put("notfound_ok", notFoundOK);
                return this;
            }

            @Override
            public FetchObject<IRiakObject> headOnly() {
                results.put("head", true);
                return this;
            }
        };

        command.params.bucket = "Foo";
        command.params.key    = "Bar";
        Map<String, String> options = new HashMap<String, String>();

        options.put("r", "10");
        options.put("pr", "2");
        options.put("basic_quorum", "true");
        options.put("notfound_ok", "false");
        options.put("deletedvclock", "true");
        options.put("head", "true");

        command.params.options = options;
        command.processOptions(ctx, fetchObject);

        assertEquals(10, results.get("r"));
        assertEquals(2, results.get("pr"));
        assertEquals(true, results.get("basic_quorum"));
        assertEquals(false, results.get("notfound_ok"));
        assertEquals(true, results.get("deletedvclock"));
        assertEquals(true, results.get("head"));

    }
}

