package com.hxzyan.book.domain;

import java.util.Date;

public class Book {
	private int id;
	private String bname;
	private  double bprivce;
	private String bphoto;   //图片的地址
	private int  flag;//0.未上架   1. 上架  2 .下架
	private int bnumber;
	private String bauthor;
	private String bpress;   //出版社
	private String bdescribe;
	private String bdate;;   //上架时间
	private int cid;   //外键
	
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprivce() {
		return bprivce;
	}
	public void setBprivce(double bprivce) {
		this.bprivce = bprivce;
	}
	public String getBphoto() {
		return bphoto;
	}
	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBpress() {
		return bpress;
	}
	public void setBpress(String bpress) {
		this.bpress = bpress;
	}
	public String getBdescribe() {
		return bdescribe;
	}
	public void setBdescribe(String bdescribe) {
		this.bdescribe = bdescribe;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", bprivce=" + bprivce + ", bphoto=" + bphoto + ", flag=" + flag
				+ ", bnumber=" + bnumber + ", bauthor=" + bauthor + ", bpress=" + bpress + ", bdescribe=" + bdescribe
				+ ", bdate=" + bdate + ", cid=" + cid + "]";
	}
	
	
}
