package com.bridgelabz.singletonpattern;

public class ThreadSafeSingleton {
	
	static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {
	
		System.out.println("Instance is created");
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		
		if(threadSafeSingleton == null){
			
			threadSafeSingleton = new ThreadSafeSingleton();
		}
		
		return threadSafeSingleton;
	}

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				ThreadSafeSingleton obj = getInstance();				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				ThreadSafeSingleton obj = getInstance();				
			}
		});
		thread1.start();
		thread2.start();
	}
}
