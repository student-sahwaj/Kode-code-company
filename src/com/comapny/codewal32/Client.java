package com.comapny.codewal32;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor set = new PaymentProcessor();
		// for the user#1, he/she selected payment method as a credit card
		CreditCardPayment cardPayemnt = new CreditCardPayment();
		set.processPayment(cardPayemnt);
		// for the user#2, he/she selected payment method as a credit card
				NetBankingPayment netPayemnt = new NetBankingPayment();
				set.processPayment(netPayemnt);
		// for the user#3, he/she selected payment method as a credit card
				UPIPayemnt upiPayemnt = new UPIPayemnt();
				set.processPayment(upiPayemnt);		
	}

}
