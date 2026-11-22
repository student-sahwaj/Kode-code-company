package com.comapny.codewal36INterface3;

public class UpiPayment implements IPayment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(" payment through UPI: RS. " + amount);
		
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI refund amount RS: " + amount);
		
	}

}
