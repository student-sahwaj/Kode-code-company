package com.comapny.codewal36INterface3;

public class BikeDelivery implements Delivey  {

	public void assignDeliveryPartner() {
		// TODO Auto-generated method stub
		System.out.println("Bike delivery partner assigned");
		
	}

	@Override
	public void calcualteDeliveryCharge(double distance) {
		// TODO Auto-generated method stub
		double charge = distance *10;
		System.out.println("Bike delivery charge: Rs. " + charge);
		
	}

	public void startDelivery() {
		// TODO Auto-generated method stub
		
	}

}
