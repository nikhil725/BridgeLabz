package com.bridgelabz.functionalProgram;

import java.util.Scanner;
/**
 * @purpose: Simulates a gambler who start with $stake and place fair $1 bets until he/she
 * 			 goes broke (i.e. has no money) or reach $goal..
 * @author: Nikhil Vaidya.
 * @version: 1.0
 * @since 10/01/2018
 */

public class Gambler {

	static double stakeLoss=0;
	static double stakeWin=0;
	static int stake;
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of stake");
		stake = scanner.nextInt();
		System.out.println("Enter the number of goal");
		int goal = scanner.nextInt();
		System.out.println("Enter the number of times");
		int number = scanner.nextInt();
		
		
		for(int i=0; i<number; i++)
		{
			while((stake!= goal)||(stake != 0))
			{
				double random = Math.random();
				//System.out.println(random);
				if(random <= 0.5)
				{
					stake-= 2;
				}else{
					stake+= 2;
				}
		
				if(stake == 0)
				{
					stakeLoss++;
					System.out.println("stakeLoss:" +stakeLoss);
					break;
				}else if (stake == goal){
					stakeWin++;
					System.out.println("stakeWin:" +stakeWin);
					break;
				}else 
					continue;
			}
	
		}
		
		double perc_of_win =  stakeWin*100/number;
		double perc_of_loss = stakeLoss*100/number;
		System.out.println("Stake Win "+stakeWin+"  Times..., And Number of percentage of win is  "+perc_of_win);
		System.out.println("Stake Loss"+stakeLoss+"  Times..., And Number of percentage of Loss is  "+perc_of_loss);
		scanner.close();
	}

}
