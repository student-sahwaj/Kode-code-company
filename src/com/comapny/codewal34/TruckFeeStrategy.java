package com.comapny.codewal34;

public class TruckFeeStrategy implements ParkingFreeStategy {

	@Override
	public double calculateFree(int hours) {
		// TODO Auto-generated method stub
		return hours * 100;
	}

}
