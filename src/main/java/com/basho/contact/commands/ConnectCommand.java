package com.basho.contact.commands;

import com.basho.contact.RuntimeContext;
import com.basho.contact.symbols.ConnectionSymbol;
import com.basho.riak.client.IRiakClient;

public class ConnectCommand extends RiakCommand<ConnectionSymbol> {

	public String host;
	public int pbPort;
	public int httpPort;

	@Override
	public ConnectionSymbol exec(RuntimeContext runtimeCtx) {
		runtimeCtx.getNotifier().preConnectAction(host, Integer.toString(pbPort));
		IRiakClient client = runtimeCtx.getConnectionProvider().createDefaultConnection(host, pbPort, runtimeCtx);
		runtimeCtx.getNotifier().postConnectAction(host, Integer.toString(pbPort), client);
		ConnectionSymbol sym = new ConnectionSymbol(host, pbPort);
		sym.value = client;
		return sym;
	}
}
