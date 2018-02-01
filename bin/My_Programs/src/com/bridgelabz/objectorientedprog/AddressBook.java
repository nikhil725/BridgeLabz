package com.bridgelabz.objectorientedprog;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBook {

	public static void main(String[] args)
	{
		
		Utility utility=new Utility();
		try {
			utility.addressBook();
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	}

}
