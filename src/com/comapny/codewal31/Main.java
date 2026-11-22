package com.comapny.codewal31;

public class Main {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		IPayment creaditcard = new CreaditCardPayment();
		IPayment upi = new UPIPayment();
		IPayment netBanking = new NetBanking();
		IPayment wallet = new WalletPayment();
		paymentService.makePayment(creaditcard, 4000);
		paymentService.makePayment(upi, 2000);
		paymentService.makePayment(wallet, 300);
		paymentService.makePayment(netBanking, 40000);

	}

}
