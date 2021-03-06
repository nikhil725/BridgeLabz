package com.bridgelabz.dsprograms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PalindromChecker {


	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter string ");
       
        String string = Utility.getString();
       
		LinkedList<Character> queue = new LinkedList<Character>();
        
        for (int i = string.length()-1; i >=0; i--) 
        {
           queue.add(string.charAt(i));
        
        }
        String reverseString = "";
        
        while (!queue.isEmpty())
        {
            reverseString = reverseString+queue.remove();
        }
        if (string.equals(reverseString))
        {
        	System.out.println("The String is a palindrome.");
        }
        else
        {
            System.out.println("The String is not a palindrome.");
        }
        
	}
}
