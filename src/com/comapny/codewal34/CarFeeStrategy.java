package com.comapny.codewal34;

public class CarFeeStrategy implements ParkingFreeStategy {

	@Override
	public double calculateFree(int hours) {
		// TODO Auto-generated method stub
		return hours * 50;
	}

}
