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
import com.basho.contact.commands.core.StoreCommand;
import com.basho.contact.security.DefaultAccessPolicy;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.bucket.FetchBucket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public abstract class AbstractBucketCommandTest {
    public abstract BucketCommand<?,?> getCommand();
    public abstract String getCommandName();

    @Test
    public void testNoConnections() {
        BucketCommand<?,?> command = getCommand();
        ContactConnectionProvider connProvider = new EmptyConnectionProvider();

        RuntimeContext ctx = new RuntimeContext(connProvider, null, null);
        command.doExec(ctx);
        assertEquals(1, ctx.getErrors().size());
        assertEquals("Not connected to Riak", ctx.getErrors().get(0).getMessage());
    }

    @Test
    public void testNoBucket() {
        BucketCommand<?,?> command = getCommand();
        ContactConnectionProvider connProvider = new EmptyConnectionProvider() {
            @Override
            public IRiakClient getDefaultClient(RuntimeContext ctx) {
                IRiakClient client = mock(IRiakClient.class);
                FetchBucket fb = mock(FetchBucket.class);
                when(client.fetchBucket(anyString())).thenReturn(fb);
                return client;
            }
        };
        command.params.bucket = null;
        RuntimeContext ctx = mock(RuntimeContext.class);
        doCallRealMethod().when(ctx).reset();
        doCallRealMethod().when(ctx).appendError(anyString());
        doCallRealMethod().when(ctx).getErrors();
        ContactExecutor exec = new ContactExecutor();
        when(ctx.getExecutor()).thenReturn(exec);
        when(ctx.getAccessPolicy()).thenReturn(new DefaultAccessPolicy());
        when(ctx.getConnectionProvider()).thenReturn(connProvider);
        ctx.reset(); // instantiate the error list

        command.doExec(ctx);
        assertEquals(1,ctx.getErrors().size());
        assertEquals("Bucket not selected for " + getCommandName() + " op.",
                ctx.getErrors().get(0).getMessage());
    }
}
