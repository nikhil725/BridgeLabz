package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the"+size+" element in array");
		
		for(int i=0; i<size; i++){
			
			arr[i] = in.nextInt();
		}
		
		Utility.insertionSortforInt(arr);
		
		System.out.println("The sorted array is...");
		
		for(int i=0; i<size; i++){
		
			System.out.println(arr[i]);
		}
		

	}

}
