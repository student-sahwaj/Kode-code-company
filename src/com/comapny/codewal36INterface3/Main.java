package com.comapny.codewal36INterface3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling static interface method
		IDelivery.companyInfo();
		System.err.println(".....Ekart Delivery... ");
		IDelivery ekart = new Ekart();
		ekart.delivey();
		ekart.tractOrder();
		ekart.showDeliveryCharge();
		System.out.println(".... ExpressBi Delivery....");
		IDelivery express = new ExpressBi();
		express.delivey();
		express.tractOrder();
		express.showDeliveryCharge();

	}

}


//Method 	Simple meaning
//Abstract	Forcefully implement
//Default	Optional override
//Static	     Common utility
//Private	Internal code reuse

