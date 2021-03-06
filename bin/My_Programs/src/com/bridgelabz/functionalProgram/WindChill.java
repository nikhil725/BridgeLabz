package com.bridgelabz.functionalProgram;

public class WindChill {
	
	/**
	 * @purpose: This is program takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
	 * @author: Nikhil Vaidya
	 * @version: 1.0
	 * @since 13/01/2018
	 */
	
	public static void main(String args[])
	{
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = 35.74 + 0.6215 * t + (0.4275 *t - 35.75) * Math.pow(v, 0.16);
		System.out.println(" temperature "+t);
		System.out.println(" Wind Speed "+v);
		System.out.println(" Wind chill "+w);
	}

}
