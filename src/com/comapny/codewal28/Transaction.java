package com.comapny.codewal28;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
	private final String transactionId;
	private String accountNumber;
	private BigDecimal amount;
	private String transactiontype;
	private LocalDateTime transactionTime;
	public Transaction( String accountNumber, BigDecimal amount, String transactiontype) {
	} {
		this.transactionId = java.util.UUID.randomUUID().toString();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactiontype = transactiontype;
		this.transactionTime = transactionTime.now();
	}
	public void displayTransaction() {
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Account: " + accountNumber);
		System.out.println("Amount: " + amount);
		System.out.println("Type: " + transactiontype);
		  System.out.println("Time: " + transactionTime);
		
	}

}
