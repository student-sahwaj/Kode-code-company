package com.comapny.codewal34;

public class BikeFreeStaregy implements ParkingFreeStategy {

	@Override
	public double calculateFree(int hours) {
		return hours * 20;
	}

}
