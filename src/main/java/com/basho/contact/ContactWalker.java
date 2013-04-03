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

import com.basho.contact.commands.*;
import com.basho.contact.parser.ContactBaseListener;
import com.basho.contact.parser.ContactParser;
import com.basho.contact.parser.ContactParser.*;
import com.basho.contact.symbols.ContactSymbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class ContactWalker extends ContactBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public RuntimeContext runtimeCtx = null;

    public ContactWalker(RuntimeContext ctx) {
        this.runtimeCtx = ctx;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    @Override
    public void exitAssignment(AssignmentContext ctx) {
        if (ctx.name != null) {
            setValue(ctx, ctx.name.getText());
        }
        super.exitAssignment(ctx);
    }


    @Override
    public void exitConnection_selector(Connection_selectorContext ctx) {
        setValue(ctx, ctx.connname.getText());
    }

    @Override
    public void exitConnections(ConnectionsContext ctx) {
        ConnectionsCommand cmd = new ConnectionsCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitUsing(UsingContext ctx) {
        String bucket = stripQuotes(ctx.bucket.getText());
        Object o = getValue(ctx.op_with_options());
        if (o instanceof RiakCommand) {
            RiakCommand<?, ?> c = (RiakCommand<?, ?>) o;
            c.params.bucket = bucket;
        }
        trace("Using bucket " + bucket);
        setValue(ctx, o);
        super.exitUsing(ctx);
    }

    @Override
    public void exitStat(StatContext ctx) {
        Object o = null;
        if (ctx.op_with_options() != null) {
            o = getValue(ctx.op_with_options());
        } else if (ctx.using() != null) {
            o = getValue(ctx.using());
        } else if (ctx.listbuckets() != null) {
            o = getValue(ctx.listbuckets());
        } else if (ctx.connect() != null) {
            o = getValue(ctx.connect());
        } else if (ctx.console_op() != null) {
            o = getValue(ctx.console_op());
        } else if (ctx.connections() != null) {
            o = getValue(ctx.connections());
        }

        if(runtimeCtx.isParseError()) {
            super.exitStat(ctx);
        }

        if (o != null) {
            //System.out.println("Executing " + o.getClass().getName());
            if (o instanceof RiakCommand) {
                RiakCommand<?, ?> cmd = (RiakCommand<?, ?>) o;

                if(ctx.connection_selector() != null) {
                    String conn_id = (String)getValue(ctx.connection_selector());
                    System.out.println("Using connection " + conn_id);
                    cmd.params.connection_id = conn_id;
                }
                if (cmd.params.bucket == null) {
                    cmd.params.bucket = runtimeCtx.getCurrentBucket();
                }
                cmd.params.ctx = runtimeCtx;
                ContactSymbol<?> sym = cmd.doExec(runtimeCtx);
                runtimeCtx.lastResult = sym;
                if (ctx.assignment() != null) {
                    String name = (String) getValue(ctx.assignment());
                    runtimeCtx.bind(name, runtimeCtx.lastResult);
                }
                setValue(ctx, sym);

            }
        }
        super.exitStat(ctx);
    }

//    @Override
//    public void exitShow(ShowContext ctx) {
//        ContactSymbol<?> obj = null;
//        if (ctx.ID() != null) {
//            // TODO: make getBinding allow more more than one SymbolType
//            obj = runtimeCtx.getBinding(ctx.ID().getText(), SymbolType.RESULT);
//        } else {
//            obj = runtimeCtx.lastResult;
//        }
//
//        if (ctx.DETAIL() != null) {
//            if (obj.type == ContactSymbol.SymbolType.RESULT) {
//                IRiakObject result = (IRiakObject) obj.value;
//                StringBuilder sb = new StringBuilder();
//                sb.append("Key:" + result.getKey() + "\n");
//                sb.append("Bucket:" + result.getBucket() + "\n");
//                sb.append("VClock:" + result.getVClockAsString() + "\n");
//                // TODO: add more detail!
//                sb.append("Value: " + result.getValueAsString() + "\n");
//                NonSymbolOutput nsym = new NonSymbolOutput(sb.toString());
//                runtimeCtx.lastOutput = nsym;
//            }
//        } else {
//            if (obj.type == ContactSymbol.SymbolType.RESULT) {
//                IRiakObject result = (IRiakObject) obj.value;
//                NonSymbolOutput nsym = new NonSymbolOutput(result.getValueAsString());
//                runtimeCtx.lastOutput = nsym;
//            }
//        }
//        super.exitShow(ctx);
//    }

    @Override
    public void exitCode_string(Code_stringContext ctx) {
        String value;
        if (ctx.STRING() != null) {
            value = stripQuotes(ctx.STRING().getText());
        } else {
            value = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        }
        setValue(ctx, value);
        super.exitCode_string(ctx);
    }

    @Override
    public void exitConsole_op(Console_opContext ctx) {
        if (ctx.get() != null) {
            setValue(ctx, getValue(ctx.get()));
        } else if (ctx.set() != null) {
            setValue(ctx, getValue(ctx.set()));
        }
        super.exitConsole_op(ctx);
    }

    @Override
    public void exitGet(GetContext ctx) {
        if (ctx.get_action() != null) {
            setValue(ctx, getValue(ctx.get_action()));
        } else if(ctx.BUCKET() != null) {
                // TODO: This would be better in stmt.
                GetBucketCommand cmd = new GetBucketCommand();
                cmd.params.bucket = runtimeCtx.getCurrentBucket();
                cmd.params.ctx = runtimeCtx;
                ContactSymbol<?> sym = cmd.doExec(runtimeCtx);
                runtimeCtx.lastResult = sym;
                setValue(ctx, sym);
        }
    }

    @Override
    public void exitGet_action(Get_actionContext ctx) {
        String action = ctx.actionname.getText();
        if (runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
            // print this directly to the console
            System.out.println(runtimeCtx.getJSActionListener().getJSBody(action));
        } else {
            runtimeCtx.appendError(action + " is an invalid action");
        }
        super.exitGet_action(ctx);
    }

    @Override
    public void exitSet_action(Set_actionContext ctx) {
        String action = ctx.actionname.getText();
        String code = (String) getValue(ctx.code_string());
        if (runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
            // print this directly to the console
            runtimeCtx.getJSActionListener().setJSBody(action, code);
        } else {
            runtimeCtx.appendError(action + " is an invalid action");
        }
        super.exitSet_action(ctx);
    }

    @Override
    public void exitGet_bucketprops(Get_bucketpropsContext ctx) {
        GetBucketPropsCommand cmd = new GetBucketPropsCommand();
        setValue(ctx, cmd);
        super.exitGet_bucketprops(ctx);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void exitOp_with_options(Op_with_optionsContext ctx) {
        Object options = getValue(ctx.options());
        Object o = null;
        Map<String, String> bucketOptions = null;

        if (ctx.fetch() != null) {
            o = getValue(ctx.fetch());
            bucketOptions = runtimeCtx.getCurrentFetchOptions();
        } else if (ctx.store() != null) {
            o = getValue(ctx.store());
            bucketOptions = runtimeCtx.getCurrentStoreOptions();
        } else if (ctx.delete() != null) {
            o = getValue(ctx.delete());
            bucketOptions = runtimeCtx.getCurrentDeleteOptions();
        } else if (ctx.query2i() != null) {
            o = getValue(ctx.query2i());
            bucketOptions = runtimeCtx.getCurrentQuery2iOptions();
        } else if (ctx.listkeys() != null) {
            o = getValue(ctx.listkeys());
        } else if(ctx.countkeys() != null) {
            o = getValue(ctx.countkeys());
        } else if(ctx.get_bucketprops() != null) {
            o = getValue(ctx.get_bucketprops());
        }

        if (o instanceof RiakCommand) {
            RiakCommand<?, ?> c = (RiakCommand<?, ?>) o;
            if(bucketOptions != null && bucketOptions.size() > 0) {
                Map<String, String> combined = new HashMap<String, String>();
                // use all bucket options, then override with any options from
                // curent command
                combined.putAll(bucketOptions);
                combined.putAll((Map<String, String>) options);
                c.params.options = combined;
            } else {
                c.params.options = (Map<String, String>) options;
            }
            setValue(ctx, c);
        }
        super.exitOp_with_options(ctx);
    }


    @Override
    public void exitFetch(FetchContext ctx) {
        FetchCommand fetch = new FetchCommand();
        fetch.params.key = stripQuotes(ctx.key.getText());
        //System.out.println("Fetching key " + fetch.key);
        setValue(ctx, fetch);
        super.exitFetch(ctx);
    }


    @SuppressWarnings("unchecked")
    @Override
    public void exitStore(StoreContext ctx) {
        StoreCommand store = new StoreCommand();
        store.params.key = stripQuotes(ctx.key.getText());
        store.params.content = (Content) getValue(ctx.content_string());
        if (ctx.store_indexes() != null) {
            List<PairContext> pctxs = (List<PairContext>) getValue(ctx.store_indexes());
            List<Pair> indexes = new ArrayList<Pair>();
            for (PairContext pc : pctxs) {
                indexes.add((Pair) getValue(pc));
            }
            store.params.indexes = indexes;
        }
        setValue(ctx, store);
        super.exitStore(ctx);
    }

    @Override
    public void exitContent_string(Content_stringContext ctx) {
        // content_string: (TEXT | JSON | XML | user_content) (STRING | DATA_CONTENT);

        String value = "";

        if (ctx.STRING() != null) {
            value = stripQuotes(ctx.STRING().getText());
        } else if (ctx.DATA_CONTENT() != null) {
            value = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        }

        if (ctx.JSON() != null) {
            setValue(ctx, new Content(Content.ContentType.JSON, value));
        } else if (ctx.TEXT() != null) {
            setValue(ctx, new Content(Content.ContentType.TEXT, value));
        } else if (ctx.XML() != null) {
            setValue(ctx, new Content(Content.ContentType.XML, value));
        } else if(ctx.user_content() != null) {
            String userDefinedContentType = (String)getValue(ctx.user_content());
            setValue(ctx, new Content(Content.ContentType.USER_DEFINED, userDefinedContentType, value));
        }

        super.exitContent_string(ctx);
    }

    @Override
    public void exitUser_content(User_contentContext ctx) {
        //user_content: CONTENTTYPE content_type=STRING AND
        setValue(ctx, stripQuotes(ctx.content_type.getText()));
    }

    @Override
    public void exitDelete(DeleteContext ctx) {
        DeleteCommand cmd = new DeleteCommand();
        cmd.params.key = stripQuotes(ctx.key.getText());
        setValue(ctx, cmd);
        super.exitDelete(ctx);
    }

    @Override
    public void exitQuery2i(Query2iContext ctx) {
        Query2iCommand query = new Query2iCommand();
        query.params.indexName = stripQuotes(ctx.index.getText());
        if (ctx.exact != null) {
            query.params.indexVal = stripQuotes(ctx.exact.getText());
        } else {
            query.params.min = stripQuotes(ctx.vmin.getText());
            query.params.max = stripQuotes(ctx.vmax.getText());
        }
        if(ctx.FETCH() != null) {
            query.params.doFetch = true;
        }

        setValue(ctx, query);
        super.exitQuery2i(ctx);
    }


    @Override
    public void exitOptionslist(OptionslistContext ctx) {
        Map<String, Object> pairs = new HashMap<String, Object>();
        for (PairContext pc : ctx.opts) {
            Pair p = (Pair) getValue(pc);
            pairs.put(p.getKey(), p.getValue());
        }
        setValue(ctx, pairs);
        super.exitOptionslist(ctx);
    }

    @Override
    public void exitOptions(OptionsContext ctx) {
        setValue(ctx, getValue(ctx.optionslist()));
        super.exitOptions(ctx);
    }


    @Override
    public void exitPair(PairContext ctx) {
        String s = (String)getValue(ctx.pairValue());
        if (ctx.name != null) {
            String name = stripQuotes(ctx.name.getText());
            Pair p = new Pair(name, s);
            setValue(ctx, p);
        } else {
            String name = ctx.id.getText();
            Pair p = new Pair(name, s);
            setValue(ctx, p);
        }
        super.exitPair(ctx);
    }

    @Override
    public void exitPairStringValue(PairStringValueContext ctx) {
        setValue(ctx, stripQuotes(ctx.stringValue.getText()));
        super.exitPairStringValue(ctx);
    }

    @Override
    public void exitPairIntValue(PairIntValueContext ctx) {
        setValue(ctx, ctx.intValue.getText());
        super.exitPairIntValue(ctx);
    }

    @Override
    public void exitPairBoolValue(PairBoolValueContext ctx) {
        setValue(ctx, ctx.boolValue.getText());
        super.exitPairBoolValue(ctx);
    }


    @Override
    public void exitConnect(ConnectContext ctx) {
        String host = stripQuotes(ctx.host.getText());
        // don't worry about the port # here, 
        // Antlr already made sure it was a valid int
        int pbPort = Integer.parseInt(ctx.pbport.getText());

        ConnectCommand command = new ConnectCommand();
        command.params.host = host;
        command.params.pbPort = pbPort;
        if(ctx.connname != null) {
            command.params.conn_id = ctx.connname.getText();
        }
        setValue(ctx, command);
        super.exitConnect(ctx);
    }


    @Override
    public void exitUse(UseContext ctx) {
        if (ctx.BUCKET() != null) {
            String bucket = stripQuotes(ctx.name.getText());
            runtimeCtx.setCurrentBucket(bucket);
            super.exitUse(ctx);
        }
    }

    public String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            return rawVal.substring(1, rawVal.length() - 1);
        }
    }


    private void trace(String msg) {
        if (runtimeCtx.trace) {
            System.out.println("TRACE:" + msg);
        }
    }

    @Override
    public void exitStore_indexes(Store_indexesContext ctx) {
        if (ctx.pair() != null) {
            List<PairContext> pctxs = ctx.pair();
            setValue(ctx, pctxs);
        }
        super.exitStore_indexes(ctx);
    }

    @Override
    public void exitListbuckets(ListbucketsContext ctx) {
        ListBucketsCommand listBuckets = new ListBucketsCommand();
        setValue(ctx, listBuckets);
        super.exitListbuckets(ctx);
    }

    @Override
    public void exitListkeys(ListkeysContext ctx) {
        ListKeysCommand listKeys = new ListKeysCommand();
        setValue(ctx, listKeys);
        super.exitListkeys(ctx);
    }

    @Override
    public void exitUseBucketOptions(UseBucketOptionsContext ctx) {
        if(ctx.FETCH() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> fo = (Map<String, String>)getValue(ctx.fetchOptions);
            runtimeCtx.setCurrentFetchOptions(fo);
            System.out.println("Fetch options =" + fo);
        } else {
            runtimeCtx.setCurrentFetchOptions(new HashMap<String, String>());
        }

        if(ctx.STORE() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> so = (Map<String, String>)getValue(ctx.storeOptions);
            runtimeCtx.setCurrentStoreOptions(so);
            System.out.println("Store options =" + so);
        } else {
            runtimeCtx.setCurrentStoreOptions(new HashMap<String, String>());
        }

        if(ctx.DELETE() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> del_o = (Map<String, String>)getValue(ctx.deleteOptions);
            runtimeCtx.setCurrentDeleteOptions(del_o);
            System.out.println("Delete options =" + del_o);
        } else {
            runtimeCtx.setCurrentDeleteOptions(new HashMap<String, String>());
        }

        if(ctx.QUERY2I() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> qo = (Map<String, String>)getValue(ctx.query2iOptions);
            runtimeCtx.setCurrentQuery2iOptions(qo);
            System.out.println("Query2i options =" + qo);
        } else {
            runtimeCtx.setCurrentQuery2iOptions(new HashMap<String, String>());
        }

        super.exitUseBucketOptions(ctx);
    }

    @Override
    public void exitCountkeys(CountkeysContext ctx) {
        CountKeysCommand cmd = new CountKeysCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitLoadscript(LoadscriptContext ctx) {
        String filename = stripQuotes(ctx.filename.getText());
        runtimeCtx.getActionListener().loadScript(filename);
    }

    @Override
    public void exitScript(ScriptContext ctx) {
        String content = "";
        if(ctx.DATA_CONTENT() != null) {
            content = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        } else {
            content = stripQuotes(ctx.STRING().getText());
        }
        runtimeCtx.getActionListener().evalScript(content);
    }
}
