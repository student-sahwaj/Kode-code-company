package com.comapny.codewal31;

public class WalletPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("paid " + amount + "Using Wallet Payment");
		
	}

}
