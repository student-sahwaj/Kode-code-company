package com.comapny.codewal36INterface2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment set = new UpiPayment();
		PaymentService set1 = new PaymentService(set);
		set1.makePayment(2300);
		Payment payment = new CreaditCardPayment();
		PaymentService set2 = new PaymentService(payment);
		payment.pay(5000);

	}

}
