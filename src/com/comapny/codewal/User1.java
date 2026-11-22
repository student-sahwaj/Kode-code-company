package com.comapny.codewal;

public class User1 {
	

	public User1(String string) {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city1 = "Bangalore";
		String city2 = "Bangalore";
		String city3 = "Bangalore";
		String city4 = "Bangalore";
		System.out.println(city1 == city2);
		
		System.out.println(city1.equals(city4));
		User1 set = new User1("Kodewala");
		User1 set1 = new User1("Kodewala");
		System.out.println(set.equals(set1));
 
 
  }

}
