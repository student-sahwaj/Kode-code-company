package com.comapny.codewal31;

public class CreaditCardPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Piad " + amount + " Using Creadit Card");
		
	}

}
