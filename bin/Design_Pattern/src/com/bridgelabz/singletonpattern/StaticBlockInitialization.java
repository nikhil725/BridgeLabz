package com.bridgelabz.singletonpattern;

public class StaticBlockInitialization {

	static StaticBlockInitialization  staticBlockInitialization;

	private StaticBlockInitialization() {

	}

	static{
		{

			staticBlockInitialization = new StaticBlockInitialization();
		}
	}
	private StaticBlockInitialization getInstance() {

		return staticBlockInitialization;


	}

}
