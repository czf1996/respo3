package com.hxzyan.book.domain;
//购物车条目
public class CartItem {
	private int id;
	
	private int productId;
	
	private int number;
	
	private double price;

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", productId=" + productId + ", number=" + number + ", price=" + price + "]";
	}

}
