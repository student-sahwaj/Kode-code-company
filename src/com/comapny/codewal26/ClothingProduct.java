package com.comapny.codewal26;

public class ClothingProduct extends ElectronicProduct {
 String type;
 int price;
 // Constructor
 public ClothingProduct(String productName, String des, int quantity, String status, boolean isWaranty,
		int warrantyINyears, String type, int price) {
	super(productName, des, quantity, status, isWaranty, warrantyINyears);
	this.type = type;
	this.price = price;
 }
 public void viewClothingProduct() {
	 System.out.println(productName);
	 System.out.println(des);
	 System.out.println(quantity);
	 System.out.println(status);
	 System.out.println(isWaranty);
	 System.out.println(warrantyINyears);
	 System.out.println(type);
	 System.out.println(price);
	 
 }
}
