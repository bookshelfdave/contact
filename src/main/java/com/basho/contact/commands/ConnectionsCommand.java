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

import com.basho.contact.ConnectionInfo;
import com.basho.contact.RiakCommand;
import com.basho.contact.RuntimeContext;
import com.basho.contact.commands.params.ConnectionsParams;
import com.basho.contact.symbols.VoidSymbol;

import java.util.Map;

public class ConnectionsCommand extends RiakCommand<VoidSymbol, ConnectionsParams.Pre> {
    public ConnectionsCommand() {
        super(ConnectionsParams.Pre.class);
    }

    @Override
    protected boolean requiresConnection() {
        return false;
    }

    @Override
    protected VoidSymbol exec(RuntimeContext ctx) {
        ctx.getActionListener().preConnections(this.params);
        Map<String, ConnectionInfo> conns = ctx.getConnectionProvider().getAllConnections();
        ConnectionsParams.Post postParams = new ConnectionsParams.Post();
        postParams.connections = conns;
        ctx.getActionListener().postConnections(postParams);
        return new VoidSymbol();
    }
}
