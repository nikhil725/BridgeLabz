package com.bridgelabz.designpattern;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Stack stack1=new Stack(100);
		Stack stack2=new Stack(100);
		Stack stack3=new Stack(100);
		System.out.println("Enter the Paragraph...");
		String paragraph=scanner.nextLine();


		String [] str=paragraph.split(" ");
		for(int i=0;i<str.length;i++) {

		}	

		for(int i=0;i<str.length;i++) {
			String word;
			word=str[i];
			int length=word.length()-1;

			if(word.charAt(0)=='a'|| word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u') {

				stack1.push(word);
				System.out.println();
				//stack1.pop();


			}
//			 if(word.charAt(length)=='a'|| word.charAt(length)=='e'||word.charAt(length)=='i'||word.charAt(length)=='o'||word.charAt(length)=='u') {
//			stack2.push(word);
//			//stack2.pop();
//		}

		if((word.charAt(0)=='a'|| word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u')&&
				((word.charAt(length)=='a'|| word.charAt(length)=='e'||word.charAt(length)=='i'||word.charAt(length)=='o'||word.charAt(length)=='u') )) {
			stack3.push(word);
			//stack3.pop();
			}

		}
	}
}