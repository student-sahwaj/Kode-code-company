package com.comapny.codewal38INterface4;

public interface IPayment {
	void pay(double amount);
	default void paymentStatus() {
		System.out.println("Payment processing...");
	}
	static void paymentInfo() {
		System.out.println("Welcome to Payment System");
	}
	

}
