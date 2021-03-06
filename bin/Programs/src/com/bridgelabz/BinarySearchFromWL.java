package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BinarySearchFromWL {

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		BinarySearchFromWL bswl = new BinarySearchFromWL();
		String temp ="";

		try
		{

			System.out.println(temp);
			FileReader fr = new FileReader("/home/bridgeit/abc.txt");
			BufferedReader buffer = new BufferedReader(fr);


			while((temp=buffer.readLine())!=null)
			{	
				System.out.println(temp);
				
				int length = bswl.wordLength(temp);

				System.out.println("length is "+length);

				System.out.println("Enter word to search");
				String key = in.nextLine();

				int result = bswl.arrayConversion(temp, length, key);

				if(result ==-1)
				{
					System.out.println("String not found ");
				}
				else
				{
					System.out.println("String found at "+result+" location");
				}	


			}
		}
		catch(Exception e)
		{
			System.out.println("File not found ");
		}

	}

	public int wordLength(String s){

		System.out.println("In word length");

		int n = 0;

		StringTokenizer st = new StringTokenizer(s,",");

		while(st.hasMoreTokens())
		{

			String token = st.nextToken();
			n++;
		}

		return n;

	}

	public int arrayConversion(String s, int length, String word)
	{

		System.out.println("In arrayconver");

		String arr[]=new String[length];
		int i=0;
		
		StringTokenizer st = new StringTokenizer(s,",");
		System.out.println(st);

		while(st.hasMoreTokens())
		{
			
			String token=st.nextToken();
			arr[i]=token;
			i++;
		}		
		
		for(i=0; i<length; i++)
		{
			for (int j=i+1; j<length; j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String dummy=arr[i];
					arr[i]=arr[j];
					arr[j]=dummy;
				}
			}
		}

		System.out.println("sorting of words are ");		
		for(i=0; i<length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int low=0,high=length-1;
		int mid;
		while(low<=high)
		{
			mid=(high+low)/2;

			if(word.compareToIgnoreCase(arr[mid])==0)
			{
				return mid;
			}
			else if(word.compareToIgnoreCase(arr[mid])>0)
			{
				low=mid+1;
				high=high;
				return mid;
			}
			else if(word.compareToIgnoreCase(arr[mid])<0)
			{
				low=low;
				high=mid-1;
				return mid;
			}
		}
		return -1;
	}

}
