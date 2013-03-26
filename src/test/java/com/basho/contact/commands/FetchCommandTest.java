package com.basho.contact.commands;

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.FetchParams;
import com.basho.contact.testing.EmptyConnectionProvider;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.bucket.FetchBucket;
import com.basho.riak.client.operations.FetchObject;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class FetchCommandTest {

    FetchParams.Pre  preParams;
    FetchParams.Post postParams;

    @Test
    public void testNoConnections() {
        FetchCommand command = new FetchCommand();
        ContactConnectionProvider connProvider = new EmptyConnectionProvider();

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

    @Captor ArgumentCaptor<FetchObject<IRiakObject>> captor;

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
        };

        command.params.bucket = "Foo";
        command.params.key    = "Bar";
        Map<String, Object> options = new HashMap<String, Object>();

        options.put("r", 10);
        options.put("pr", 2);
        options.put("basic_quorum", true);
        options.put("notfound_ok", false);
        options.put("deletedvclock", true);

        command.params.options = options;
        command.processOptions(ctx, fetchObject);

        assertEquals(10, results.get("r"));
        assertEquals(2, results.get("pr"));
        assertEquals(true, results.get("basic_quorum"));
        assertEquals(false, results.get("notfound_ok"));
        assertEquals(true, results.get("deletedvclock"));

    }
}

