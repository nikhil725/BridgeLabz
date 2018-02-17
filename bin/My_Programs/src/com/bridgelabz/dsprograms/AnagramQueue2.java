package com.bridgelabz.dsprograms;

import java.util.Arrays;

import com.bridgelabz.utility.Queue;

public class AnagramQueue2 {
	
public static void main(String[] args) {
		
		System.out.println("Anagram number in Queue ");
		System.out.println();
		twoDAnagram(1000);
		
	}
	public static void twoDAnagram(int size) {
		Queue queue = new Queue();
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
 

					queue.enqueue(i);

					queue.enqueue(j);
					
				}

			}
		}
		queue.print();
		
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
