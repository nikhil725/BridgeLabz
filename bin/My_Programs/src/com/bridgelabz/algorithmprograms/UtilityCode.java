package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UtilityCode {

	public static void main(String[] args) {
		
	
		Utility utility = new Utility();
		int choice, j=0;
		long arr[] = new long[5]; 
		do
		{
		    System.out.println("Enter Your Choice.....");
            System.out.println("1. Binary Search for String");
            System.out.println("2. Insertion Sort for Integer");
            System.out.println("3. Insertion Sort for String");
            System.out.println("4. Bubble Sort for Interger");
            System.out.println("5. Bubble Sort for String");
            System.out.println("0: Exit");
        	Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            
            
            switch(choice)
            {
            case 1:
            	System.out.println("*****Binary Search for String******");
            	System.out.println();
            	utility.binarySearchForStr();
            	arr[j++] = utility.stop();
            	
            	
            case 2:
            	System.out.println("*****Insertion Sort For Integer******");
            	System.out.println();
        		System.out.println("Enter the size of array");
        		int size = scanner.nextInt();
        		int[] array = new int[size];
        		System.out.println("Enter the"+size+" element in array");

        		for(int i=0; i<size; i++){

        			array[i] = scanner.nextInt();
        		}
        		long startTime = utility.start();
            	utility.insertionSort(array);
            	long endTime =  utility.stop();
            	arr[j++] = endTime - startTime; 
            	
            case 3:
            	System.out.println("*****Insertion Sort For String******");
            	System.out.println();
        		System.out.println("Enter size of string array ");
        		int size1 = scanner.nextInt();

        		String array1[] = new String[size1];

        		System.out.println("Enter "+size1+" character");

        		for(int i=0; i<size1; i++)
        		{
        			array1[i] = scanner.next();
        		}
        		long startTime1 = utility.start();
        		Utility.insertionSort(array1);
            	arr[2] = utility.stop();
            	long endTime1 =  utility.stop();
            	arr[j++] = endTime1 - startTime1; 
            	
            case 4:
            	System.out.println("*****Bubble Sort For Integer******");
            	System.out.println();
        		System.out.println(" Enter the size of array");
        		int size2 = scanner.nextInt();
        		int[] array2 = new int[size2];
        		System.out.println("Enter "+size2+" elements");

        		for(int i=0; i<size2; i++){

        			array2[i] = scanner.nextInt();

        		}
        		utility.start();
            	utility.bubbleSortForInt(size2,array2);
            	arr[3] = utility.stop();
            	break;
            	
            case 5:
            	System.out.println("*****Bubble sort for string******");
            	System.out.println();
        		System.out.println("Enter size of Array");
        		int size3 = scanner.nextInt();
        		String[] array3 = new String[size3];
        		
        		System.out.println("Enter "+size3+" words");
        		for(int i=0; i<size3; i++)
        		{
        			array3[i] = scanner.next();
        		
        		}
        		System.out.println("Before sort String");
        		for(String i : array3)
        		{	
        			System.out.print(i+" ");	
        		}
        		utility.start();
            	utility.bubbleSort(array3);
            	arr[4] = utility.stop();
            	break;
            }
            for(long i : arr){
    			System.out.println("The array is: "+i);
    		}
    		
		}while(choice!=0);
		
		for(long i : arr){
			System.out.println("The array is: "+i);
		}
		
		
		}
	
	}