package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

class VendingMachine {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("enter the amount");
		int amount=scanner.nextInt();	
		int Notes[]={1000,500,100,50,10,5,2,1};
		int i=0;
		int TotalNotes=0;
		scanner.close();
		utility.countNotes(amount,Notes,i,TotalNotes);

	}

}