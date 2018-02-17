package com.bridgelabz;

import java.util.Scanner;

public class BubbleSortInt {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the size of array ");
			int size = in.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter"+size+" elements: ");
			for(int i=0; i<size; i++){
				
				arr[i] = in.nextInt();
				
			}
			
			Utility.bubbleSort(arr);
			
			System.out.println("The sorted element is...");
			for(int i: arr){
				
				System.out.print(i+" ");
				
			}
			
		}
}
