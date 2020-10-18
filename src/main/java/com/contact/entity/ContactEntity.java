package com.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contact")
public class ContactEntity {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer cid;
	@Column(name="contactName")
	private String cname;
	@Column(name="contactNumber")
	private String cnum;
	@Column(name="email")
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
