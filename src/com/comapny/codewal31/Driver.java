package com.comapny.codewal31;

class Employee{
	public void markIn() {
		System.out.println("Employee.markIN()........ Employee Marking IN");
	}
}
class HRManager extends Employee{
	@Override
	public void markIn() {
		System.out.println("HRmanager.markIN()........ HRManager Marking IN\"");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee set = new HRManager(); // Parents class can refer child class object
		set.markIn();// Same method will behave differents based on the actual object
		// 1. at the time of compilication, it will check the method's exits in class employee
		// 2. at the time of exucution(while running), it will the method on actual object

	}

}
