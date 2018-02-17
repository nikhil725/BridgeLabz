package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: One string is an anagram of another if the second is simply a rearrangement of the first.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 15/01/2018
 */
public class Anagram {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = scanner.nextLine();
		System.out.println("Enter Sceond String");
		String sceondString = scanner.nextLine();
		scanner.close();
		boolean val = utility.isAnagram(firstString, sceondString);
		
		if(val == true){
			System.out.println(firstString+" and "+sceondString+" both strings are Anagram");
		}
		else{
			System.out.println(firstString+" and "+sceondString+" strings are Not Anagram");
		}

	}
}