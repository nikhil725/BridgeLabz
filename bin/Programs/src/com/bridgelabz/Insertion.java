package com.bridgelabz;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = in.nextLine();

		String str[] = str1.split(" ");

		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str.length - 1; j++) 
			{
				if (str[j].compareTo(str[j + 1]) > 0) 
				{
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted words in the String array ");
		System.out.println();
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}	
	}

}

