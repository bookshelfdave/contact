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

package com.basho.contact.symbols;

import com.basho.riak.client.IRiakClient;


public class ConnectionSymbol extends ContactSymbol<IRiakClient> {
    private String host = "";
    private int port = 0;

    public ConnectionSymbol(String host, int port) {
        this.type = ContactSymbol.SymbolType.CONNECTION;
        this.host = host;
        this.port = port;
    }

    public String toString() {
        return "<riak_connection " + this.host + ":" + this.port + ">";
    }
}
