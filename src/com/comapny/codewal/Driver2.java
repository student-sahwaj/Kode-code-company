package com.comapny.codewal;

class User {

	public User(String string) {
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

		User set1 = new User("kodewal");
		User set2 = new User("Kodewal");
		System.out.println(set1.equals(set2));

	}
}
