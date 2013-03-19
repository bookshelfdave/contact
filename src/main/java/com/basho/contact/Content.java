package com.basho.contact;

public class Content {
	private Constants.ContentType contentType = null;
	private String value = null;
	
	public Content(Constants.ContentType contentType, String value) {
		super();
		this.contentType = contentType;
		this.value = value;
	}

	public Constants.ContentType getContentType() {
		return contentType;
	}

	public void setContentType(Constants.ContentType contentType) {
		this.contentType = contentType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return "<<" + this.contentType + ":" + this.value + ">>";
	}
	
}
