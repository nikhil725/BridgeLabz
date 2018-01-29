package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to calculate monthly payment.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 20/01/2018
 */
class ToBinary {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		utility.toBinary(number);
		scanner.close();
	}
}