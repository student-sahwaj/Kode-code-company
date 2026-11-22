package com.comapny.codewal34r;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryProcess set = new DeliveryProcess();
		set.processDelivey( new Ekart());
		set.processDelivey(new ExpressBi());
		set.processDelivey(new Swigy());
		Delivery set1 = new Delivery();
		set.processDelivey(set1);
		set.processDelivey(new Amazone());

	}

}
