package com.bridgelabz.vistorpattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ShoppingMallProducts {

	static LinkedHashMap<String, Product> productMap;
	
	static{
		
		productMap = new LinkedHashMap<String, Product>();
		
		Book sportStoryBook = new Book("Sport Story Book", "ISBN-788", 240);
		Book jesusStoryBook = new Book("Jesus Story Book", "ISBN-1998", 290);
		Book moralStoryBook = new Book("Moral Story Book", "ISBN-2104", 360);
		
		Dvd terminatorDvd = new Dvd("The Terminateor", 120);
		Dvd transformarDvd = new Dvd("Transformar", 100);
		Dvd titanicDvd = new Dvd("Titanic", 140);
		
		Shirt tommyHilfiger = new Shirt("Tommy Hilfiger", "42", 3500);
		Shirt piterEngland = new Shirt("Piter England", "40", 2560);
		Shirt adidas = new Shirt("Adidas", "38", 2850);
		
		productMap.put("sportStoryBook", sportStoryBook);
		productMap.put("jesusStoryBook", jesusStoryBook);
		productMap.put("moralStoryBook", moralStoryBook);
		productMap.put("terminatorDvd", terminatorDvd);
		productMap.put("transformarDvd", transformarDvd);
		productMap.put("titanicDvd", titanicDvd);
		productMap.put("tommyHilfiger", tommyHilfiger);
		productMap.put("piterEngland", piterEngland);
		productMap.put("adidas", adidas);
		
		
	}
	
	public int getTotalAmount(ArrayList<Product> purchasedProductList){
		
		Cashier cashier = new Cashier("Nikhil");
		
		System.out.println("Purched Product List : \n");
		
		for(Product product : purchasedProductList){
			
			product.accept(cashier);
			
			System.out.println(product+" \n");
		}
		return cashier.getTotalPrice();
		
		
		
	}
}
