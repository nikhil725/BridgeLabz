package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class WeekDayInQueue {
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Queue queue = new Queue();
		System.out.println("Enter month");
		int month = Utility.getInt();
		
		System.out.println("Enter year");
		int year = Utility.getInt();
		
		int[][] array = new int[6][7];
		String months[] ={"","January","February","March","April","May","June","July","August","September",
				"October","November","December"};

		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(month == 2 && Utility.isLeapYear(year))
		{

			days[month] = 29;
		}

//		System.out.println("*****" + months[month] + " " + year+"*****");
//		System.out.println("--------------------");
//		System.out.println(" S  M T  W Th  F  S");
//		System.out.println("--------------------");
//		
		int d = Utility.day(month, 1, year);
		for (int i = 0; i < d; i++)
		{
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) 
		{
			for(int j=0; j<6; j++)
			{
				for(int k=0; k<7; k++)
				{
					array[j][k] = i;
				}
				
			}
			if(((i + d) % 7 == 0) || (i == days[month])) 
			{
				System.out.println();
			}
			queue.enqueue(i);
			queue.print();
		
		}
		
		
//		for(int j=0; j<6; j++){
//			
//			for(int k=0; k<7; k++){
//				
//				System.out.print(array[j][k]+" ");
//			}
//			System.out.println();
//		}
		
	}
		
	
}
