package com.comapny.codewal34r;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcess set = new PaymentProcess();
		set.processPayment(new GooglePay());
		set.processPayment(new Paytm());
		set.processPayment(new PhonePay());
		set.processPayment(new AmazonePay());
		Payment payment = new Payment();
		set.processPayment(payment);
		AmazonePay set2 = new AmazonePay();
		set2.doDelivry();
	}

}
