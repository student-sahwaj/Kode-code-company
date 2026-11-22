package com.comapny.codewal30;

public class PaymentService {
	void processPayemnt(double amount) {
		System.out.println("Payemnt Amount: " + amount);
	}
	
	void processPayemnt(double amount,String mode) {
		System.out.println("Amount RS.: " + amount);
		System.out.println("payment Mode: " + mode);
	}
	void processPayemnt(double amount, String mode, String transtionId) {
		System.out.println("Amount : Rs.: " + amount);
		System.out.println("Payment Mode: " + mode);
		System.out.println("TranstionId : " + transtionId);
	}
}
