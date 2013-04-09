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


import com.basho.contact.parser.ContactBaseListener;
import com.basho.contact.parser.ContactParser;
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
        System.out.println("Admin command");
    }

    @Override
    public void exitAdmin_leave(ContactParser.Admin_leaveContext ctx) {
        super.exitAdmin_leave(ctx);
    }

    @Override
    public void exitAdmin_force_remove(ContactParser.Admin_force_removeContext ctx) {
        super.exitAdmin_force_remove(ctx);
    }

    @Override
    public void exitAdmin_force_replace(ContactParser.Admin_force_replaceContext ctx) {
        super.exitAdmin_force_replace(ctx);
    }

    @Override
    public void exitAdmin_plan(ContactParser.Admin_planContext ctx) {
        super.exitAdmin_plan(ctx);
    }

    @Override
    public void exitAdmin_commit(ContactParser.Admin_commitContext ctx) {
        super.exitAdmin_commit(ctx);
    }

    @Override
    public void exitAdmin_join(ContactParser.Admin_joinContext ctx) {
        super.exitAdmin_join(ctx);
    }

    @Override
    public void exitAdmin_clear(ContactParser.Admin_clearContext ctx) {
        super.exitAdmin_clear(ctx);
    }

    @Override
    public void exitAdmin_replace(ContactParser.Admin_replaceContext ctx) {
        super.exitAdmin_replace(ctx);
    }

}
