package com.bridgelabz;

import java.util.Scanner;

public class BubbleSortStr {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = in.nextInt();
		String[] arr = new String[size];
		
		System.out.println("Enter "+size+" words");
		for(int i=0; i<size; i++)
		{
			arr[i] = in.nextLine();
		
		}
		System.out.println("Before sort String");
		for(String i : arr)
		{	
			System.out.print(i+" ");	
		}
			
		Utility.bubbleSort(arr);
		
		System.out.println("Sorted String is....");
		for(String i : arr ){
			
			System.out.print(i+" ");
			
		}
			
	}

}
