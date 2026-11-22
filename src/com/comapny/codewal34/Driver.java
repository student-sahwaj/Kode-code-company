package com.comapny.codewal34;

public class Driver {

	public static void main(String[] args) throws IllegalAccessException {
		ParkingService parkingService = new ParkingService();
		Vehicle bike = new Bike("Bike101");
		Vehicle car = new Car("CAR106");
		Vehicle truk = new Truk("Truk105");
		// parking vehicles
		parkingService.parkVehicle(bike);
		parkingService.parkVehicle(car);
		parkingService.parkVehicle(truk);
		// calculate parking fees
		System.out.println("Bike fee: " + parkingService.calculateFree(car, 3));
		System.out.println("Car Fee: " + parkingService.calculateFree(car, 2));
		System.out.println("Truk fee: " + parkingService.calculateFree(truk, 4));

	}

}
