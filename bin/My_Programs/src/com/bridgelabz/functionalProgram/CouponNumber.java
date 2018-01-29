package com.bridgelabz.functionalProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program find N distinct Coupon Numbers.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */

public class CouponNumber {

	public static void main(String args[])
	{
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number to generate coupons");
			int size=scanner.nextInt();
			Utility utility = new Utility();
			utility.couponNumber(size);
			scanner.close();

		}
	}
}

