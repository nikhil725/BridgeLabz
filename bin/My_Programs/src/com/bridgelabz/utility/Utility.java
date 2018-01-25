package com.bridgelabz.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Utility {

	/** This method is used for temprature convertion.
	 * @param n
	 * @param value
	 * @return
	 */
	public double tempratureConvertion(int n, float value){

		double ans;
		if (n == 0) {
			value = value + 32;
			ans = 1.8 * value;
			return ans;
		}
		if (n == 1) {
			value = value - 32;
			ans = value * 0.5556;
			return ans;
		}
		return 0;
	}

	/** This method is used to calculate payment.
	 * @param y
	 * @param p
	 * @param r
	 * @return
	 */
	public double calculatePayment(int y, int p, float r){

		int n = 12 * y;
		float i = r / (12 * 100);
		double pow = Math.pow((1 + i), (-n));
		double payment = p * i / (1 - pow);
		return payment;

	}

	/** This method is to calculate squar root
	 * @param c
	 * @return
	 */
	public double squarRoot(double c){

		double t = c;
		double Epsilon = 1E-15;
		while ((Math.abs(t - c / t)) > (Epsilon * t)) {
			t = (t + (c / t)) / 2;
		}
		return t;

	}

	/** This method is used to check binary number.
	 * @param n
	 * @return
	 */
	public char[] toBinary(int n){

		String temp = (String.format("%16s", Integer.toBinaryString(n)).replace(" ", "0"));
		System.out.println("binary formate : " + temp);
		char arr[] = temp.toCharArray();


		return arr;
	}

	/** This method is used to calculate binary nibbles
	 * @param num
	 */
	public void binaryNibbles(int num){

		String temp=(String.format("%8s",Integer.toBinaryString(num)).replace(" ", "0"));
		//char arr[]=temp.toCharArray();
		char[] m=new char[8];
		m=temp.toCharArray();
		char[] n=new char[8];
		int i,j=0;
		for (i =4 ; i<8 ; i++) {
			n[j]=m[i];
			j++;
		}
		for(i=0;i<4;i++)
		{
			n[j]=m[i];
			j++;
		}

		for (i =0 ; i<8 ; i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("swaped nibbles are");
		System.out.println();
		for(i=0;i<8;i++)
		{
			System.out.print(n[i]+" ");
		}

		System.out.println();
		int pow=0;
		j=7;
		for (i =0 ; i<8 ; i++) {
			if(n[i]=='1')
			{
				pow +=(int)Math.pow(2, j);

			}  

			j--;
		}
		System.out.print(pow+" ");
		i=1;
		while(i<pow)
		{
			i=i*2;
		}
		if(i==pow)
		{
			System.out.println("number is power of two");
		}
		else 
		{
			System.out.println("number is not a power of two");
		}
	}

	public class ListNode{
		public String[] data;
		public ListNode next;

		public ListNode(String[] data) {
			this.data = data;
		}
	}

	ListNode head;

	public void add(String[] data){
		ListNode node = new ListNode(data);

		node.next = head;
		head = node;
	}

	public void remove(String data, int position){

		if(position == 1){

			ListNode temp = head;
			head = head.next;
			temp.next = null;
		}else{
			ListNode previous = head;
			int count =1;
			while(count < position-1){
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
		}


	}

	boolean search(ListNode head, String[] key){
		ListNode current = head;

		while(current != null){

			if(current.data == key){

				return true;
			}

			current = current.next;
		}
		return true;		
	}

	/** This method is used to check prime number.
	 * @param limit
	 * @return
	 */
	public String[] checkPrime(int limit)
	{

		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i < limit; i++) //limit  times
		{
			boolean isPrime = true;
			//			if(stake == 0)
			//			{
			//				stakeLoss++;
			//			}else{
			//				stakeWin++;			
			//			}
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime) 
			{
				array[position] = String.valueOf(i);//index ibvalue to string
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) 
		{
			array1[k] = array[k];
		}
		return array1;
	}

	/** This method is used to check the given strings are anagram.
	 * @param string1
	 * @param string2
	 * @return
	 */
	public boolean checkAnagram(String string1, String string2){

		if (string1.length() != string2.length()) {
			return false;
		}
		char[] a = string1.toCharArray();
		sort(a);
		char[] b = string2.toCharArray();
		sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sort(char[] ab) 
	{
		for (int i = 0; i < ab.length; i++) 
		{
			for (int j = i + 1; j < ab.length; j++) 
			{
				if (ab[i] > ab[j]) {
					char temp = ab[i];
					ab[i] = ab[j];
					ab[j] = temp;
				}
			}
		}

	}
	/** This method is used to find palindrome string 
	 * @param s
	 * @return
	 */
	public boolean palindrome(String s) {
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) 
		{
			if (c[i] != c[n - 1 - i])
			{
				return false;
			}
		}
		return true;
	}

	public void orderedList(ArrayList<Integer> list, File file) throws IOException {

		Scanner scan = new Scanner (System.in);
		Iterator itr = list.iterator(); 
		System.out.println("Enter the element to find");
		int key = scan.nextInt();
		while(itr.hasNext())
		{
			if(list.contains(key))
			{
				list.remove(list.indexOf(key));
				break;
			}
			else
			{
				list.add(key);
				list.sort(null);
				break;
			}
		}
		String str ="";
		Iterator itr1 = list.iterator();
		while(itr1.hasNext())
		{
			str+= itr1.next()+" ";
		}
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.flush(); 


	}

	public void parenthesis(String exp, Stack<Integer> stk)
	{
		int len = exp.length();

		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < len; i++) 
		{
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);

			else if (ch == ')') 
			{
				try {
					int p = stk.pop();
					System.out.println("parenthes is matched");
				} catch (Exception e) 
				{
					System.out.println("Parenthes is un mached");
				}
			}
		}
		while (!stk.isEmpty()) {
			System.out.println((stk.pop()) + " is un matched");
		}
	}

	public LinkedList serachMethod(LinkedList linkedList, int search, int k) 
	{
		Iterator iterator = linkedList.iterator();

		boolean found = false;
		while (iterator.hasNext()) {
			if (iterator.next().equals(search)) {
				linkedList.remove(k);
				found = true;
			}
			k++;
		}
		if (found == false)
			linkedList.add(search);
		return linkedList;
	}

	/** This method is used to check given year is leap year.
	 * @param year
	 * @return 
	 */
	public static boolean isLeapYear(int year) {

		if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		if (year % 400 == 0) {
			return true;
		} else {

			return false;
		}
	}

	public static void initGame(int[][] board, int ROWS, int COLS)

	{
		int currentState;  
		int PLAYING = 0;
		int currentPlayer;
		int Player_First = 1;

		int EMPTY = 0;
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col)
			{
				board[row][col] = EMPTY;  
			}
		}
		currentState = PLAYING;
		currentPlayer = Player_First; 
	}

	public static boolean isDraw() 
	{
		int ROWS = 3, COLS= 3;
		int EMPTY =0;
		int[][] board = new int[ROWS][COLS];
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col) 
			{
				if (board[row][col] == EMPTY) 
				{
					return false; 
				}
			}
		}
		return true; 
	}

	public static boolean hasWon(int value, int currentRow, int currentCol)
	{
		int[][] board = new int[3][3];
		return (board[currentRow][0] == value       
				&& board[currentRow][1] == value
				&& board[currentRow][2] == value
				|| board[0][currentCol] == value    
				&& board[1][currentCol] == value
				&& board[2][currentCol] == value
				|| currentRow == currentCol          
				&& board[0][0] == value
				&& board[1][1] == value
				&& board[2][2] == value
				|| currentRow + currentCol == 2  
				&& board[0][2] == value
				&& board[1][1] == value
				&& board[2][0] == value);
	}

	public static void printBoard() 
	{
		int ROWS = 3, COLS= 3;
		int[][] board = new int[ROWS][COLS];
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col) 
			{
				printCell(board[row][col]); 
				if (col != COLS - 1) 
				{
					System.out.print("|");  
				}
			}
			System.out.println();
			if (row != ROWS - 1)
			{
				System.out.println("-----------"); 
			}
		}
		System.out.println();
	}

	public static void printCell(int content) 
	{
		final int EMPTY = 0;
		final int Player_First = 1;
		final int Player_Sceond = 2;
		switch (content) 
		{
		case EMPTY:  System.out.print("   "); break;
		case Player_First:  System.out.print(" X "); break;
		case Player_Sceond: System.out.print(" O "); break;
		}
	}

	/**
	 * @param value
	 * @param board
	 * @param currentRow
	 * @param currentCol
	 * @param ROWS
	 * @param COLS
	 * @param Player_First
	 * 
	 */
	public static void playerMove(int value,int[][] board, int currentRow, int currentCol, int ROWS, int COLS, int Player_First) 
	{
		Scanner scanner= new Scanner(System.in);

		boolean validInput = false;  
		int EMPTY = 0;
		do {
			if (value == Player_First) {
				System.out.print("Player_First, enter your move: ");
			} else 
			{
				System.out.print("Player_Sceond, enter your move : ");
			}
			int row = scanner.nextInt() - 1; 
			int col = scanner.nextInt() - 1;
			if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) 
			{
				currentRow = row;
				currentCol = col;
				board[currentRow][currentCol] = value;  
				validInput = true;  
			} 
			else {
				System.out.println("This move is not valid. Try again...");
			}
		} while (!validInput);  
		scanner.close();
	}

	/**
	 * @param value
	 * @param currentRow
	 * @param currentCol
	 * @param currentState
	 */
	public static void updateGame(int value, int currentRow, int currentCol, int currentState) 
	{

		final int Player_First = 1;
		final int DRAW = 1;
		final int Player_First_WON = 2;
		final int Player_Sceond_WON = 3;
		if (hasWon(value, currentRow, currentCol)) { 
			currentState = (value == Player_First) ? Player_First_WON : Player_Sceond_WON;
		} else if (isDraw()) 
		{ 
			currentState = DRAW;
		}  
	}

	/** This method is used to start the time.
	 * @return
	 */
	public int start()
	{
		int startTime = (int) System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
		return startTime;
	}
	
	/** This method is used to stop the time
	 * @return
	 */
	public int stop()
	{
		int stopTime =(int) System.currentTimeMillis();
		System.out.println("Start Time is: "+stopTime);
		return stopTime;
	}

	public int sumOfThree(int[] arr, int length){

		int count = 0;
		for(int i=0; i<length; i++)
		{
			for(int j=i+1; j<length; j++)
			{
				for(int k=j+1; k<length ;k++)
				{
					if((arr[i] + arr[j] + arr[k]) == 0){
						count++;
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]+" Count = "+count);
					}
				}
			}
		}
		return 0;
	}

	/** This method is used to find the permutations of string.
	 * @param str
	 * @param l
	 * @param r
	 */
	public void permute(String str, int l, int r)
	{
		if (l == r)
		{
			System.out.println(str);
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}         
		}     
	}
	
	/** This method is used to swap a string.
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public String swap(String a, int i, int j)
	{
		char temp;
		char charArray[] = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);      
	}


	/** This method is used to check the given strings are Anagram.
	 * @param length1
	 * @param length2
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public boolean isAnagram(int length1, int length2, char[] arr1, char[] arr2)
	{
		int found =0;
		if(length1!=length2)
		{
			return false;

		}else{

			for(int i=0; i<length1; i++)
			{			
				for(int j=0; j<length1; j++)
				{ 
					if(arr1[i]==arr2[j])
					{
						return true;
						
					}	
					return false;
				}	
			}
		}
		return false;
	}

	/** This method is used to display integer, double and boolean in 2D array format.
	 * @param arrayElements
	 * @param rows
	 * @param columns
	 */
	public static <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(arrayElements[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}

	}



	/** This method is used to find distinct coupon number.
	 * @param size
	 */
	public void couponNumber(int size)
	{
		int array[] = new int[size];
		int count = 0;
		for(int i=0; i<size;i++)
		{
			array[i]= (int)(Math.random()*size);
			count++;
			for(int j=0; j<i; j++){
				
				if(array[i]==array[j]){
					i--;
				}
				
			}
		}
		for(int i : array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Total Random number to have Distinct Number... "+count);

	}
	
	/**This method for bubbleSort
	 * @param arr
	 */
	public static void bubbleSort(String arr[])
	{
		String temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j].compareTo(arr[j+1])>=0)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	/** This method is used to calculate day.
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int day(int month, int day, int year)
	{
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31*m)/12) % 7;
		return d;
	}
	
	/** This method is used to display calendar.
	 * @param year
	 * @param month
	 */
	public static void calender(int year, int month)
	{
		
		String months[] ={"","January","February","March","April","May","June","July","August","September",
				"October","November","December"};

		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(month == 2 && isLeapYear(year))
		{

			days[month] = 29;
		}

		System.out.println("*****" + months[month] + " " + year+"*****");
		System.out.println("--------------------");
		System.out.println(" S  M T  W Th  F  S");
		System.out.println("--------------------");
		
		int d = day(month, 1, year);
		
		for (int i = 0; i < d; i++)
		{
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) 
		{
			System.out.printf("%2d ", i);
			if(((i + d) % 7 == 0) || (i == days[month])) 
			{
				System.out.println();
			}
			
		}
	}
}