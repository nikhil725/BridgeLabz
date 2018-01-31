package com.bridgelabz.objectorientedprog;

import com.bridgelabz.utility.Utility;

public class DecksOfCardInQueue {
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		String SUITS[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String RANKS[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		utility.deckOfCardsInQueue(SUITS,RANKS);
	}

}
