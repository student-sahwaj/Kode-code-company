package com.comapny.codewal25;

//import java.io.ObjectInputStream.GetField;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee set = new Employee(101, "Sahwaj", 30000);
//		System.out.println(set.Id);
		set.displayDetails();
		System.out.println("\n After Salary Increament");
		set.increaseSalary(5000);
		System.out.println("Updated Salary : " + set.getSalary());
		System.out.println(set.getAnunualSalary());

	}

}
 