package com.comapny.codewal31;

public class PaymentService {
      public void makePayment(IPayment iPayment, double amount) {
    	  iPayment.pay(amount);
      }
}
