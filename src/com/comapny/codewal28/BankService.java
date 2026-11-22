package com.comapny.codewal28;

import java.math.BigDecimal;

public class BankService {
	public void deposit( Account account, double amount ) {
		 account.deposit(amount);
		 Transaction transaction = new Transaction(account.getAccountNumber(),BigDecimal.valueOf(amount), "DEPOSITE");
		 transaction.displayTransaction();
	}
	public void withdraw(Account account, double amount) {
		account.withdraw(amount);
		Transaction transaction = new Transaction(account.getAccountNumber(),BigDecimal.valueOf(amount),"Withdraw");
		transaction.displayTransaction();
	}
	public void checkBalance(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Avaialble Balance: " + account.getBalance());
	}

}
