package com.bridgelabz.singletonpattern;

import java.io.Serializable;

public class Singleton1 implements Serializable {

	public static Singleton1 instance = new Singleton1();

	private Singleton1() {
		// private constructor
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}

}
