package com.comapny.codewal25;

public class Employee {
	private int Id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.Id = id;
		this.name = name;
//		this.salary = salary;
		setSalary(salary);
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		this.Id = Id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary > 0) {
		this.salary = salary;
		}else {
			System.out.println("envalid salary");
		}
	}
	public void increaseSalary(double amount) {
		if (amount > 0) {
			salary = salary + amount;
			System.out.println("salary increase succeffuly!");
		}else {
			System.out.println("invalid increament amount!");
		}
	}
	public double getAnunualSalary() {
		return salary *12;
	}
	
    public void displayDetails() {
    	System.out.println("Employee Id: " + Id);
    	System.out.println("Name: " + name);
    	System.out.println("Monthly Salary: " + salary);
    	System.out.println("Annual salary: " + getAnunualSalary());
    }
}
