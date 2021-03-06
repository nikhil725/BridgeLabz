package com.bridgelabz.algorithmprograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class BinarySearchFromWL {

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		String temp ="";

		try
		{
			System.out.println(temp);
			FileReader fileReader = new FileReader("/home/bridgeit/abc.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((temp=bufferedReader.readLine())!=null)
			{	
				System.out.println(temp);
				
				int length = utility.wordLength(temp);

				System.out.println("length is "+length);

				System.out.println("Enter word to search");
				String key = scanner.nextLine();
				
				int mid = utility.arrayConversion(temp, length, key);

				if(mid ==-1)
				{
					System.out.println("String not found ");
				}
				else
				{
					System.out.println("String found at "+mid+" location");
				}	
			}
			scanner.close();
			bufferedReader.close();
		}
		catch(Exception e)
		{
			System.out.println("File not found ");
		}
	}
}