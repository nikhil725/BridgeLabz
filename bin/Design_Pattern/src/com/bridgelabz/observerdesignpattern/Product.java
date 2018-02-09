package com.bridgelabz.observerdesignpattern;

import java.util.ArrayList;

public class Product implements Subject {

	private String productName;
	private ArrayList<Observer> listOfObservers = new ArrayList<Observer>();
	private boolean available;
	
	
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		
		if(available == true){
			notifyObserver();
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ArrayList<Observer> getListObservers() {
		return listOfObservers;
	}

	public void setListObservers(ArrayList<Observer> listObservers) {
		this.listOfObservers = listObservers;
	}

	@Override
	public void registerObserver(Observer observer) {
		
		listOfObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		
		for(Observer obsever : listOfObservers){
			
			obsever.update(productName);
		}
	}

	
}
