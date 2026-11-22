package com.comapny.codewal36INterface2;

public class Driver1 {
	public static void main(String args[]) {
		IDelivery set = new Ekart();
		set.delivery();
		set.deliveryStatus();
		IDelivery set2 = new ExpressBi();
		set2.delivery();
		set2.deliveryStatus();
	}

}
