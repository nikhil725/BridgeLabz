package com.bridgelabz.functionalProgram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”   
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 12/01/2018
 */

public class ReplaceString {

	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		String message = "Hello <<UserName>>, How are you ?";
		System.out.println("Enter your name");
		String name = scanner.next();
		String firstName = "<<UserName>>";
		Pattern pattern =  Pattern.compile(firstName);
		Matcher matcher = pattern.matcher(message);
		message = matcher.replaceAll(name);
		System.out.println(message);	
		scanner.close();
	}	
}
