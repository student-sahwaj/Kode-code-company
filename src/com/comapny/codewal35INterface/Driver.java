package com.comapny.codewal35INterface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             IDiscount set = new FlightBooking();
             int result = set.calculateDiscount(2300000, 1000);
             System.out.println(result);
	}

}


