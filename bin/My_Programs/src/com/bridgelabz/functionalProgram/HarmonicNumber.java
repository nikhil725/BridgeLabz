package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program calculate the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */

public class HarmonicNumber 
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter the Number");
		Scanner scanner = new Scanner(System.in);
		float num = scanner.nextInt();
		float sum=0;
		float i;
		for( i=1; i<=num; i++)
		{
			sum = sum +1/i;
		}
		System.out.println("The Harmonic Series is: "+sum);
		scanner.close();
	}

}
