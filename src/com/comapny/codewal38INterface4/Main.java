package com.comapny.codewal38INterface4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UPI Payment using Lambda
		IPayment upi = (amount) -> {
			System.out.println("UPI Payment: Rs." + amount);
		};
		// Card Payment using Lambda
		IPayment card = (amount) -> {
			System.out.println("CARD Payment: RS." + amount);
		};
		IPayment wallet = (amount) -> {
			System.out.println("WALLET Payment: Rs." + amount);
		};
		IPayment.paymentInfo();
		System.out.println("\n--- UPI Payment ---");
		upi.paymentStatus();
		upi.pay(5000);
		System.out.println("\n--- Card Payment ---");
		card.paymentStatus();
		card.pay(3000);
		System.out.println("\n--- Wallet Payment ---");
		wallet.paymentStatus();
		wallet.pay(6000);

	}

}
