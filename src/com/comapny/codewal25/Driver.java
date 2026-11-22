package com.comapny.codewal25;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundTransfer set = new FundTransfer("Sahwaj", "Kotak357862547", 23000, 10000);
		System.out.println(set.getAcountHolderName());
		System.out.println(set.getAcountNumber());
		System.out.println(set.getAmount());
		System.out.println(set.getBalance());

	}

}
