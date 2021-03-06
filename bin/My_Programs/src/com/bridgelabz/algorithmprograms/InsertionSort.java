package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

/**
 * @purpose: This program is used to sort array using insertion sort.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 17/01/2018
 */

public class InsertionSort {

	public static void main(String[] args) {
		
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the"+size+" element in array");
		
		for(int i=0; i<size; i++){
			
			array[i] = scanner.nextInt();
		}
		
		Utility.insertionSortforInt(array);
		
		System.out.println("The sorted array is...");
		
		for(int i=0; i<size; i++){
		
			System.out.println(array[i]);
		}
		scanner.close();
	}

}
