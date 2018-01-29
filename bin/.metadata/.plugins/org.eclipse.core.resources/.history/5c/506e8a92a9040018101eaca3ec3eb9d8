package com.bridgelabz.functionalProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out, true);
		writer.println("Enter Row");
		int m = scanner.nextInt();
		writer.println("Enter Col");
		int n = scanner.nextInt();
		String[][] arr = new String[m][n];
		writer.println("Enter the value");
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
				{
					arr[i][j]= scanner.next();		
				}
		}

		writer.println("array elements are ");
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
				{
					writer.print(arr[i][j]+"  ");		
				}
			writer.println(" ");
		}
	}

}
