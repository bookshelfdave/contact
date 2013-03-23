package com.basho.contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.basho.contact.ContactParser.AssignmentContext;
import com.basho.contact.ContactParser.Code_stringContext;
import com.basho.contact.ContactParser.ConnectContext;
import com.basho.contact.ContactParser.Console_opContext;
import com.basho.contact.ContactParser.Content_stringContext;
import com.basho.contact.ContactParser.DeleteContext;
import com.basho.contact.ContactParser.FetchContext;
import com.basho.contact.ContactParser.GetContext;
import com.basho.contact.ContactParser.Get_actionContext;
import com.basho.contact.ContactParser.Get_bucketpropsContext;
import com.basho.contact.ContactParser.ListbucketsContext;
import com.basho.contact.ContactParser.ListkeysContext;
import com.basho.contact.ContactParser.Op_with_optionsContext;
import com.basho.contact.ContactParser.OptionsContext;
import com.basho.contact.ContactParser.OptionslistContext;
import com.basho.contact.ContactParser.PairBoolValueContext;
import com.basho.contact.ContactParser.PairContext;
import com.basho.contact.ContactParser.PairIntValueContext;
import com.basho.contact.ContactParser.PairStringValueContext;
import com.basho.contact.ContactParser.Query2iContext;
import com.basho.contact.ContactParser.Set_actionContext;
import com.basho.contact.ContactParser.ShowContext;
import com.basho.contact.ContactParser.StatContext;
import com.basho.contact.ContactParser.StoreContext;
import com.basho.contact.ContactParser.Store_indexesContext;
import com.basho.contact.ContactParser.UseContext;
import com.basho.contact.ContactParser.UsingContext;
import com.basho.contact.commands.ConnectCommand;
import com.basho.contact.commands.FetchCommand;
import com.basho.contact.commands.GetBucketPropsCommand;
import com.basho.contact.commands.ListBucketsCommand;
import com.basho.contact.commands.ListKeysCommand;
import com.basho.contact.commands.Query2iCommand;
import com.basho.contact.commands.StoreCommand;
import com.basho.contact.symbols.ContactSymbol;
import com.basho.contact.symbols.ContactSymbol.SymbolType;
import com.basho.riak.client.IRiakObject;

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
		if(ctx.name != null) {
			setValue(ctx, ctx.name.getText());
		}
		super.exitAssignment(ctx);
	}

	
	@Override
	public void exitUsing(UsingContext ctx) {
		String bucket = stripQuotes(ctx.bucket.getText());
		Object o = getValue(ctx.op_with_options());
		if(o instanceof RiakCommand) {
			RiakCommand<?,?> c = (RiakCommand<?,?>)o;
			c.params.bucket = bucket;
		}
		trace("Using bucket " + bucket);
		setValue(ctx, o);
		super.exitUsing(ctx);
	}
	
	@Override
	public void exitStat(StatContext ctx) {
		Object o = null;
		if(ctx.op_with_options() != null) {
			o = getValue(ctx.op_with_options());
		} else if (ctx.using() != null) {
			o = getValue(ctx.using());
		} else if(ctx.listbuckets() != null) {
			o = getValue(ctx.listbuckets());
		} else if(ctx.connect() != null) {
			o = getValue(ctx.connect());
		} else if(ctx.console_op() != null) {
			o = getValue(ctx.console_op());
		}  
		
		if(o != null) {
			//System.out.println("Executing " + o.getClass().getName());
			if( o != null && o instanceof RiakCommand) {
                RiakCommand<?,?> cmd = (RiakCommand<?,?>)o;

                if(cmd.params.bucket == null) {
                    cmd.params.bucket = runtimeCtx.getCurrentBucket();
				}
                cmd.params.ctx = runtimeCtx;
                ContactSymbol<?> sym = cmd.exec(runtimeCtx);
				runtimeCtx.lastResult = sym;
				if(ctx.assignment() != null) {
					String name = (String)getValue(ctx.assignment());
					runtimeCtx.bind(name,  runtimeCtx.lastResult);
				}
				setValue(ctx, sym);
			
			} 
		}		
		super.exitStat(ctx);
	}

	@Override
	public void exitShow(ShowContext ctx) {
		ContactSymbol<?> obj = null;
		if(ctx.ID() != null) {
			// TODO: make getBinding allow more more than one SymbolType
			obj = runtimeCtx.getBinding(ctx.ID().getText(), SymbolType.RESULT);
		} else {
			obj = runtimeCtx.lastResult;
		}
		
		if(ctx.DETAIL() != null) {			
			if(obj.type == ContactSymbol.SymbolType.RESULT) {
				IRiakObject result = (IRiakObject)obj.value;
				StringBuilder sb = new StringBuilder();
				sb.append("Key:" + result.getKey() + "\n");
				sb.append("Bucket:" + result.getBucket() + "\n");
				sb.append("VClock:" + result.getVClockAsString() + "\n");
				// TODO: add more detail!
				sb.append("Value: " + result.getValueAsString() + "\n");
				NonSymbolOutput nsym = new NonSymbolOutput(sb.toString());
				runtimeCtx.lastOutput = nsym;
			}
		} else {
			if(obj.type == ContactSymbol.SymbolType.RESULT) {
				IRiakObject result = (IRiakObject)obj.value;
				NonSymbolOutput nsym = new NonSymbolOutput(result.getValueAsString());
				runtimeCtx.lastOutput = nsym;
			}
		}
		super.exitShow(ctx);
	}

	@Override
	public void exitCode_string(Code_stringContext ctx) {
		String value = "";
		if(ctx.STRING() != null) {
			value = stripQuotes(ctx.STRING().getText());
		} else {
			value = getDataContent(ctx.DATA_CONTENT().getText());
		}
		setValue(ctx, value);
		super.exitCode_string(ctx);
	}

	@Override
	public void exitConsole_op(Console_opContext ctx) {
		if(ctx.get() != null) {
			setValue(ctx, getValue(ctx.get()));
		} else if(ctx.set() != null) {
			setValue(ctx, getValue(ctx.set()));
		} else if(ctx.show() != null) {
			setValue(ctx, getValue(ctx.show()));
		}
		super.exitConsole_op(ctx);
	}

	@Override
	public void exitGet(GetContext ctx) {
		if(ctx.get_action() != null) {
			setValue(ctx, getValue(ctx.get_action()));
		} else if(ctx.get_bucketprops() != null) {
			setValue(ctx, getValue(ctx.get_bucketprops()));
		}
		super.exitGet(ctx);
	}

	@Override
	public void exitGet_action(Get_actionContext ctx) {
		String action = ctx.actionname.getText();
		if(runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
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
		String code = (String)getValue(ctx.code_string());
		if(runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
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
		if(ctx.fetch() != null) {
			o = getValue(ctx.fetch());
		} else if(ctx.store() != null) {
			o = getValue(ctx.store());
		} else if(ctx.delete() != null) {
			o = getValue(ctx.delete());
		} else if(ctx.query2i() != null) {
			o = getValue(ctx.query2i());
		} else if(ctx.listkeys() != null) {
			o = getValue(ctx.listkeys());
		}
		if(o instanceof RiakCommand) {
			RiakCommand<?,?> c = (RiakCommand<?,?>)o;
			c.params.options = (Map<String, Object>)options;
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
		store.params.content = (Content)getValue(ctx.content_string());
		if(ctx.store_indexes() != null) {
			List<PairContext> pctxs = (List<PairContext>)getValue(ctx.store_indexes());
			List<Pair> indexes = new ArrayList<Pair>();
			for(PairContext pc : pctxs) {
				indexes.add((Pair)getValue(pc));
			}
			store.params.indexes = indexes;
		}
		setValue(ctx, store);
		super.exitStore(ctx);
	}

	@Override
	public void exitContent_string(Content_stringContext ctx) {
		// content_string: (TEXT | JSON | XML) (STRING | DATA_CONTENT);
		String value = "";
		
		if(ctx.STRING() != null) {
			value = stripQuotes(ctx.STRING().getText());
		} else if(ctx.DATA_CONTENT() != null) {
			value = getDataContent(ctx.DATA_CONTENT().getText());
		}
		
		if(ctx.JSON() != null) {
			setValue(ctx, new Content(Constants.ContentType.JSON, value));
		} else if(ctx.TEXT() != null) {
			setValue(ctx, new Content(Constants.ContentType.TEXT, value));
		} else if (ctx.XML() != null) {
			setValue(ctx, new Content(Constants.ContentType.XML, value));
		}
		
		super.exitContent_string(ctx);
	}

	@Override
	public void exitDelete(DeleteContext ctx) {
		setValue(ctx, "Delete Result");
		super.exitDelete(ctx);
	}

	@Override
	public void exitQuery2i(Query2iContext ctx) {
		Query2iCommand query = new Query2iCommand();
		query.params.indexName = stripQuotes(ctx.index.getText());
		if(ctx.exact != null) {
			query.params.indexVal = stripQuotes(ctx.exact.getText());
		} else {
			query.params.min = stripQuotes(ctx.vmin.getText());
			query.params.max = stripQuotes(ctx.vmax.getText());
		}
		
		setValue(ctx, query);
		super.exitQuery2i(ctx);
	}

	
	@Override
	public void exitOptionslist(OptionslistContext ctx) {
		Map<String, Object> pairs = new HashMap<String, Object>();
		for(PairContext pc : ctx.opts) {
			Pair p = (Pair)getValue(pc);
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
		Object o = getValue(ctx.pairValue());
		if(ctx.name != null) {
			String name = stripQuotes(ctx.name.getText());
			Pair p = new Pair(name, o);
			trace("New pair " + p);
			setValue(ctx,p);
		} else{
			String name = ctx.id.getText();
			Pair p = new Pair(name, o);
			trace("New id pair " + p);
			setValue(ctx,p);
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
		setValue(ctx, Integer.parseInt(ctx.intValue.getText()));
		super.exitPairIntValue(ctx);
	}

	@Override
	public void exitPairBoolValue(PairBoolValueContext ctx) {
		setValue(ctx, Boolean.parseBoolean(ctx.boolValue.getText()));
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
        
        setValue(ctx, command);
		super.exitConnect(ctx);
	}


	@Override
	public void exitUse(UseContext ctx) {
		if(ctx.BUCKET() != null) {
			String bucket = stripQuotes(ctx.name.getText());
			runtimeCtx.setCurrentBucket(bucket);
			super.exitUse(ctx);
		} 
	}

	public String stripQuotes(String rawVal) {
		// should probably check if it's an empty string and all that..
		if(rawVal.length() == 2) {
			return "";
		} else if(rawVal.length() == 3) {
			return rawVal.substring(1,2);
		} else {
			return rawVal.substring(1,rawVal.length()-1);
		}
	}

	public String getDataContent(String content) {
		if(content.startsWith("\n")) {
            // TODO: determine if ~%~ is on a new line by itself
            content = content.substring(1, content.length()-1);
        }
        // TODO: replace escaped content, etc
        return content.substring(3, content.length() - 3);
	}
	
	private void trace(String msg) {
		if(runtimeCtx.trace) {
			System.out.println("TRACE:" + msg);
		}
	}

	@Override
	public void exitStore_indexes(Store_indexesContext ctx) {
		if(ctx.pair() != null) {
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
}
