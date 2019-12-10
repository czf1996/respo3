package com.hxzyan.book.domain;
//¶©µ¥ÌõÄ¿
public class OrderItem {
	private int id;
	private int productId;
	private int orderId;
	private int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", productId=" + productId + ", orderId=" + orderId + ", number=" + number + "]";
	}
	
}
