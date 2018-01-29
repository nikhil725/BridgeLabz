package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program takes a command-line argument N and prints a table of the powers
 * 			 of 2 that are less than or equal to 2^N. 
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */
public class PowerOfTwo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();
		int i=0;
		int power =1;
		while(i<=number){
			System.out.println("Power of 2^"+i+"=" +power);
			power = power*2;
			i++;
		}
		scanner.close();
	}
}
