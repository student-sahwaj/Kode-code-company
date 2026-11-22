package com.comapny.codewal34;

public class BikeParkingSpot extends ParkingSpot {

	public BikeParkingSpot(int spotID) {
		super(spotID);

	}

	@Override
	public boolean canFitVehicle(Vehicle vehicle) {
		return vehicle instanceof Bike;
	}

}
