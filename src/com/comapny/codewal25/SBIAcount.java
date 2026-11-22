package com.comapny.codewal25;

import java.util.Set;

public class SBIAcount {
    private String holderName;
    private int balance;
	public SBIAcount(String holderName, int balance) {
		super();
		this.holderName = holderName;
		setBalance(balance);
	}

	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance >= 0) {
			this.balance = balance;
			
		} else {
			System.out.println("NEGATIVE BALANCE");
		}
//		this.balance = balance;
	}
//	public void 
	
    
}
