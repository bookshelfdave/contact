package com.basho.contact.commands;

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.contact.actions.ContactActionListener;
import com.basho.contact.commands.params.FetchParams;
import com.basho.contact.commands.params.ListBucketsParams;
import com.basho.contact.symbols.StringSetSymbol;
import com.basho.contact.testing.EmptyActionListener;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.bucket.FetchBucket;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class FetchCommandTest {

    FetchParams.Pre  preParams;
    FetchParams.Post postParams;

    @Test
    public void testNoConnections() {
        FetchCommand command = new FetchCommand();
        ContactConnectionProvider connProvider = new EmptyConnectionProvider() {

        };

        RuntimeContext ctx = new RuntimeContext(connProvider, null, null);
        command.exec(ctx);
        assertEquals(1, ctx.getErrors().size());
        assertEquals("Not connected to Riak for fetch op.", ctx.getErrors().get(0).getMessage());
    }


    @Test
    public void testNoBucket() {
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
        command.params.bucket = null;
        RuntimeContext ctx = mock(RuntimeContext.class);
        doCallRealMethod().when(ctx).reset();
        doCallRealMethod().when(ctx).appendError(anyString());
        doCallRealMethod().when(ctx).getErrors();
        when(ctx.getConnectionProvider()).thenReturn(connProvider);
        ctx.reset(); // instantiate the error list

        command.exec(ctx);
        assertEquals(1,ctx.getErrors().size());
        assertEquals("Bucket not selected for fetch op.", ctx.getErrors().get(0).getMessage());

    }

}

