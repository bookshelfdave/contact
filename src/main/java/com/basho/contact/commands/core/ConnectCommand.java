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

package com.basho.contact.commands.core;

import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.core.params.ConnectParams;
import com.basho.contact.symbols.ConnectionSymbol;
import com.basho.riak.client.IRiakClient;
import org.junit.Test;

public class ConnectCommand extends RiakCommand<ConnectionSymbol, ConnectParams.Pre> {

    public ConnectCommand() {
        super(ConnectParams.Pre.class);
    }

    @Override
    protected boolean requiresConnection() {
        return false;
    }

    @Override
    protected ConnectionSymbol exec(RuntimeContext runtimeCtx) {
        runtimeCtx.getActionListener().preConnectAction(params);

        ContactConnectionProvider connections =
                runtimeCtx.getConnectionProvider();

        IRiakClient client;
        if(params.conn_id != null) {
            client = connections.createNamedConnection(params.host, params.pbPort, params.conn_id, runtimeCtx);
            if(params.node_name != null) {
                // only named connections can set an erlang node
                connections.registerClientWithErlangNode(params.conn_id, params.node_name);
            }
        } else {
            client = connections.createDefaultConnection(params.host, params.pbPort, runtimeCtx);
            if(params.node_name != null) {
                runtimeCtx.appendError("Can't set an node name without a connection name");
            }
        }
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
