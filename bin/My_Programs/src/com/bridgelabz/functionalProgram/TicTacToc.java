package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program for TicTacToc game.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 13/01/2018
 */

public class TicTacToc {

	public static final int EMPTY = 0;
	public static final int Player_First = 1;
	public static final int Player_Sceond = 2;
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int Player_First_WON = 2;
	public static final int Player_Sceond_WON = 3;
	public static final int ROWS = 3, COLS = 3;
	public static int[][] board = new int[ROWS][COLS];

	public static int currentState;  

	public static int currentPlayer; 
	public static int currntRow, currentCol;

	public static Scanner in = new Scanner(System.in);


	public static void main(String[] args) {

		initGame();

		do 
		{
			playerMove(currentPlayer);
			updateGame(currentPlayer, currntRow, currentCol); 
			printBoard();

			if (currentState == Player_First_WON) 
			{
				System.out.println("'PlayerFirst' won! Bye!");
			} else if (currentState == Player_Sceond_WON)
			{
				System.out.println("'PlayerSceond' won! Bye!");
			} else if (currentState == DRAW) 
			{
				System.out.println("It's a Draw! Bye!");
			} 
			currentPlayer = (currentPlayer == Player_First) ? Player_Sceond : Player_First;
		} while (currentState == PLAYING); 
	}

	public static void initGame()
	{
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

	public static void playerMove(int value) 
	{
		boolean validInput = false;  
		do {
			if (value == Player_First) {
				System.out.print("Player_First, enter your move: ");
			} else 
			{
				System.out.print("Player_Sceond, enter your move : ");
			}
			int row = in.nextInt() - 1; 
			int col = in.nextInt() - 1;
			if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) 
			{
				currntRow = row;
				currentCol = col;
				board[currntRow][currentCol] = value;  
				validInput = true;  
			} 
			else {
				System.out.println("This move is not valid. Try again...");
			}
		} while (!validInput);  
	}


	public static void updateGame(int value, int currentRow, int currentCol) 
	{
		if (hasWon(value, currentRow, currentCol)) { 
			currentState = (value == Player_First) ? Player_First_WON : Player_Sceond_WON;
		} else if (isDraw()) 
		{ 
			currentState = DRAW;
		}  
	}

	public static boolean isDraw() 
	{
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
		switch (content) 
		{
		case EMPTY:  System.out.print("   "); break;
		case Player_First:  System.out.print(" X "); break;
		case Player_Sceond: System.out.print(" O "); break;
		}
	}

}
