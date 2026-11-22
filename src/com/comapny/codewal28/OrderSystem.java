package com.comapny.codewal28;

public class OrderSystem {
	public void placeOrder(String item) {
		System.out.println("Processing for order item: " + item);
		checkStock();
		chargeMoney();
		System.out.println("order completed:");
		
	}
	// core functionaties other classes can't use.
	private void checkStock() {
		System.out.println("checkStock");
	}
	//core functionaties other classes can't use. 
	private void chargeMoney() {
		System.out.println("payment processes");
	}

}
