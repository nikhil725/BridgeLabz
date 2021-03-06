package com.bridgelabz.proxydesignpattern;

import com.bridgelabz.proxydesignpattern.ProxyImage;

public class ProxyDemo {

	public static void main(String[] args) {
	
		Image image = new ProxyImage("cat.jpg");

		// This image is loaded from disk
		image.display();
		System.out.println("");
		
		// This image is not be loaded from disk
		image.display();
	}

}
