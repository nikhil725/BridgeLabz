package com.bridgelabz.dsprograms;

import java.util.Arrays;

public class AnagramTwoDArray {

	public static void main(String[] args) {
		
		System.out.println("Anagram number in 2D array: ");
		System.out.println();
		twoDAnagram(1000);
		
	}
	public static void twoDAnagram(int size) {
		
		int number = size;
		boolean status2, status, status1;
		int k = 1;
		int temp =100;
		for (int i = 11; i < size; i++)
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status2 = anagramNum(i, j);
				status1 = primeNum(i);
				status = primeNum(j);
				
				if (status2 && status && status1) 
				{

					/*while (i > 100 && j > 100 && k == 1) {
						System.out.println();
						k = 0;
					}
					while (i > 200 && j > 200 && k == 0) {
						System.out.println();
						k = 2;
					}
					while (i > 300 && j > 300 && k == 2) {
						System.out.println();
						k = 3;
					}
					while (i > 400 && j > 400 && k == 3) {
						System.out.println();
						k = 4;
					}
					while (i > 500 && j > 500 && k == 4) {
						System.out.println();
						k = 5;
					}
					while (i > 600 && j > 600 && k == 5) {
						System.out.println();
						k = 6;
					}
					while (i > 700 && j > 700 && k == 6) {
						System.out.println();
						k = 7;
					}
					while (i > 800 && j > 800 && k == 7) {
						System.out.println();
						k = 8;
					}
					while (i > 900 && j > 900 && k == 8) {
						System.out.println();
						k = 9;
					}*/
					if(j>temp){
						System.out.println();
						temp = temp+100;
					}
					System.out.print(" " + i + " ");
					System.out.print(" " + j + " ");
					
				}

			}
		}
		System.out.println();
	}
	public static boolean primeNum(int num) {
		
		if (num < 2)
		{
			return false;
		} else {
			int temp;
			for (int i = 2; i <= num / 2; i++) {
				temp = num % i;
				if (temp == 0) {
					return false;

				}
			}
			return true;
		}

	}

	public static boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}


}
