package com.bridgelabz.vistorpattern;

public class Shirt extends Product {
	
	private String brandName;
	private String size;
	
	public Shirt(String brandName, String size, int price) {
		super();
		this.brandName = brandName;
		this.size = size;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		
		shoppingMallVisitor.visit(this);
	}
	
	@Override
	
	public String toString(){
		return "Shirt [brandName = " +brandName+ ", size= " +size+", price = "+ price + "]";
	}
	
	
	

}
