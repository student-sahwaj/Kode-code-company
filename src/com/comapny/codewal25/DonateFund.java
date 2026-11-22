package com.comapny.codewal25;

public class DonateFund {
	String accountHolderName;
	String accountNumber;
	int balance;
	int amount;
	public DonateFund(String accountHolderName, String accountNumber, int balance, int amount) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	}
	public void doCredit() {
		if (amount > 0) {
			balance = amount + balance;
		}
	}
	public void doDebit() {
		balance = amount - balance;
	}
	int getFund() {
		return balance;
	}

}
