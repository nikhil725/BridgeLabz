package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter the size of array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements");
		
		for(int i=0; i<size; i++){
			
			arr[i] = in.nextInt();
			
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
		
		}
	}

