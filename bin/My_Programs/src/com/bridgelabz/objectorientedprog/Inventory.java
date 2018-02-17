package com.bridgelabz.objectorientedprog;

import org.json.JSONException;

import com.bridgelabz.utility.Utility;

public class Inventory {
	public static void main(String[] args) throws JSONException {

		Utility utility = new Utility();
		utility.writeData();
		utility.readData();
	}
}
