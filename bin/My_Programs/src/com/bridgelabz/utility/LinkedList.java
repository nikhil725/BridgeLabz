package com.bridgelabz.utility;

public class LinkedList {

	ListNode head;
	int length;
	
	public int size(){
		
		return length;
	}
	public void insertbegin(int data){

		ListNode node = new ListNode(data);
		node.next = head;
		head = node;
		length++;
		
	}

	public void insertend(int data){

		ListNode node = new ListNode(data);
		if(head == null){
			head = node;

		}
		else{

			ListNode temp = head;
			while(temp.next!=null){

				temp = temp.next;
			}
			temp.next = node;
			length++;
		}
	}

	public void insertmiddle(int data, int position){

		ListNode temp = head;
		for(int i = 1; i<position;i++){

			temp = temp.next;
		}
		ListNode node  = new ListNode(data);
		node.next = temp.next;
		temp.next=node;
		length++;
	}

	public void deletefirstnode(){

		ListNode temp = head;
		head = head.next;
		temp.next = null;
		length--;
	}

	public void deletelastnode(){

		ListNode last = head;
		ListNode previousTolast = null;
		while(last.next!=null){

			previousTolast = last;
			last = last.next;			
		}
		previousTolast.next = null;
		length--;
	}
	public void deletenode(int position){

		if(position == 1){
			ListNode temp = head;
			head =head.next;
			temp.next = null;

		}
		length--;
	}
	public void printList()
    {
        ListNode tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
}

