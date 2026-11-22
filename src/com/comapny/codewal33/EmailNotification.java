package com.comapny.codewal33;

public class EmailNotification extends Notification {
	@Override
	public void send(String message) {
		System.out.println("Email send: " + message);
	}

}
