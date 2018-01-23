package com.bridgelabz.algorithmprograms;

public class PrimePalindrom
{

	public static int n, b, rev = 0, i;
	public static void main (String[] args)
	{	

		char [] ab;
		int arr;
		
		int num =0;
		
		String  primeNumbers = "";
		for (i = 1; i <= 1000; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				if(palindrom(i))
				{
					primeNumbers = primeNumbers + i+" ";

				}

			}	

		}
		System.out.println(primeNumbers);
	}

	public static boolean palindrom(int i){
		int n = i;
		rev=0;
		b=0;
		while(n > 0)
		{
			b = n % 10;
			rev = rev * 10 + b;
			n = n / 10;
		}
		if (rev == i)
		{		
			return true;
		}
		else{

			return false;
		}

	}
}