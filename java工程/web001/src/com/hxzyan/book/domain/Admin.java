package com.hxzyan.book.domain;

public class Admin {
	private int id;
	private String aname;
	private String aaccount;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAaccount() {
		return aaccount;
	}
	public void setAaccount(String aaccount) {
		this.aaccount = aaccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", aname=" + aname + ", aaccount=" + aaccount + ", password=" + password + "]";
	}
	

}
