package com.comapny.codewal36INterface2;

public interface IBooking {
	public abstract void book();
	public abstract void cancelBooking();
	public abstract void checkStatus();
	public abstract void serach();
	// optimal --- 2020
	public default  void autoUpgrade() {
		// 500 lines(Checking status , connecting with database(25 lines), upgrade)
		connecttoDB();
		System.out.println("IBooking.autoUpgrade() ..........");
//		public static void printTicket(String path, String contents) {
//			
//		}
	}
	// optimal-- 2020
	// who want to you can implement
	public default void sendNotification() {
		// 200 lines(connecting with database(25 lines), get user details and send notification)
		connecttoDB();
		System.out.println("IBooking.sendNotification");
	}
	public static void printTicket(String path, String content) {
		// TODO Auto-generated method stub
		System.out.println(" printing ticket... static method it is udse for coommon utilize method");
		
	}
	private  void connecttoDB() {
		System.out.println("printing ticket.connecttoDB()");
		
	}

}
