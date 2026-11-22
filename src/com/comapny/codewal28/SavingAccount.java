package com.comapny.codewal28;

import java.math.BigDecimal;

import javax.naming.InitialContext;

public class SavingAccount implements Account {
	private final String accountNumber;
	private BigDecimal balance;
	private static final BigDecimal MININUM_BALANCE= new   BigDecimal("1000.00");

	public SavingAccount(String accountNumber, BigDecimal initialBalance) {
		if(initialBalance.compareTo(MININUM_BALANCE)<0) {
			throw new IllegalArgumentException("MInimum balance required: 100");
		}
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		balance = balance.add(BigDecimal.valueOf(amount));
		System.out.println("Saving deposite successful");
		
	}

	@Override
	public void withdraw(double amount) {
		BigDecimal withdraw = BigDecimal.valueOf(amount);
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		BigDecimal remaining = balance.subtract(withdraw);
		if (remaining.compareTo(MININUM_BALANCE)<0) {
			throw new IllegalArgumentException("Minimum balance must be maintained");
		}
		balance = remaining;
		System.out.println("Savings withdrawal successful");
		
	}

	@Override
	public double getBalance() {
		return balance.doubleValue();
	}

	@Override
	public String getAccountNumber() {
		
		return accountNumber;
	}

}
