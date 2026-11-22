package com.comapny.codewal33;

public class Account1 {
	private int balance;
	
	public Account1(int balance) {
		super();
		this.balance = balance;
	}
	public void credit() {
		checkBalance();
		validatePin("sah123");
		System.out.println("credit of the money");
	}
	private int checkBalance() {
		System.out.println("Account.credit()..... doing fund transfer");
		return 2000;
		
	}
	private boolean validatePin(String userId) {
		System.out.println("validatePin.credit()..... doing fund transfer");
		return true;
	}
	
	

}
