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

package com.basho.contact.commands.admin131;

import com.basho.contact.RuntimeContext;
import com.ericsson.otp.erlang.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdminDiscoverCommand extends AdminCommand {
    String connid;
    String clusterid;

    public AdminDiscoverCommand(String clusterid) {
        super("riak_kv_status", "statistics");
        this.clusterid = clusterid;
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        return new OtpErlangList();
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        OtpErlangList l = (OtpErlangList)result;
        Iterator<OtpErlangObject> it = l.iterator();
        // TODO:!!!! THIS DOESN'T INCLUDE THE CURRENT NODE
        List<String> clusterNodes = new ArrayList<String>();
        while(it.hasNext()) {
            OtpErlangTuple o = (OtpErlangTuple)it.next();
            OtpErlangAtom k = (OtpErlangAtom)o.elementAt(0);
            OtpErlangObject obj = o.elementAt(1);
            if(k.atomValue().equals("connected_nodes")) {
                OtpErlangList cnodes = (OtpErlangList)o.elementAt(1);
                Iterator<OtpErlangObject> cit = cnodes.iterator();
                while(cit.hasNext()) {
                    OtpErlangAtom node = (OtpErlangAtom)cit.next();
                    //System.out.print("[" + node.atomValue() + "] :");
                    OtpPeer peer = new OtpPeer(node.atomValue());
                    clusterNodes.add(node.atomValue());
                    OtpConnection connection = null;
                    try {
                        // IPV4 only for now
                        // hackety hack hack hack
                        connection = self.connect(peer);
                        connection.sendRPC("inet","getif",new OtpErlangList());
                        OtpErlangTuple r = (OtpErlangTuple)connection.receiveRPC();
                        OtpErlangList addrList = (OtpErlangList)r.elementAt(1);
                        OtpErlangTuple t = (OtpErlangTuple)addrList.elementAt(0);
                        OtpErlangTuple ipTuple = (OtpErlangTuple)t.elementAt(0);
                        OtpErlangLong ip0 = (OtpErlangLong)ipTuple.elementAt(0);
                        OtpErlangLong ip1 = (OtpErlangLong)ipTuple.elementAt(1);
                        OtpErlangLong ip2 = (OtpErlangLong)ipTuple.elementAt(2);
                        OtpErlangLong ip3 = (OtpErlangLong)ipTuple.elementAt(3);
                        String ip = ip0.intValue() + "."
                                        + ip1.intValue() + "."
                                        + ip2.intValue() + "."
                                        + ip2.intValue();
                        OtpErlangObject[] envparams = {
                                new OtpErlangAtom("riak_api"),
                                new OtpErlangAtom("pb")
                        };
                        connection.sendRPC("app_helper","get_env",new OtpErlangList(envparams));
                        OtpErlangList pblist = (OtpErlangList)connection.receiveRPC();
                        OtpErlangTuple ipPortTuple = (OtpErlangTuple)pblist.elementAt(0);
                        OtpErlangString ipString = (OtpErlangString)ipPortTuple.elementAt(0);
                        OtpErlangLong portString = (OtpErlangLong)ipPortTuple.elementAt(1);
                        String shortName = node.atomValue().split("@")[0];

                        System.out.println("Adding connection for " + shortName);


                        ctx.getConnectionProvider()
                                .createNamedConnection(
                                        ipString.stringValue(),
                                        portString.intValue(),
                                        shortName,ctx);
                    } catch (Exception e) {
                        e.printStackTrace();
                        ctx.appendError(e);
                    } finally {
                        try {
                            if(connection != null)
                                connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                ctx.defineCluster(clusterid, clusterNodes);
            }
        }
    }
}
