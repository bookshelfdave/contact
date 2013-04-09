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
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;

public class AdminCommitCommand extends AdminCommand {
    public AdminCommitCommand() {
        super("riak_core_console", "commit_staged");
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        return new OtpErlangList(new OtpErlangList());
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        System.out.println(result);
    }
}
