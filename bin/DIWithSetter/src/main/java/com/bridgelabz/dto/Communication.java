package com.bridgelabz.dto;

public class Communication {

	private Messaging messaging;

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}

	public void communicate(){
		messaging.sendMessage();
	}

	
	
}
