package com.hxzyan.book.domain;

public class User {
	private int id;
	private String uname;
	private String uaccount;
	private String upassword;
	private String uaddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaccount() {
		return uaccount;
	}
	public void setUaccount(String uaccount) {
		this.uaccount = uaccount;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", uaccount=" + uaccount + ", upassword=" + upassword
				+ ", uaddress=" + uaddress + "]";
	}
	
}
