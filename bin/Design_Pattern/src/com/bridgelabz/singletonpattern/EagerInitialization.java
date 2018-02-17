package com.bridgelabz.singletonpattern;

public class EagerInitialization {
	
	static EagerInitialization eagerInitialization = new EagerInitialization();

	private EagerInitialization() {
		
		System.out.println("Instance created");
		System.out.println("Instance is created");
	}
	
	public static EagerInitialization getInstance() {
		
		return eagerInitialization;
		
	}
	
	public static void main(String[] args) {
		
		
	}
}
