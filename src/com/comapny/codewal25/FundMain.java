package com.comapny.codewal25;

public class FundMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundTransfer set = new FundTransfer("Sahwaj", "1234654378", 1200, 1000);
//		System.out.println(set.getAcountHolderName());
//		System.out.println(set.getAcountNumber());
//		System.out.println(set.getAmount());
//		System.out.println(set.getBalance());
		set.doCredit(1000);
          System.out.println(set.getFund());
          set.doDebit(300);
          System.out.println(set.getFund());
	}

}
