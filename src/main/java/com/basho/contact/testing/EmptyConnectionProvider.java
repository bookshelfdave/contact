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

package com.basho.contact.testing;


import com.basho.contact.ConnectionInfo;
import com.basho.contact.ContactConnectionProvider;
import com.basho.contact.RuntimeContext;
import com.basho.riak.client.IRiakClient;

import java.util.Map;

public class EmptyConnectionProvider implements ContactConnectionProvider {
    public IRiakClient getDefaultClient(RuntimeContext ctx) {
        return null;
    }

    public IRiakClient getClientByName(String name, RuntimeContext ctx) {
        return null;
    }

    public IRiakClient createDefaultConnection(String host, int port, RuntimeContext ctx) {
        return null;
    }

    public IRiakClient createNamedConnection(String host, int port, String name, RuntimeContext ctx) {
        return null;
    }

    public Map<String, ConnectionInfo> getAllConnections() {
        return null;
    }
}
