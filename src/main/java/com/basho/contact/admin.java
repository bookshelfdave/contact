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

package com.basho.contact;


import com.ericsson.otp.erlang.*;
import org.apache.http.client.fluent.Request;

public class Admin {
    public static void main(String args[]) throws Exception {
//        OtpNode node = new OtpNode("dev1@127.0.0.1");
//
//        OtpMbox mbox = node.createMbox("server");
//        if (node.ping("dev1@127.0.0.1",2000)) {
//            System.out.println("remote is up");
//        }
//        else {
//            System.out.println("remote is not up");
//        }

//        System.out.println(Request.Get("http://localhost:10018/riak/stats")
//                .connectTimeout(1000)
//                .socketTimeout(1000)
//                .execute().returnContent().asString());

        OtpSelf self = new OtpSelf("riak_jmx@127.0.0.1", "riak");
        OtpPeer riak  = new OtpPeer("dev1@127.0.0.1");
        OtpConnection connection = self.connect(riak);

        //connection.setTraceLevel(5);
        connection.sendRPC("riak_core_console","transfer_limit",new OtpErlangList(new OtpErlangList()));
        System.out.println(connection.receiveRPC());
    }
}
