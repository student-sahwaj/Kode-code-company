package com.comapny.codewal26;

public class Product {
	String productName;
	String des;
	int quantity;
	String status;
	public Product(String productName, String des, int quantity, String status) {
		super();
		this.productName = productName;
		this.des = des;
		this.quantity = quantity;
		this.status = status;
	}
	public void viewProdctDetails() {
		System.out.println(productName);
		System.out.println(des);
		System.out.println(quantity);
		System.out.println(status);
	}

}
