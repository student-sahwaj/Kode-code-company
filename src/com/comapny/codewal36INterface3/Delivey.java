package com.comapny.codewal36INterface3;

public interface Delivey {
	// Abstract  method
	void assignDeliveryPartner();
	void calcualteDeliveryCharge(double distance);
	default void sendDeliveryNotification() {
		System.out.println("Your order is out for delivery!");
	}
	static void deliveryCompanyInfo() {
		System.out.println("Welcome to Food Delivery Service");
	}
	private void connectTodeliverySystem() {
		System.out.println("Connected to delivery system");
	}
	// deafult method using private method
	default void startDelivery() {
		connectTodeliverySystem();
		System.out.println("Delivery started successfully");
	}

}
