package com.comapny.codewal36INterface2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBooking set = new TrainBooking();
		set.autoUpgrade();
		set.sendNotification();


	}

}
