package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program number of times to Flip Coin.
 * @author: Nikhil Vaidya.
 * @version: 1.0
 * @since 10/01/2018
 */
public class FlipCoin 
{
	public static void main(String[] args)
	{

		double head =0;
		double tail =0;
		float percentageHead,percentageTail;
		System.out.println("How many times you want to filp coin");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=0; i<number; i++)
		{
			if(Math.random()<0.5)
			{
				tail++;
			}else{
				head++;
			}
		}	
		System.out.println("Head Total: "+head);
		System.out.println("Tails Total: "+tail);
		percentageHead= (float)((head/number)*100);
		System.out.println("Percentage of head is: "+percentageHead);
		percentageTail =(float)((tail/number)*100);
		System.out.println("Percentage of tail is:"+percentageTail);
		scanner.close();
		
	}
}
