package com.bridgelabz.functionalProgram;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

/**
 * @purpose: This is program for 2D arrays of integers, doubles, or booleans from standard input and printing
 * 			 them out to standard output.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 12/01/2018
 */

public class TwoDArray {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int choice;
		int rows=0, columns=0;
		do {
			System.out.println("Enter Your Choice.....");
			System.out.println("1.Integer");
			System.out.println("2.Double");
			System.out.println("3.Boolean");
			choice = scanner.nextInt();

			if (choice >= 1 && choice <= 3) {
				System.out.println("Enter the Rows....");
				rows = scanner.nextInt();
				System.out.println("Enter the Columns....");

				columns = scanner.nextInt();
			}

			Integer[][] integer = new Integer[rows][columns];
			Double[][] doubles = new Double[rows][columns];
			Boolean[][] booleans = new Boolean[rows][columns];

			switch (choice) {
			case 1:
				System.out.println("Enter The Integer Elements");
				for (int i = 0; i < rows; i++)
				{
					for (int j = 0; j < columns; j++)
					{
						integer[i][j] = scanner.nextInt();
					}
				}
				Utility.print2DArray(integer, rows, columns);
				break;

			case 2:
				System.out.println("Enter The Double Elements");
				for (int i = 0; i < rows; i++)
				{	
					for (int j = 0; j < columns; j++)
					{
						doubles[i][j] = scanner.nextDouble();
					}
				}
				Utility.print2DArray(doubles, rows, columns);
				break;

			case 3:
				System.out.println("Enter The Double Elements");
				for (int i = 0; i < rows; i++)
				{
					for (int j = 0; j < columns; j++)
					{
						booleans[i][j] = scanner.nextBoolean();
					}
				}   
				Utility.print2DArray(booleans, rows, columns);
				break;
			}

		} while (choice != 0);
		scanner.close();
		
		
	}

}
