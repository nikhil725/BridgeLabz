package com.bridgelabz;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" element");
		for(int i=0; i<size; i++){
			
			arr[i] = in.nextInt();	
		}
		if(arr.length == 1){
			
			System.out.println(arr);
			
		}
		
		int first[] = new int[arr.length / 2];
		int last[] = new int[arr.length - (arr.length / 2)];
	}

}
