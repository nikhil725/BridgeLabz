package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to calculate monthly payment.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 20/01/2018
 */
class ToBinary {

	public static void main(String[] args)
	{
		Utility utility = new Utility();
		System.out.println("Enter number");
		int number = utility.getInt();
		utility.toBinary(number);
	}
}
