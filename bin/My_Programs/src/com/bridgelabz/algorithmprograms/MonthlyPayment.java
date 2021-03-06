package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to calculate monthly payment.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 19/01/2018
 */

public class MonthlyPayment {

	public static void main(String[] args)
	{

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the principal amount ");
		int principalAmont = scanner.nextInt();
		System.out.println("interest rate ");
		Float rate = scanner.nextFloat();
		System.out.println("How many years");
		int year = scanner.nextInt();
		double payment = utility.calculatePayment(year, principalAmont, rate);
		System.out.println("Monthly Payment is"+payment);
		scanner.close();
		
	}
}

