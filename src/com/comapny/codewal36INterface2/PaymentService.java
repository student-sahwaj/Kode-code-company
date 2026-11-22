package com.comapny.codewal36INterface2;

public class PaymentService {
	private final Payment payment;

	public PaymentService(Payment payment) {
		super();
		this.payment = payment;
	}
	public void makePayment(double amount) {
		payment.pay(amount);
	}

}
