package com.bridgelabz.objectorientedprog;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for Stock Account.
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 01/02/2018
 */
public class StockAccout {

	public static void main(String[] args) throws IOException, ParseException {
		
	
		Utility utility = new Utility();
		int choice;
		System.out.println();
		System.out.println("***************** @ Share Market @ ************** ");
		System.out.println();
		do {
			System.out.println("Enter 1.create user");
			System.out.println("Enter 2.Buy");
			System.out.println("Enter 3.Sell");
			System.out.println("Enter 4.display");
			System.out.println("Enter 5.Exit");
			choice = Utility.getInt();
			String name, symbol;
			int amount;
			switch (choice) {
			case 1:
				System.out.println(" ***** Fill User Informatoion *****");
				System.out.println();
				Utility.createUser();
				break;

			case 2:
				Utility.Buy();
				break;

			case 3:
				Utility.sell();
				break;

			case 4:
				Utility.display();
				break;
			case 5:
				System.exit(0);
				break;

			}
		} while (choice <= 4);

	}
	}

