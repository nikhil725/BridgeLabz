package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to sort array using merge sort.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 18/01/2018
 */

public class MergeSort {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.print("Enter number of string: ");
		int size = utility.getInt();
		String[] strings = new String[size];
		System.out.println("Enter "+size+" string");
		for (int i = 0; i < size; i++) 
		{
			strings[i] = utility.getString();
		}
		int length = strings.length;
		System.out.println("The lenght"+length);
		strings = Utility.mergeSort(strings);

		System.out.println("Sorted list:");

		for (String string : strings) 
		{
			System.out.print(string+" ");
		}
	}

	
}
