package com.comapny.codewal26;

public class Child extends Parents {
 String type;
 String address;
 public Child(String name, int money, int land, int noOfHouse, String type, String address) {
	super(name, money, land, noOfHouse);
	this.type = type;
	this.address = address;
 }
      public void viewChildDetails() {
    	  System.out.println(name);
  		System.out.println(money);
  		System.out.println(land);
  		System.out.println(noOfHouse);
  		System.out.println(type);
  		System.out.println(address);
      }
      
}
