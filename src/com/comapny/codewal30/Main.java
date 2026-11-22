package com.comapny.codewal30;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account set = new Account("87468383d", "Sahwaj", 23000);
//		set.displayDetails();
		set.deposite(100);
		set.deposite(2600);
		set.deposite(2000, 90);
		set.displayDetails();

	}

}
