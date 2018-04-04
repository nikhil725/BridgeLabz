package com.bridgeit.todo.util;

import java.util.regex.Pattern;

public class Validation {
	
	private static String nameValidation ="^[a-zA-Z\\s]{3,}";
	private static String emailValidation = "^[a-z0-9+_.-]+@{1}[a-z](.+){1}[a-z]";
	private static String passwordValidation = "^[A-Za-z0-9]{5,}$";

	public static String userValidation(String name, String email, String password) {
		
		String msg=null;
		
		if(!Pattern.matches(nameValidation, name)) {
			msg="enter name correct";
			System.out.println("Invalid user name");
			
		}
		
		if(!Pattern.matches(emailValidation, email)) {
			msg="enter email correct";
			System.out.println("Invalid user email");
		}
		if(!Pattern.matches(passwordValidation, password)) {
			msg="enter password correct";
			System.out.println("Invalid password");
			
		}
		return msg;
		
		
	}



	
}
