package com.basho.contact.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.operations.FetchObject;
import com.basho.riak.client.operations.StoreObject;
import com.basho.riak.client.query.indexes.FetchIndex;

public class ListenerNotifier implements ContactActionListener {

	List<ContactActionListener> listeners = new ArrayList<ContactActionListener>();
	
	public void addListener(ContactActionListener listener) {
		listener.init();
		listeners.add(listener);
	}
	
	@Override
	public void init() {
		for(ContactActionListener l : listeners) {
			l.init();
		}
	}

	@Override
	public void term() {
		for(ContactActionListener l : listeners) {
			l.term();
		}
	}

	@Override
	public void preFetchAction(FetchObject<IRiakObject> fetchObj) {
		for(ContactActionListener l : listeners) {
			l.preFetchAction(fetchObj);
		}

	}

	@Override
	public void postFetchAction(IRiakObject obj) {
		for(ContactActionListener l : listeners) {
			l.postFetchAction(obj);
		}
	}

	@Override
	public void preStoreAction(StoreObject<IRiakObject> storeObj) {
		for(ContactActionListener l : listeners) {
			l.preStoreAction(storeObj);
		}
	}

	@Override
	public void postStoreAction(IRiakObject obj) {
		for(ContactActionListener l : listeners) {
			l.postStoreAction(obj);
		}
	}

	@Override
	public void preDeleteAction() {
		for(ContactActionListener l : listeners) {
			l.preDeleteAction();
		}
	}

	@Override
	public void postDeleteAction(IRiakObject obj) {
		for(ContactActionListener l : listeners) {
			l.postDeleteAction(obj);
		}
	}

	@Override
	public void preQuery2iAction(FetchIndex<?> index) {
		for(ContactActionListener l : listeners) {
			l.preQuery2iAction(index);
		}
	}

	@Override
	public void postQuery2iAction(List<?> data) {
		for(ContactActionListener l : listeners) {
			l.postQuery2iAction(data);
		}
	}

	@Override
	public void preMapredAction() {
		for(ContactActionListener l : listeners) {
			l.preMapredAction();
		}
	}

	@Override
	public void postMapredAction() {
		for(ContactActionListener l : listeners) {
			l.postMapredAction();
		}
	}

	@Override
	public void preListBucketsAction() {
		for(ContactActionListener l : listeners) {
			l.preListBucketsAction();
		}
	}

	@Override
	public void postListBucketsAction(Set<String> buckets) {
		for(ContactActionListener l : listeners) {
			l.postListBucketsAction(buckets);
		}
	}

	@Override
	public void preListKeysAction(String bucket) {
		for(ContactActionListener l : listeners) {
			l.preListKeysAction(bucket);
		}
	}

	@Override
	public void postListKeysAction(List<String> keys) {
		for(ContactActionListener l : listeners) {
			l.postListKeysAction(keys);
		}		
	}

	@Override
	public void preGetBucketPropsAction(String bucket) {
		for(ContactActionListener l : listeners) {
			l.preGetBucketPropsAction(bucket);
		}	
	}

	@Override
	public void postGetBucketPropsAction(Map<String, Object> props) {
		for(ContactActionListener l : listeners) {
			l.postGetBucketPropsAction(props);
		}	
	}

	@Override
	public void preConnectAction(String host, String port) {
		for(ContactActionListener l :listeners) {
			l.preConnectAction(host, port);
		}		
	}

	@Override
	public void postConnectAction(String host, String port, IRiakClient client) {
		for(ContactActionListener l :listeners) {
			l.postConnectAction(host, port, client);
		}
	}
	
	
}
