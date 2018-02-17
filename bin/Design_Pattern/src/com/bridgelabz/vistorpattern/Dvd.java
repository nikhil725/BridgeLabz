package com.bridgelabz.vistorpattern;

public class Dvd extends Product{
	
	private String name;
	
	public Dvd(String name, int price) {
	
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		
		shoppingMallVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "Dvd [name= " + name + ", price= " +price+"]";
	}
	
	

	
}
