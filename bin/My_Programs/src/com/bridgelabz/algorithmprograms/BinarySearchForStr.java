package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BinarySearchForStr {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter " + size + " character ");
		for (int i = 0; i < size; i++) {

			arr[i] = scanner.nextLine();

		}

		System.out.println("Enter word to search");

		String word = scanner.nextLine();

		Utility.bubbleSort(arr);
		System.out.println("Sorted array is..");
		for (String i : arr) {

			System.out.print(i + " ");
		}

		int index = Utility.binarySearch(word, arr, arr.length);

		if (index < 0) {
			System.out.println("Word not found");
		} else {
			System.out.println("Word found at " + index + " location");
		}
	}

}
