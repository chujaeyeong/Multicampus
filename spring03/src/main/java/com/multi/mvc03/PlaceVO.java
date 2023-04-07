package com.multi.mvc03;

public class PlaceVO {
	private String name;
	private String url;
	private String content;
	private String userid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		return "PlaceVO [name=" + name + ", url=" + url + ", content=" + content + ", userid=" + userid + "]";
	}
	
	
}
