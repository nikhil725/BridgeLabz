package com.bridgelabz.objectorientedprog;

import java.util.EmptyStackException;

import com.bridgelabz.utility.ListNode;

public class Stack1 {
		
		public ListNode top;
		int length;
		
		public int length(){
			return length;
		}
		public boolean isEmpty(){
			return length == 0;	
		}
		public void push(int data){
			
			ListNode temp = new ListNode(data);
			temp.next = top;
			top = temp;
			length++;
		}
		public int pop(){
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			int result = top.data;
			top = top.next;
			length--;
			return result;	
		}
		public int peek()
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
		public void print()
		{
			if(isEmpty())
			{
				return;
			}

			ListNode current = top;
			while(current!= null)
			{
				System.out.print(current.data + "--> ");
				current = current.next;
			}
		}
		
	}

