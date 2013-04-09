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
import com.basho.contact.parser.NodeRef;
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;
import com.ericsson.otp.erlang.OtpErlangString;

public class AdminJoinCommand extends AdminCommand {
    private NodeRef joinToNode;

    public AdminJoinCommand(NodeRef joinToNode) {
        super("riak_kv_console", "staged_join");
        this.joinToNode = joinToNode;
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        if(joinToNode.getReftype() == NodeRef.NodeRefType.NAME) {
            System.out.println("JOIN COMMAND " + joinToNode.getValue());
            return new OtpErlangList(new OtpErlangList(new OtpErlangString(joinToNode.getValue())));
        } else {
            ctx.appendError("Not implemented");
            return null;
        }
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        System.out.println(result);
    }
}
