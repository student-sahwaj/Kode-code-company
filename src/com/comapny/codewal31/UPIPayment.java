package com.comapny.codewal31;

public class UPIPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " Using UPI Payment");
		
	}

}
