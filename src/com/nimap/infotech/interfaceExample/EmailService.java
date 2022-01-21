package com.nimap.infotech.interfaceExample;

public class EmailService implements NotificationService {

	@Override
	public void notify(User user) {
		System.out.println("Notifying " + user.getEmail() + "...");
		System.out.println("SendNotificationSend");

	}

}
