package com.bridgelabz.functionalProgram;

public class FlipCoin {
	public static void main(String[] args){

		double head =0;
		double tail =0;
		float percentage;
		for(int i=0; i<100; i++)
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
		percentage= (float)((head/100)*100);
		System.out.println("Percentage of head is: "+percentage);
	}

}
