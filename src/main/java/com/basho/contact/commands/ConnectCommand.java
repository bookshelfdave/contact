package com.basho.contact.commands;

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.ConnectParams;
import com.basho.contact.symbols.ConnectionSymbol;
import com.basho.riak.client.IRiakClient;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ConnectCommand extends RiakCommand<ConnectionSymbol, ConnectParams.Pre> {

    public ConnectCommand() {
        super(ConnectParams.Pre.class);
    }

    @Override
    public ConnectionSymbol exec(RuntimeContext runtimeCtx) {
        runtimeCtx.getActionListener().preConnectAction(params);
        IRiakClient client = runtimeCtx
                .getConnectionProvider()
                .createDefaultConnection(params.host, params.pbPort, runtimeCtx);

        ConnectParams.Post postParams = new ConnectParams.Post();
        postParams.ctx = runtimeCtx;
        postParams.client = client;
        postParams.host = params.host;
        postParams.pbPort = params.pbPort;
        runtimeCtx.getActionListener().postConnectAction(postParams);

        ConnectionSymbol sym = new ConnectionSymbol(params.host, params.pbPort);
        sym.value = client;
        return sym;
    }

    @Test
    public void testConnect() {
        //RuntimeContext ctx = mock(RuntimeContext.class);
        //this.params.host="127.0.0.1";
        //this.params.pbPort=10017;
        //exec(ctx);
    }
}
