package com.comapny.codewal26;

public class ElectronicProduct extends Product {
	boolean isWaranty;
	int warrantyINyears;
	public ElectronicProduct(String productName, String des, int quantity, String status, boolean isWaranty,
			int warrantyINyears) {
		super(productName, des, quantity, status);
		this.isWaranty = isWaranty;
		this.warrantyINyears = warrantyINyears;
	}
	public void viewElectronicProduct() {
		System.out.println(productName);
		System.out.println(des);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWaranty);
		System.out.println(warrantyINyears);
	}
	

}
