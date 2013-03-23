package com.basho.contact.actions;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.basho.contact.commands.*;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.StoreObject;
import com.basho.riak.client.query.indexes.FetchIndex;

public interface ContactActionListener{
	public void init();
	public void term();

    public void preConnectAction(ConnectParams.Pre params);
    public void postConnectAction(ConnectParams.Post params);

    public void preFetchAction(FetchParams.Pre params);
    public void postFetchAction(FetchParams.Post params);

	public void preStoreAction(StoreParams.Pre params);
	public void postStoreAction(StoreParams.Post params);
	
	public void preDeleteAction(DeleteParams.Pre params);
	public void postDeleteAction(DeleteParams.Post params);

	public void preQuery2iAction(Query2iParams.Pre params);
	public void postQuery2iAction(Query2iParams.Post params);

	public void preMapredAction(MapRedParams.Pre params);
	public void postMapredAction(MapRedParams.Post params);
	
	public void preListBucketsAction(ListBucketsParams.Pre params);
	public void postListBucketsAction(ListBucketsParams.Post params);
	
	public void preListKeysAction(ListKeysParams.Pre params);
	public void postListKeysAction(ListKeysParams.Post params);
	
	public void preGetBucketPropsAction(GetBucketPropsParams.Pre params);
	public void postGetBucketPropsAction(GetBucketPropsParams.Post params);
	
}
