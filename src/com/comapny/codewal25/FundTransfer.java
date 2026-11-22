package com.comapny.codewal25;

public class FundTransfer {
	 private String acountHolderName;
	 private String acountNumber;
	 private int   balance;
	 private int  amount;
	public FundTransfer(String acountHolderName, String acountNumber, int balance, int amount) {
		super();
		this.acountHolderName = acountHolderName;
		this.acountNumber = acountNumber;
		this.balance = balance;
		this.amount = amount;
	}
	public void doCredit( int amount) {
		if (amount > 0) {
			balance += amount;
			
		}

	}
	public void doDebit(int amount) {
		balance = amount -balance;
	}
	public String getAcountHolderName() {
		return acountHolderName;
	}
	public void setAcountHolderName(String acountHolderName) {
		this.acountHolderName = acountHolderName;
	}
	
	public String getAcountNumber() {
		return acountNumber;
	}
	
	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getFund() {
		// TODO Auto-generated method stub
		return balance;
	}

}
