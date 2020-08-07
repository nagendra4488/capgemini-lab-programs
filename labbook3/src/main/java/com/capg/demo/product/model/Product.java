package com.capg.demo.product.model;

public class Product {

	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public Product(int productId, String productName, int productPrice) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	
}
