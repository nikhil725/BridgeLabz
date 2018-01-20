package com.bridgelabz.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Utility {
	
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
	
	public double calculatePayment(int y, int p, float r){
		
			int n = 12 * y;
			float i = r / (12 * 100);
			double pow = Math.pow((1 + i), (-n));
			double payment = p * i / (1 - pow);
		return payment;
		
	}
	
	public double squarRoot(double c){
		
		double t = c;
		double Epsilon = 1E-15;
		while ((Math.abs(t - c / t)) > (Epsilon * t)) {
			t = (t + (c / t)) / 2;
		}
		return t;
		
	}
	
	public char[] toBinary(int n){
		
		String temp = (String.format("%16s", Integer.toBinaryString(n)).replace(" ", "0"));
		System.out.println("binary formate : " + temp);
		char arr[] = temp.toCharArray();
		
		
		return arr;
	}
	
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
	 
	 public String[] checkPrime(int limit)
	 {
		 
		 String[] array = new String[1000];
	        int position = 0;
	        for (int i = 2; i < limit; i++) //limit  times
	        {
	            boolean isPrime = true;
	            
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
}