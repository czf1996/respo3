package com.hxzyan.book.domain;

import java.util.Date;

public class Order {
	private int id;
	private String ono;
	private Date otime;
	private double opay;
	private Date oderlivery;  //发货时间
	private double oallprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOno() {
		return ono;
	}
	public void setOno(String ono) {
		this.ono = ono;
	}
	
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public double getOpay() {
		return opay;
	}
	public void setOpay(double opay) {
		this.opay = opay;
	}
	
	public Date getOderlivery() {
		return oderlivery;
	}
	public void setOderlivery(Date oderlivery) {
		this.oderlivery = oderlivery;
	}
	public double getOallprice() {
		return oallprice;
	}
	public void setOallprice(double oallprice) {
		this.oallprice = oallprice;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", ono=" + ono + ", otime=" + otime + ", opay=" + opay + ", oderlivery=" + oderlivery
				+ ", oallprice=" + oallprice + "]";
	}

}
