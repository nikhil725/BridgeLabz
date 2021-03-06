package com.bridgelabz;

import java.util.Scanner;

public class MergeSort {

	private static final String[][] String = null;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of string: ");
		int size = scanner.nextInt();
		String[] strings = new String[size];

		for (int i = 0; i < size; i++) 
		{
			strings[i] = scanner.next();
		}
		scanner.close();
		
		int length = strings.length;
		System.out.println("The lenght"+length);
		strings = mergeSort(strings);

		System.out.println("Sorted list:");

		for (String string : strings) 
		{
			System.out.println(string);
		}

	}

	public static String[] mergeSort(String[] array) 
	{
		if (array.length == 1)
		{
			return array;
		}
		String first[] = new String[array.length / 2];
		String last[] = new String[array.length - (array.length / 2)];
		
		for (int i = 0; i < first.length; i++)
		{
			first[i] = array[i];
		}
		int j = 0;
		for (int i = first.length; i < array.length; i++)
		{
			last[j] = array[i];
			j++;
		}
		first = mergeSort(first);
		last = mergeSort(last);

		String[] returnArray = new String[array.length];
		int firstPos = 0, lastPos = 0;
		for (int i = 0; i < returnArray.length; i++)
		{
			if (lastPos == last.length) 
			{
				returnArray[i] = first[firstPos];
				firstPos++;
			} else if (firstPos == first.length) 
			{	
				returnArray[i] = last[lastPos];
				lastPos++;
			} else if (first[firstPos].compareTo(last[lastPos]) > 0)
			{
				returnArray[i] = last[lastPos];
				lastPos++;
			} else 
			{
				returnArray[i] = first[firstPos];
				firstPos++;
			}
		}
		return returnArray;
	}
}
