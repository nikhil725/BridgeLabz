package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

/**
 * @purpose: This program is used to sort string array using insertion sort.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 17/01/2018
 */
public class InsertionSortForStr {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of string array ");
		int size = scanner.nextInt();
		
		String array[] = new String[size];
		
		System.out.println("Enter "+size+" character");
		
		for(int i=0; i<size; i++){
			
			array[i] = scanner.next();
			
		}
		
		Utility.insertionSort(array);
		
		System.out.println("Sorted string...");
		
		for(String i : array){
			
			System.out.print(i+" ");
		}
		scanner.close();
	}

}