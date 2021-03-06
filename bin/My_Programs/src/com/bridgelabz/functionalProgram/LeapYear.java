package com.bridgelabz.functionalProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to find leap year.
 * @author: Nikhil Vaiday.
 * @version: 1.0
 * @since 10/01/2018
 */

public class LeapYear {
	
	public static void main(String[] args){
		
		Utility utility = new Utility();
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		boolean ans = utility.isLeapYear(year);
		if(ans == true)
		{
			System.out.println(year+" is a leap year");
		}else{
			System.out.println(year+" is not a leap year");
		}	
		scanner.close();
	}
	
}
