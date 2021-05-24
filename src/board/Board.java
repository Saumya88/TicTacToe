package board;

import java.util.*;

public class Board 
{
	private char[] board; //array to store the positions of TicTacToe Board

	public Board() //class constructor to initialize the board
	{
		board = new char[9];
		for(int i=0;i<9;i++) 
			board[i] = '-';
	}

	public void showBoard() //method to print the board on screen
	{
		System.out.println("             1  2  3"); // printing the column number

		for(int i=0;i<9;i++) 
		{
			if(i==0||i==3||i==6)
				System.out.print("          " + (i+1) + "  ");

			System.out.print(board[i] + "  ");

			if(i == 2 || i == 5 || i == 8)
				System.out.println();
		}	
	}

	public boolean checkWin(char symbol)
	{
		if(
			(board[0] == symbol && board[1] == symbol && board[2] == symbol) ||
			(board[3] == symbol && board[4] == symbol && board[5] == symbol) ||
			(board[6] == symbol && board[7] == symbol && board[8] == symbol) ||
			(board[0] == symbol && board[3] == symbol && board[6] == symbol) ||
			(board[1] == symbol && board[4] == symbol && board[7] == symbol) ||
			(board[2] == symbol && board[5] == symbol && board[8] == symbol) ||
			(board[0] == symbol && board[4] == symbol && board[8] == symbol) ||
			(board[2] == symbol && board[4] == symbol && board[6] == symbol)
		)
			return true;
		return false;
 	}

	public int getPosition(boolean player) // method to get the position from user or computer 
	{
		if(player) // if the player type is user the position must be entered by the user
		{
			int position;
			Scanner sc=new Scanner(System.in);
			System.out.print("Your turn \nEnter the position you want to mark : ");
			position=sc.nextInt();
			return position-1;
		}
		else //if the player type is computer then random numbers must be generated as position
		{
			int position;
			Random random = new Random();   
			position = random.nextInt(9); // Generates random integers 0 to 8
			System.out.println("\n Computer's turn");
			return position;	
		}
	}

	public void setPosition(boolean player) // method to the set the symbol on given position on the board
	{
		int position = getPosition(player);
		board[position] = player ? 'X' : 'O';
	}
}

