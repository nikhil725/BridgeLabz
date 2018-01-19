package com.bridgelabz.algorithm_programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinaryNibbles {

	public static void main(String[] args) {

		Utility util = new Utility();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();
		util.binaryNibbles(num);
		
		

	}

}
