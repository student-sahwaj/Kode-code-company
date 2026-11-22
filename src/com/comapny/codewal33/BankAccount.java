package com.comapny.codewal33;

public class BankAccount {
	private String accountHolder;
	private double balance;
	public BankAccount(String accountHolder, double balance0) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance0;
	}
	public void depit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount");
			return;
		}
		balance += amount;
		System.out.println("Deposite : " + amount);
		
	}
	public void withdraw(double amount) {
		if (amount <= 0 || amount > balance) {
			System.out.println("Invalid amount");
		}
		balance -= amount;
		System.out.println("Withdraw: " + amount);
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
