package com.comapny.codewal30;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService set = new PaymentService();
		set.processPayemnt(1300.0);
		set.processPayemnt(2300, "UPI");
		set.processPayemnt(4500, "UPI", "Creadit card");
	}

}
 

//Difference between Upcasting and Downcasting
//Upcasting	                   Downcasting
//Child → Parent reference	   Parent → Child reference
//Implicit hoti hai	             Explicit cast required hota hai
//Generally safe                 	Galat cast par ClassCastException ho sakta hai
//Child-specific methods directly accessible nahi hote	Child-specific methods accessible hote hain