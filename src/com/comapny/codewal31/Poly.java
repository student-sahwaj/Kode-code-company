package com.comapny.codewal31;

class User {
	
}
class AdminUser extends User{
	
}

public class Poly {

	public static void main(String[] args) {
		User set = new User(); // User class is reffering user class object
		AdminUser set1 = new AdminUser();
      
		User set2 = new AdminUser();// parents class can refer child class object --> auto up-casting
		Object set3 = new AdminUser();
		AdminUser set4 = (AdminUser)new User();//child class is reffering parents class object --> down casting
		
	}

}
