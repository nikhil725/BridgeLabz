package com.bridgelabz.designpattern;

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
