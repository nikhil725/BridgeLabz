package com.bridgelabz;

import java.util.Scanner;

public class BinarySearchInt {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements ");
		for(int i=0; i<size; i++){
			
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter search key");
		int key = in.nextInt();
		
		int result = Utility.binarySearchforInt(arr, key, size);
		
		if(result == -1){
			System.out.println(key+" element not found");
			
		}else{
			
			System.out.println(key+" found at "+(result)+" location");
		}
		
		
		
	}

}
