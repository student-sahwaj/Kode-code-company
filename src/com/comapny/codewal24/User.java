package com.comapny.codewal24;

public class User {
	String name;
	String userId;
	String number;
	static {
		System.out.println(" I am in static init block");
	}
	public User(String name, String userId, String number) {
		super();
		System.err.println("String name, String userId, String number..... Constractor...)");
		this.name = name;
		this.userId = userId;
		this.number = number;
	}
	

}
