package com.comapny.codewal34;

public abstract class Vehicle {
	private String vehicleNumber;

	public Vehicle(String vehicleNumber) {
		super();
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
		
	}
	public abstract String getVehicleType();

}
