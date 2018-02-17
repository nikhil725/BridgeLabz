package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program  takes a command-line argument N, asks you to think of a number between 0 and N-1, 
 * 			 where N = 2^n, and always guesses the answer with n questions.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 15/01/2018
 */
public class FindYourNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter your number");
		int number = scanner.nextInt();

		int root = (int) Math.sqrt(number);
		
		System.out.println("root is "+root);
		int low =0, high = number-1;
		utility.findYourNumber(high, low, root);
		scanner.close();
	}

}