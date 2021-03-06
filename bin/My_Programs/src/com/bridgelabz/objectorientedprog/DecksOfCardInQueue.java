package com.bridgelabz.objectorientedprog;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for DeekofCards to initialize deck of cards having suit ("Clubs", 
 * 			  "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", 
 * 			  "Jack", "Queen", "King", "Ace"). 
 * @author  : bridgeit
 * @version : 1.0
 * @date    : 31/01/2017
 *
 */
public class DecksOfCardInQueue {
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		String SUITS[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String RANKS[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		utility.deckOfCardsInQueue(SUITS,RANKS);
	}

}
