package com.basho.contact.commands;

import java.util.Map;

import com.basho.contact.Content;
import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ContactSymbol;

public abstract class RiakCommand<K extends ContactSymbol<?>> {
	public Map<String, Object> options = null;
	public String bucket = null;
	public Content content;
	public abstract K exec(RuntimeContext ctx);
}
