package com.comapny.codewal33;

public class Account {
	private int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void credit(int i) {
		System.out.println("credit of the money");
		balance += balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
