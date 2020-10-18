package com.contact.model;

import lombok.Data;

@Data
public class Contact {

	private Integer cid;
	private String cname;
	private String cnum;
	private String email;
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", cname=" + cname + ", cnum=" + cnum + ", email=" + email + "]";
	}
	
}
