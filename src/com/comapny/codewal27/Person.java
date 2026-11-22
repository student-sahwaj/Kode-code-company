package com.comapny.codewal27;
 class Man{
	void student() {
		System.out.println("good");
	}
}
    class Teacher extends Man{
	void teaching() {
		System.out.println("good");
	}
}

public class Person {
	public static void main(String[]args) {
//		Person1 set = new Person1();
//		set.student();
		Teacher set = new Teacher();
		set.student();
		set.teaching();
		}

}
