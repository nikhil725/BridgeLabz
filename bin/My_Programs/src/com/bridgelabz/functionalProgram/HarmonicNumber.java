package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner in = new Scanner(System.in);
		float num = in.nextInt();
		float sum=0;
		float i;
		for( i=1; i<=num; i++){
			sum = sum +1/i;
	}
	System.out.println("The Harmonic Series is: "+sum);

	}

}
