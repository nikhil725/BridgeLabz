package com.bridgelabz.functionalProgram;

/**
 * @purpose: This program takes two integer command-line arguments x and y and prints the
 * 			 Euclidean distance from the point (x, y) to the origin (0, 0).
 * @author: Nikhil
 * @version: 1.0
 * @since 10/01/2018
 */
public class Distance {

	public static void main(String args[])

	{     	
		int  x=Integer.parseInt(args[0]);
		int  y=Integer.parseInt(args[1]);
		double dis=Math.sqrt(x*x + y*y);
		System.out.println();       
		System.out.println("Distance between "+x+" and "+y+" is = "+dis);

	}

}
