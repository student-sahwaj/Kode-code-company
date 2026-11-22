package com.comapny.codewal33;

public class SMSNotification extends Notification{
	@Override
	public void send(String message) {
		System.out.println("SMS send " + message );
		
	}

}
