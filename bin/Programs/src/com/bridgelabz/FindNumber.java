package com.bridgelabz;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = in.nextInt();

		int n = (int) Math.sqrt(num);
		
		System.out.println("root is "+n);
		int low =0, high = num-1;

		
		
		for(int i=0; i<n; i++)
		{
			int mid = (high + low) / 2;
			System.out.println("If your number between "+low+" To "+mid+" Press 1... OR "+mid+" To "+high+" Pess 0");
			int val = in.nextInt();
			if (val == 1) 
			{
				low = low;
				high = mid;
			}
			else if(val == 0)
			{
				low = mid + 1;
				high = high;
			}
			if (low == high) 
			{
				System.out.println("the number is" + mid);
				
			}
		}
	}

}
