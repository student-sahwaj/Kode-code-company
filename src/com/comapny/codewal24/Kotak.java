package com.comapny.codewal24;

public class Kotak {
	String name;
	String userId;
	String mobileNumber;
	// Object :- Two types 
	// 1 . Static Init Block.
	// 2. Instance Init Block.
	// Static block will get executed just after then class Loading
	// and One time Execution and that will be executed before object Creation
     // Object are So many created but static block executed Only one Time;
	static {
		System.out.println(" i am in static init Block1...");
		System.out.println(" i am in static init Block2...");
		System.out.println(" i am in static init Block3...");
	}
	public Kotak(String name, String userId, String mobileNumber) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
	

}
