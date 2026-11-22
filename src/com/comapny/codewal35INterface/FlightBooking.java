package com.comapny.codewal35INterface;

public class FlightBooking implements IDiscount {

	@Override
	public int calculateDiscount(int amount, int rate) {
		// TODO Auto-generated method stub
		int finalFare = amount-(amount * rate) / 100;
		return finalFare;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		// TODO Auto-generated method stub
		System.out.println("FlightBooking implements IDiscount");
		
	}

}
