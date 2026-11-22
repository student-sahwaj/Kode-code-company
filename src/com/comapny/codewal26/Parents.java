package com.comapny.codewal26;

public class Parents {
	String name;
	int money;
	int land;
	int noOfHouse;
	public Parents(String name, int money, int land, int noOfHouse) {
		super();
		this.name = name;
		this.money = money;
		this.land = land;
		this.noOfHouse = noOfHouse;
	}
	public void viewParentsDetails() {
		System.out.println(name);
		System.out.println(money);
		System.out.println(land);
		System.out.println(noOfHouse);
	}

}
