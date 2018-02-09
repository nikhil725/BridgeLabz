package com.bridgelabz.proxydesignpattern;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
	
		this.fileName = fileName;
		loadFromDisk(fileName);
		
	}

	@Override
	public void display() {
		System.out.println("Displyaing "+fileName);
		
	}
	
	private void loadFromDisk(String filename){
		System.out.println("Loading... "+filename);
	}

	
	
}
