package com.bridgelabz.objectorientedprog;

import java.util.Scanner;

public class Regex {

	Scanner scanner = new Scanner(System.in);
	String message="Hello <<Name>>, We have your full name as <<Full Name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	private String firstName;
	private String lastName;
	private String mobileNumber="0";
	private String date;

	public void setFirstName() 
	{
		System.out.println("Enter The First Name :");
		firstName=scanner.next();
	}

	public void setLastName()
	{
		System.out.println("Enter The Last Name :");
		lastName = scanner.next();
	}

	public void setMobNumber(){
		System.out.println("Enter The Mobile Number :");
		mobileNumber = scanner.next();
	}
}



