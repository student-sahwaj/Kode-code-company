package com.comapny.codewal34r;
/**
 * O — Open/Closed Principle (OCP)

   Suppose you want to add a new payment method, AmazonPay. Create a new class:
 */
public class AmazonePay extends Payment {
	public void doPayment() {
		System.out.println("AmazonePay.doPayment().....");
	}
	public void doDelivry() {
		System.out.println("AmazonePay.doPayment()");
	}

}
