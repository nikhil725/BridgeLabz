package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=scan.nextInt();	
		int Notes[]={1000,500,100,50,10,5,2,1};
		int i=0;
		int TotalNotes=0;
		count_notes(amount,Notes,i,TotalNotes);		
		
	}
	
	public static void count_notes(int money, int[] notes, int i, int totalNotes) 
	{
		int count = 0;
		if (money == 0) 
		{
			System.out.println("Total number of notes :" + totalNotes);
			System.exit(0);
		} else 
		{
			count = money / notes[i];
			totalNotes = totalNotes + count;
			System.out.println(notes[i] + "Rs notes are  " + count);
			money = money % notes[i];
			i++;
		}
		count_notes(money, notes, i, totalNotes);

}
}
