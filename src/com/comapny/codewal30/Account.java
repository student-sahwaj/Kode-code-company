package com.comapny.codewal30;

public class Account {
	String accountNumber;
	String holderName;
	int balance;
	public Account(String accountNumber, String holderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	void deposite(int amount) {
		if(balance > 0) {
			balance += amount;
//			System.out.println("Available Balance: " + amount);
		}
	}
	void deposite(double amount) {
		balance += amount;
	}
	void deposite(int amount,int bonus) {
		balance += amount + bonus;
	}
	void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Acount HolderName: " + holderName);
		System.out.println("Balance: " + balance);
	}

}
