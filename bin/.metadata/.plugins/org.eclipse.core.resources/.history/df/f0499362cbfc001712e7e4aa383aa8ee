package com.bridgelabz.algorithm_programs;


import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int d=sc.nextInt();
		System.out.println("Enter the month");
		int m=sc.nextInt();
		System.out.println("Enter the year");
		int y=sc.nextInt();
		
		if(d<1 || d>31)
		{
			
			System.out.println("Invalid date");
			
		}else if(m<1 || m>13)
		{
			System.out.println("Invalid month");
		}else
			{
			
			int y1 = y - (14 - m) / 12;
			int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
			int m1 = m + 12 * ((14 - m) / 12) - 2;
			int d1 = (d + x + (31 * m1) / 12) % 7;
			
			String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			System.out.println("It is "+days[d1] +" On "+ m + "/" + d + "/" + y +".");
		}

	}

}	