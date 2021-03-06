package com.bridgelabz.vistorpattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Product> productMap = ShoppingMallProducts.productMap;
		Set<String> products = productMap.keySet();
		
		System.out.println("Products Available : \n");
		
		for(String string : products){
			
			System.out.println(productMap.get(string));
		}
		
		System.out.println("\n ************************************************ \n");
		
		ArrayList<Product> purchasedProductList = new ArrayList<Product>();
		
		purchasedProductList.add(productMap.get("sportStoryBook"));
		purchasedProductList.add(productMap.get("moralStoryBook"));
		purchasedProductList.add(productMap.get("transformarDvd"));
		purchasedProductList.add(productMap.get("terminatorDvd"));
		purchasedProductList.add(productMap.get("piterEngland"));
		purchasedProductList.add(productMap.get("tommyHilfiger"));
		
		ShoppingMallProducts shoppingMallProducts = new ShoppingMallProducts();
		
		System.out.println("Total Amount Rs " +shoppingMallProducts.getTotalAmount(purchasedProductList)+ " /-");
	}
}
