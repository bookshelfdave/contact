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

package com.basho.contact.commands.admin;

import com.basho.contact.RuntimeContext;
import com.ericsson.otp.erlang.OtpErlangAtom;
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;

public class AdminGetCommand extends AdminCommand {
    String app;
    String param;

    public AdminGetCommand(String app, String param) {
        super("app_helper", "get_env");
        this.app = app;
        this.param = param;
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        OtpErlangObject[] objs = {
                new OtpErlangAtom(app),
                new OtpErlangAtom(param)
        };
        return new OtpErlangList(objs);
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        System.out.println("   " + result);
    }
}
