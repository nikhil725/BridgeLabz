package com.bridgelabz.objectorientedprog;

import java.util.EmptyStackException;

import com.bridgelabz.utility.ListNode;

public class Stack1 {
	
		public class Node{
			
			public String data;
			public Node next;
			
			public Node(String data){
				
				this.data = data;
				this.next = null;
			}
		}
		
		public Node top;
		int length;
		
		public int length(){
			return length;
		}
		public boolean isEmpty(){
			return length == 0;	
		}
		public void push(String symbol){
			
			Node temp = new Node(symbol);
			temp.next = top;
			top = temp;
			length++;
		}
		public String pop(){
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			String result = top.data;
			top = top.next;
			length--;
			return result;	
		}
		public String peek()
		{
			if(isEmpty()){
				throw new EmptyStackException();	
			}
			return top.data;		
		}
		
		public void reverse()
		{
			if(isEmpty())
			{
				throw new EmptyStackException();
			}
		}
		public String print()
		{
			if(isEmpty())
			{
				return null;
			}

			Node current = top;
			while(current!= null)
			{
				System.out.print(current.data+" todo");
				current = current.next;
			}
			return null;
		}
		
	}

