package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = in.nextLine();
		System.out.println("Enter Sceond String");
		String str2 = in.nextLine();

		String regex = "\\s+";
		Pattern p = Pattern.compile(regex);
		Matcher m1 = p.matcher(str2);
		Matcher m2 = p.matcher(str1);

		if(m1.find()){
			String ggg = m2.replaceAll("");
			str2 = ggg;
		}else if(m2.find()){

			String hh = m2.replaceAll("");
			str1 =hh;

		}



		System.out.println(str2);
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		int m = arr1.length;
		int n = arr2.length;
		int found, not_found = 0;

		if(m!=n){

			System.out.println("Given strings are not anagram");

		}else{

			for(int i=0; i<m; i++)
			{
				found = 0;

				for(int j=0; j<m; j++)
				{ 
					if(str1.charAt(i) == str2.charAt(j))
					{
						found = 1;
						break;
					}
				}

				if(found == 0)
				{
					not_found=1;
					break;
				}
			}

			if(not_found == 1)
			{
				System.out.println("The given strings are Not Aangram");

			}else{

				System.out.println("The "+str1+" and "+str2+" both strings are Anagram");
			}



		}

	}

}
