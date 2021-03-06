package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryWord
{
  /* public static void main(String args[])
   {
      int counter, num, item, array[], first, last, middle;
     
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt();      
      array = new int[num];

      System.out.println("Enter " + num + " integers");
     
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();

      System.out.println("Enter the search value:");
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }*/
	
		private static void sort(String [] words) {
			int length = words.length;
			for(int i=0; i<length; i++) {
				for(int j=i; j<length; j++) {
					if(words[i].compareTo(words[j]) > 0) {
						String temp = words[i];
						words[i] = words[j];
						words[j] = temp;
					}
				}
			}
		}

		private static int bsearch(String word, String [] words, int a, int b) {
			if(b <= a)
				return -1;

			if(b - a == 1)
				return words[a].equals(word) ? a : -1;

			int pivot = (a + b)/2;
			if(word.compareTo(words[pivot]) < 0) {
				return bsearch(word, words, 0, pivot);
			} else if(word.compareTo(words[pivot]) > 0) {
				return bsearch(word, words, pivot, b);
			}
	System.out.println("result is "+word.compareTo(words[pivot]));
			return pivot;
		}

		public static void main(String [] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String [] words = new String[10];
			for(int i=0; i<10; i++) {
				System.out.print("words["+i+"]: ");
				words[i] = br.readLine();
			}

			sort(words);
			for(int i=0; i<10; i++) {
				System.out.println("words["+i+"] = " + words[i]);
			}

			System.out.print("Enter word to search for: ");
			String word = br.readLine();

			int index = bsearch(word, words, 0, words.length);
			if(index < 0) {
				System.out.println("not found");
			} else {
				System.out.println("found at index " + index);
			}
		}
	}
