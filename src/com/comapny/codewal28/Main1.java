package com.comapny.codewal28;

import java.math.BigDecimal;

public class Main1 {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		Account saving = new SavingAccount("SBI1001", new BigDecimal("10000"));
		// creating current Account
		Account current = new CurrentAccount("SBI2001", new BigDecimal("5000"));
		System.out.println(".... SAVING ACCOUNT...");
		bankService.checkBalance(saving);
		bankService.deposit(saving, 20000);
		bankService.withdraw(saving, 3000);
		bankService.checkBalance(saving);
		System.out.println("...... \n.... Current Account......");
		bankService.checkBalance(current);
		bankService.deposit(current, 12000);
		bankService.withdraw(current, 23000);
		bankService.checkBalance(current);

	}

}
