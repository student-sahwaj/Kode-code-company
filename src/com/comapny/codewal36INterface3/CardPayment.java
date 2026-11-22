package com.comapny.codewal36INterface3;

public class CardPayment implements IPayment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(" payment through CARD: RS. " + amount);
		
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Card refund amount RS: " + amount);
		
	}
	@Override
	public void paymentReceipt(double amount) {
		System.out.println(" payment through CARD: RS.  generated");
		System.out.println("Amount: RS. " + amount);
	}

}
