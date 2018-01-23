package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program Computes the prime factorization of N using brute force
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */
public class PrimeFactor {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		int i =2;
		while(number > 1)
		{
			if(number % i== 0)
			{
				System.out.println(+i+" ");
				number = number/i;
			}else
			{
				i++;
			}

		}
		scanner.close();

	}

}
