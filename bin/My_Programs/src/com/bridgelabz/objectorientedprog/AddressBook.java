package com.bridgelabz.objectorientedprog;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for to maintain Address Book.
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 02/02/2018
 */

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
