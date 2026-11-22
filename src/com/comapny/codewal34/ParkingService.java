package com.comapny.codewal34;

import java.util.*;

public class ParkingService {
	private List<ParkingSpot>parkingSpots;
	private Map<Class<? extends Vehicle>, ParkingFreeStategy> freeStartegies;
	public ParkingService() {
		parkingSpots = new ArrayList<>();
		freeStartegies = new HashMap<>();
		
		// adding parking spots
		parkingSpots.add(new BikeParkingSpot(1));
		parkingSpots.add(new BikeParkingSpot(2));
		parkingSpots.add(new CarParkingSpot(3));
		parkingSpots.add(new CarParkingSpot(4));
		parkingSpots.add(new TrukParkingSpot(5));
		
		// adding free startegies
		freeStartegies.put(Bike.class, new BikeFreeStaregy());
		freeStartegies.put(Car.class, new CarFeeStrategy());
		freeStartegies.put(Truk.class, new TruckFeeStrategy());
	}
	// park Vehicle
	public ParkingSpot parkVehicle(Vehicle vehicle) {
		for (ParkingSpot spot : parkingSpots) {
			if (spot.parkVehicle(vehicle)) {
				System.out.println(vehicle.getVehicleNumber() + " parked at spot" + spot.spotID);
			
			return spot;
			}
		}
		System.out.println("No parking spot availble");
		return null;
	}
	public double calculateFree(Vehicle vehicle, int hours) throws IllegalAccessException {
		ParkingFreeStategy freeStategy = freeStartegies.get(vehicle.getClass());
		if (freeStategy == null) {
			throw new IllegalAccessException("NO fee strategy found");
		}
		return freeStategy.calculateFree(hours);
	}

}
