package com.bridgelabz.observerdesignpattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setCustomerName("Nikhil");
		
		Customer customer2 = new Customer();
		customer2.setCustomerName("Pranav");
		
		Customer customer3 = new Customer();
		customer3.setCustomerName("Sanket");
		
		Product iphone7 = new Product();
		iphone7.setProductName("Apple IPhone 7");
		//iphone7.setAvailable(false);
		
		iphone7.registerObserver(customer1);
		iphone7.registerObserver(customer2);
		//iphone7.setAvailable(false);
		iphone7.registerObserver(customer3);
		
		//iphone7.setAvailable(true);
		iphone7.setAvailable(false);
		iphone7.removeObserver(customer3);
		iphone7.setAvailable(true);

		
	}

}
