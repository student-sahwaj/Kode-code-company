package com.comapny.codewal31;

public class NetBanking implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("paid " + amount + "Using Net Banking");
		
	}

}
