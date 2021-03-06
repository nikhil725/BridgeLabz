package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

/**
 * @purpose: This program is used to sort integer array using bubble sort.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 15/01/2018
 */

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements");
		
		for(int i=0; i<size; i++){
			
			arr[i] = scanner.nextInt();
			
		}
		int m = size - 1;
			while (m > 0) 
			{
				for (int i = 0; i < m; i++) 
				{
					if (arr[i] > arr[i + 1]) 
					{
						int temp;
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
				
				m--;
		}
			System.out.println("Sorted array is...");
			for(int i=0; i<arr.length; i++){
				
				System.out.print(arr[i]+" ");
			}
			scanner.close();
		
		}
	}

