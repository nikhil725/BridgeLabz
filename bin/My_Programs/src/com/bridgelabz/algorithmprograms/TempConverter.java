package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TempConverter {

	public static void main(String[] args) {
		
		Utility util = new Utility();
		Scanner sc=new Scanner(System.in);
		int n;
		double value;
		double ans;
		System.out.println(" Enter 0 to convert Celsius to Fahrenheit ");
		System.out.println(" Enter 1 to convert Fahrenheit to Felsius");
		n=sc.nextInt();
		switch(n)
		{
			case 0: System.out.println("enter the celsius value ");
					value=sc.nextDouble();
					System.out.println(value);
					ans=util.tempratureConvertion(n, value);
					System.out.println("the fahrenheit value is "+ans+" .");
					break;
			case 1: System.out.println("enter the fahrenheit value ");
					value=sc.nextDouble();
					ans=util.tempratureConvertion(n, value);
					System.out.println("the Celsius value is "+ans+" .");
					break;
			default : System.out.println("you entered a invalid number");
				break;
		}
		
	}

}
