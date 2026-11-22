package com.comapny.codewal34;

public class CarParkingSpot extends ParkingSpot {

	public CarParkingSpot(int spotID) {
		super(spotID);
		
	}

	@Override
	public boolean canFitVehicle(Vehicle vehicle) {
		return vehicle instanceof Car ;
	}

}
