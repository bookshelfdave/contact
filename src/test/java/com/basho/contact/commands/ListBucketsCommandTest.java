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

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.commands.params.ListBucketsParams;
import com.basho.contact.security.DefaultAccessPolicy;
import com.basho.contact.symbols.StringSetSymbol;
import com.basho.contact.testing.EmptyActionListener;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListBucketsCommandTest {
    ListBucketsParams.Post postParams;

    @Test
    public void testListBuckets() {
        postParams = new ListBucketsParams.Post();
        ListBucketsCommand command = new ListBucketsCommand();
        RuntimeContext ctx = mock(RuntimeContext.class);
        final Set<String> buckets = new HashSet<String>();

        ContactActionListener listener = new EmptyActionListener() {

            @Override
            public void preListBucketsAction(ListBucketsParams.Pre params) {
            }

            @Override
            public void postListBucketsAction(ListBucketsParams.Post params) {
                postParams = params;
            }
        };

        buckets.add("A");
        buckets.add("B");
        buckets.add("C");
        ContactConnectionProvider connProvider = new EmptyConnectionProvider() {
            @Override
            public IRiakClient getDefaultClient(RuntimeContext ctx) {
                IRiakClient client = mock(IRiakClient.class);
                try {
                    when(client.listBuckets()).thenReturn(buckets);
                } catch (RiakException re) {
                    re.printStackTrace();;
                }
                return client;
            }
        };
        when(ctx.getActionListener()).thenReturn(listener);
        when(ctx.getConnectionProvider()).thenReturn(connProvider);
        when(ctx.getAccessPolicy()).thenReturn(new DefaultAccessPolicy());
        StringSetSymbol results = command.doExec(ctx);
        assertEquals(postParams.buckets, buckets);
        assertEquals(buckets, results.value);
    }
}
