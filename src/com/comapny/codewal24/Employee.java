package com.comapny.codewal24;

public class Employee {
	String employeeName;
	String employeeId;
	String employeeType;
	public static int liveUserCount =0;
	// constructor start
	public Employee(String employeeName, String employeeId, String employeeType) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeType = employeeType;
	}
	public Employee(String employeeName, String employeeType) {
		super();
		this.employeeName = employeeName;
		this.employeeType = employeeType;
	}
	public Employee() {
		super();
	}
	{
		liveUserCount = liveUserCount +1;
	}

}
