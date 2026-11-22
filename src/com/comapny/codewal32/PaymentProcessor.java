package com.comapny.codewal32;

public class PaymentProcessor {
    public void processPayment(Payment payment) { // can accept any type of object
//    	   Payment payemnt1 = new Payment();
//    	   Payment payment2 = new NetBankingPayment();
//    	   Payment payment3 = new CreditCardPayment();
    	       payment.doPayemnt();// polymorphism
    }
}
