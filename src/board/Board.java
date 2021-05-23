package board;
import java.util.*;
public class Board 
{
	private char[] board; //array to store the positions of TicTacToe Board
	public Board(){ //class constructor to initialize the board
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
	public int getPosition(boolean player) { // method to get the position from user or computer 
		if(player){// if the player type is user the position must be entered by the user
			int position;
			Scanner sc=new Scanner(System.in);
			System.out.println("User's turn \nEnter the position you want to mark");
			position=sc.nextInt();
			System.out.println(position);
			return position;
		}
		else{ //if the player type is computer then random numbers must be generated as position
		
			int position;
			Random random = new Random();   
			// Generates random integers 0 to 8 
			position = random.nextInt(9); 
			System.out.println("\n Computer's turn");
			return position + 1;	
		}
	}
	public void setPosition() { // method to the set the position on the board
		int position;
		// where true represents User and false represents Computer
		boolean player = true;
		char symbol;
		System.out.println("\n \n ***************Game starts************ \n \n");
		showBoard();
		System.out.println("\nUser will go first \n");
		while(true)
		{
			// assigning the symbol on the basis of player type
			// if player is User, symbol='X'
			// if player is Computer, symbol='O'
			if(player)
			{
				symbol = 'X';
			}
			else
			{
				symbol = 'O';
			}
			position=getPosition(player);// calling the method to get the position to be marked
			board[position-1] = symbol; // setting symbol at position
			showBoard();
			
			// change the player type from user to computer and vice versa
			player = player ? false : true;
		
		}
		
	}
}

