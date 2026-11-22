package com.comapny.codewal36INterface3;

public interface IPayment {
	void pay(double amount);
	void refund(double amount);
	// Deafult method : optional override
	default void paymentReceipt(double amount) {
		validateAmount(amount);
		System.out.println("Payment succufull");
		System.out.println("receipt generate: RS. " + amount);
		
	}
	// static method : common utility
	static boolean isValidAmount(double amount) {
		return amount > 0;
	}
	private void validateAmount(double amount) {
		if (!isValidAmount(amount)) {
			throw new IllegalArgumentException("Invalid amount");
		}
		
	}

}
