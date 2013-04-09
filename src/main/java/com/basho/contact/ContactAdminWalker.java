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


import com.basho.contact.commands.admin131.*;
import com.basho.contact.parser.ContactBaseListener;
import com.basho.contact.parser.ContactParser;
import com.basho.contact.parser.NodeRef;
import com.basho.contact.parser.ParseUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ContactAdminWalker extends ContactBaseListener{
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public RuntimeContext runtimeCtx = null;

    public ContactAdminWalker(RuntimeContext ctx) {
        this.runtimeCtx = ctx;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitAdmin(ContactParser.AdminContext ctx) {
        String connid = ctx.connid.getText();

        AdminCommand cmd = null;

        if(ctx.admin_clear() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_clear());
        } else if(ctx.admin_commit() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_commit());
        } else if(ctx.admin_force_remove() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_force_remove());
        } else if(ctx.admin_force_replace() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_force_replace());
        } else if(ctx.admin_join() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_join());
        } else if(ctx.admin_leave() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_leave());
        } else if(ctx.admin_plan() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_plan());
        } else if(ctx.admin_replace() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_replace());
        } else if(ctx.admin_status() != null) {
            cmd = (AdminCommand)getValue(ctx.admin_status());
        }

        if(cmd != null) {
            cmd.doExec(runtimeCtx, connid);
        }
    }


    @Override
    public void exitAdmin_leave(ContactParser.Admin_leaveContext ctx) {
    }

    @Override
    public void exitAdmin_force_remove(ContactParser.Admin_force_removeContext ctx) {
    }

    @Override
    public void exitAdmin_force_replace(ContactParser.Admin_force_replaceContext ctx) {
    }

    @Override
    public void exitAdmin_plan(ContactParser.Admin_planContext ctx) {
        AdminPlanCommand cmd = new AdminPlanCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitAdmin_commit(ContactParser.Admin_commitContext ctx) {
        AdminCommitCommand cmd = new AdminCommitCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitAdmin_join(ContactParser.Admin_joinContext ctx) {
        NodeRef nodeRef = (NodeRef)getValue(ctx.noderef());
        AdminJoinCommand cmd = new AdminJoinCommand(nodeRef);
        setValue(ctx, cmd);
    }

    @Override
    public void exitAdmin_clear(ContactParser.Admin_clearContext ctx) {
    }

    @Override
    public void exitAdmin_replace(ContactParser.Admin_replaceContext ctx) {
    }

    @Override
    public void exitNoderef(ContactParser.NoderefContext ctx) {
        if(ctx.nodeid != null) {
            setValue(ctx, new NodeRef(ctx.nodeid.getText(), NodeRef.NodeRefType.ID));
        } else if(ctx.nodename != null) {
            String content = ParseUtils.stripQuotes(ctx.nodename.getText());
            setValue(ctx, new NodeRef(content, NodeRef.NodeRefType.NAME));
        }
    }

    @Override
    public void exitAdmin_status(ContactParser.Admin_statusContext ctx) {
        AdminStatusCommand cmd = new AdminStatusCommand();
        setValue(ctx, cmd);
    }
}
