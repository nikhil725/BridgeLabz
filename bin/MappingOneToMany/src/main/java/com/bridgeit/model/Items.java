package com.bridgeit.model;

public class Items {

	private long id;
	private String itemId;
	private double itemTotal;
	private int quantity;
	private Cart cart;


	public Items(String itemId, int quantity, double itemTotal, Cart cart) {
		this.itemId =itemId;
		this.quantity=quantity;
		this.itemTotal  = itemTotal;
		this.cart=cart;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
