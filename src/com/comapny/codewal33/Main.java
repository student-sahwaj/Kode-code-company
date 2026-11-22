package com.comapny.codewal33;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount set = new BankAccount("Sahwaj", 12000);
		set.depit(11000);
		set.withdraw(5000);
		System.out.println(set.getBalance());

	}

}
