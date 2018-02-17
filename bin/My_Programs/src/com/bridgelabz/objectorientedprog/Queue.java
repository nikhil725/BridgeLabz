package com.bridgelabz.objectorientedprog;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;


	public Queue()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	public void enqueue(Date data)
	{
		ListNode temp = new ListNode(data);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
	}
	public Date dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		Date result = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public String print(){
		
		if(isEmpty())
		{
			return null;
		}
		ListNode current = front;
		while(current!= null){
			System.out.print(current.data);
			current = current.next;
		}
		return null;
		
	}
	
	
}