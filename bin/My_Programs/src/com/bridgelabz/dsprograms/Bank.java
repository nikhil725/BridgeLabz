package com.bridgelabz.dsprograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

	public String name;
	private int Accno;
	private int balance;
	static public int Bankbalance=2000;
	Scanner scanner = new Scanner(System.in);

	public Bank(String Name,int Accno,int balance) {

		this.name= name;
		this.Accno = Accno;
		this.balance = balance;
		System.out.println("Transacion Completed");
	}


	void process()
	{
		int number=1,val;
		while(number!=0)
		{
			System.out.println("enter 1 to check balance");
			System.out.println("enter 2 to withdraw amount");
			System.out.println("enter 3 to deposit amount");
			System.out.println("enter 0 to quit");
			number=scanner.nextInt();
			if(number==1)
			{
				val=checkBalance();
				System.out.println("your balance is "+val);
			}
			if(number==2)
			{
				System.out.println("enter the amount to withdraw ");
				val=scanner.nextInt();
				withdraw(val);
			}
			if(number==3)
			{
				System.out.println("enter the amount to deposite ");
				val=scanner.nextInt();
				deposite(val);
			}
			if(number==0)
			{
				System.out.println("thankyou for banking");
				
			}
			else
			{
				System.out.println("enter a valid input ");
			}
		}


	}
	
	public int checkBalance(){
		return balance;
	}
	

	public void withdraw(int amount)
	{
		if(balance>amount)
		{
			balance-=amount;
			this.Bankbalance-=amount;
			if(Bankbalance<=0)
			{
				System.out.println("maintain your account with Rs.2000 .");
				System.exit(0);
			}
			System.out.println("Amount Rs. "+amount+" removed from A/c No "+Accno+" balance left "+balance);
		}
		else
		{
			System.out.println("There is no sufficent balance in your account...Press 1 to check balance");
		}
	}
	public void deposite(int amount)
	{
		balance+=amount;
		this.Bankbalance+=amount;
		System.out.println(amount+"is added to A/c No "+Accno+" new balance "+balance);
	}

	}
