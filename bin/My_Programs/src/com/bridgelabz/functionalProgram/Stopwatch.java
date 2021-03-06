package com.bridgelabz.functionalProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This is Stopwatch Program for measuring the time that elapses between the start
 * 			 and end clicks
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 12/01/2018
 */
public class Stopwatch {
	
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  1 for start time");
		scanner.nextInt();
		long startTime = utility.start();

		System.out.println("Enter  2 for end time");
		scanner.nextInt();
		long stopTime = utility.stop();

		long elaspedTime = stopTime - startTime;
		System.out.println("elapsedTime is: "+elaspedTime);
		scanner.close();
	}

}
