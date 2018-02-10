package com.bridgelabz.singletonpattern;


public class Lazy{

	private Lazy() {

	}

	private static class BillPughSingleton
	{
		private static final Lazy lazy = new Lazy();
	}

	public static Lazy getInstance(){
		return BillPughSingleton.lazy;
	}
}