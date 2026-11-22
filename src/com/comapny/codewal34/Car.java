package com.comapny.codewal34;

public class Car extends Vehicle{

	public Car(String vehicleNumber) {
		super(vehicleNumber);
	}

	@Override
	public String getVehicleType() {
		return "CAR";
	}

}
