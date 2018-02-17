package com.bridgelabz.singletonpattern;

public class LazyInitialization {

	static LazyInitialization lazyInitialization;

	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance() {
		
		if(lazyInitialization == null){
			
			lazyInitialization = new LazyInitialization();
		}
		
		return lazyInitialization;
		
	}
}
