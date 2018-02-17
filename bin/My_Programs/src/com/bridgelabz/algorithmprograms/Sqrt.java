package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		
		Utility util = new Utility();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number");
		double num = scanner.nextInt();
		
		if(num<=0){
			
			System.out.println(" Invalid Number");
			System.exit(0);
		}
		
		double square = util.squarRoot(num);
		System.out.println("Square root is: "+square);
		scanner.close();
	}
}
