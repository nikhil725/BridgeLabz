package com.bridgelabz.dsprograms;

import java.util.Stack;

import com.bridgelabz.utility.Utility;

public class Parenthesis {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter Expression");
		Stack<Integer> stack = new Stack<Integer>();
		String expression = Utility.getString();
		utility.parenthesis(expression, stack);
	}

}
