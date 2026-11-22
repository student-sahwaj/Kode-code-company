package com.comapny.codewal34;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Delivery set = (Delivery)new ExpressBi();
		set.doDelivery();
		
		Delivery del = new ExpressBi();
		ExpressBi set1 = (ExpressBi) set;
		set1.doDelivery();

	}

}
