package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to check given string is palindrom and angram.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 17/01/2018
 */

public class PalindromAnagram {

	public static void main(String[] args) {
		
		
		Utility utility = new Utility();
		
		 Scanner scanner = new Scanner(System.in);
		 
	        int limit = 1000;
	        System.out.println("Prime numbers between 0 - " + limit);
	        System.out.println();
	        String [] strArray= utility.checkPrime(limit);
	        for(int i=0;i<strArray.length;i++)
	        {
	        System.out.print(strArray[i]+" ");
	        }
	        System.out.println("\n");
	        System.out.println("Anagram Numbers in between 0 - "+limit);
	       
	        for (int i = 0; i < strArray.length; i++) 
	        {
	            for (int j = i + 1; j < strArray.length; j++) 
	            {
	                if (utility.checkAnagram(strArray[i],strArray[j]))
	                {
	                    System.out.print(strArray[i] + "  " + strArray[j]+" ");
	                }
	            }
	        }
	        System.out.println("\n");
	        System.out.println("Palindrome number in between 0 - "+limit);
	        
	        for (int i = 0; i < strArray.length; i++) 
	        {
	            if (utility.palindrome(strArray[i]))
	            {
	                System.out.print(strArray[i]+"\t");
	            }
	        }
	        scanner.close();
	}
	
}
