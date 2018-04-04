package com.bridgelabz.bean;

import com.bridgelabz.dto.Messaging;
import com.bridgelabz.dto.MyMobile;

public class Communication {
	
	private Messaging messaging;
	
	public Communication(Messaging messaging) {
		
		this.messaging = messaging;
		System.out.println("My mobile");
	}
	
	public void readMessage(){
		messaging.sendMessage();
	}

}
