package com.basho.contact.actions;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;
import com.basho.riak.client.operations.StoreObject;
import com.basho.riak.client.query.indexes.FetchIndex;

public interface ContactActionListener{
	public void init();
	public void term();

	public void preFetchAction(FetchObject<IRiakObject> fetchObj);
	public void postFetchAction(IRiakObject obj);
	
	public void preStoreAction(StoreObject<IRiakObject> storeObj);
	public void postStoreAction(IRiakObject obj);
	
	public void preDeleteAction();
	public void postDeleteAction(IRiakObject obj);

	public void preQuery2iAction(FetchIndex<?> idx);
	public void postQuery2iAction(List<?> data);

	public void preMapredAction();
	public void postMapredAction();
	
	public void preListBucketsAction();
	public void postListBucketsAction(Set<String> buckets);
	
	public void preListKeysAction(String bucket);
	public void postListKeysAction(List<String> keys);
	
	public void preGetBucketPropsAction(String bucket);
	public void postGetBucketPropsAction(Map<String, Object> props);
	
	public void preConnectAction(String host, String port);
	public void postConnectAction(String host, String port, IRiakClient client);
}
