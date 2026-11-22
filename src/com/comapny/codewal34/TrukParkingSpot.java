package com.comapny.codewal34;

public class TrukParkingSpot extends ParkingSpot {

	public TrukParkingSpot(int spotID) {
		super(spotID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFitVehicle(Vehicle vehicle) {
		return vehicle instanceof Truk;
	}

}
