package com.bridgelabz.algorithm_programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {

		Utility util = new Utility();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();

		char[] arr = util.toBinary(num);

		int i, sum = 0;
		int j = 15;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				int pow = (int) Math.pow(2, j);

				System.out.print(pow + "\t");
			}
			j--;


		}

	}
}
