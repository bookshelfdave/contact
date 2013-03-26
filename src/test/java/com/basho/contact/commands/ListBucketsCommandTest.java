package com.basho.contact.commands;

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.commands.params.ListBucketsParams;
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
        StringSetSymbol results = command.exec(ctx);
        assertEquals(postParams.buckets, buckets);
        assertEquals(buckets, results.value);
    }
}
