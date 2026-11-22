package com.comapny.codewal25;

public class BankAcount {
	private String holderName;
	private int balance;
	public BankAcount(String holderName, int balance) {
		super();
		this.holderName = holderName;
//		this.balance = balance;
		setBalance(balance);
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance >=0) {
		this.balance = balance;
	}else {
		System.out.println("negative value");
	}
	}	
	

}
