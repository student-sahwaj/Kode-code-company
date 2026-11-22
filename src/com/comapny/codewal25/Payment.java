package com.comapny.codewal25;

public class Payment { 
	 private int amount;

	public Payment(int amount) {
		super();
		this.amount = amount;
	}
	
	public   void  doDebit(int balance) {
		amount = amount -balance;
	}
	public void doCredit(int balance) {
		if (balance > 0) {
			amount = amount + balance;
		}
	}
	public int getAmount() {
		return amount;
	}
	

}
