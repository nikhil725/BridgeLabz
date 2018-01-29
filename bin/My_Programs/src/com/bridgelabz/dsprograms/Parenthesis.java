package com.bridgelabz.dsprograms;

import java.util.Scanner;
import java.util.Stack;

import com.bridgelabz.utility.Utility;

public class Parenthesis {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Expression");
		Stack<Integer> stack = new Stack<Integer>();
		String expression = scanner.next();
		utility.parenthesis(expression, stack);
		scanner.close();

	}

}