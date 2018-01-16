package com.bridgelabz;

import java.util.Scanner;

public class InsertionStringSort {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of string array ");
		int size = in.nextInt();
		
		String arr[] = new String[size];
		
		System.out.println("Enter "+size+" character");
		
		for(int i=0; i<size; i++){
			
			arr[i] = in.nextLine();
			
		}
		
		Utility.insertionSort(arr);
		
		System.out.println("Sorted string...");
		
		for(String i : arr){
			
			System.out.print(i+" ");
		}
		
		
		
		
	}

}
