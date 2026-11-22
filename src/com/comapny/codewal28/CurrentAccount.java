package com.comapny.codewal28;

import java.math.BigDecimal;
import javax.naming.InitialContext;

public class CurrentAccount implements Account
{
	private final String accountNumber;
	private BigDecimal balance;
	private static final BigDecimal OVERDRAFT_LIMIT = new BigDecimal("10000.00");
	

	public CurrentAccount(String accountNumber, BigDecimal initialBalance) {
		if (initialBalance.compareTo(BigDecimal.ZERO)< 0) {
			throw new IllegalArgumentException("Invalid balance");
		}

		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		if (amount <=0) {
			throw new IllegalArgumentException("Invalid");
		}
		balance = balance.add(BigDecimal.valueOf(amount));
		System.out.println("Current account deposit successful");
		
	}

	@Override
	public void withdraw(double amount) {
		BigDecimal  withdraw = BigDecimal.valueOf(amount);
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		BigDecimal remaining = balance.subtract(withdraw);
		if (remaining.compareTo(OVERDRAFT_LIMIT.negate())<0) {
			throw new IllegalArgumentException("Overdraft limit exceeded");
		}
		balance = remaining;
		System.out.println("Current account withdrawal successful");
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
