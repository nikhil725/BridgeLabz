package com.bridgelabz.dsprograms;

import java.util.Scanner;

public class gap {
public static void main(String[] args) {
	
	int binaryGap = 0;
	String binary = "";
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter decimal number ");
	int num = scanner.nextInt();
	
	while (num > 0) 
	{
		binary = num % 2 + binary;
		num = num / 2;
	}

	char[] characters = binary.toCharArray();
	Character c;
	int j = 0;
	for (int i = 0; i < characters.length; i++) {
        c = characters[i];
       if (c.equals('0')) {
           j += 1;
       }

       if (c.equals('1')) 
       {
           if (j > binaryGap ){
               binaryGap = j;
           }
           j = 0;
       }

   }
   System.out.println(binaryGap);


}
}
