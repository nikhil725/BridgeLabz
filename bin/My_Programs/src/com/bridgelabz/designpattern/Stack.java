package com.bridgelabz.designpattern;

public class Stack {
	public int size;
	public int top;
	public String str [];
	
	public Stack(int size) {
		
	this.size=size;	
	top=-1;
	str=new String[size];
	
	}
	
	
	public boolean isEmpty(){
		if(top==-1) {
			return true;
		}else {
			return false;
			
		}
	}
	public void push(String  data){
		if(isFull()) {
			System.out.println("fULL");
		}else {
		str[top]=data;		
		top++;
		}
	}
	public void pop(){
		if(isEmpty()) {
			System.out.println("empty");
			
		}
		else {
			top--;
		}
		
	}
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
}
