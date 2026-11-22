package com.comapny.codewal28;

public class SBI extends Bank {
	@Override
	public void withdraw(double amount) {
		System.out.println("SBI withdrawal processing...");
		System.out.println("withdraw amount: " + amount);
	}
	@Override
	public void deposite(double amount) {
		System.out.println("SBI deposite processing...");
		System.out.println("deposite amount: " + amount);
		
	}

}
