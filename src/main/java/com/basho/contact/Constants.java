package com.basho.contact;

public class Constants {

	// todo: move to Content
	public enum ContentType {
		TEXT ("text/plain"),
		JSON ("application/json"),
		XML ("application/xml"),
		// TODO
		USER_DEFINED ("");
		
		private String contentType;  
		ContentType(String value) {
			contentType = value;
		}
		
		public String toString() {
			return contentType;
		}
	}
	
	public enum MRPhaseType {
		MAP,
		REDUCE,
		LINK
	}
	
	public enum MRLang {
		JAVASCRIPT,
		ERLANG
	}
}
