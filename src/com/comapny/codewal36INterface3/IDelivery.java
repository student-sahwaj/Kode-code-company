package com.comapny.codewal36INterface3;

public interface IDelivery {
	// abstract method
	// Forces implementing classes to provide their own implementation
	void delivey();
	// Default method use for optional method
	// Provides a common method implementation to implementing classes
	default void tractOrder() {
		System.out.println("IDelivery.tractOrder().....");
		validateOrder();
	}
     // Static method use for common utilize
	static void companyInfo() {
		System.out.println("IDelivery.companyInfo()..");
	}
	// private method (java 9+)
	// Reuses internal code inside interface methods
	private void validateOrder() {
		System.out.println("order validation suceefully");
	}
	private static int calculateBaseCharge() {
		return 30;
	}
	default void showDeliveryCharge() {
		int charge = calculateBaseCharge();
		System.out.println("Base delivery charge: " + charge);
	}
	static void sendDeliveryNotification() {
		// TODO Auto-generated method stub
		
	}
}
