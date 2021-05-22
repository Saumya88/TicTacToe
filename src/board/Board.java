package board;
import java.util.*;
public class Board 
{
	private char[][] board; //array to store the positions of TicTacToe Board
	public Board() //class constructor to initialize the board
	{
		board = new char[3][3];
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				board[i][j] = '-';
			}
		}
	}
	public void showBoard() //method to print the board on screen
	{
		System.out.println("             1  2  3"); // printing the column number
		for(int i=0;i<3;i++) 
		{
			System.out.print("          " + (i+1) + "  ");// printing the row number
			for(int j=0;j<3;j++) 
			{
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public int getPosition(boolean player) // method to get the position from user or computer 
	{
		if(player) // if the player type is user the position must be entered by the user
		{
			int position;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the position you want to mark");
			position=sc.nextInt();
			System.out.println(position);
			return position;
		}
		else //if the player type is computer then random numbers must be generated as position
		{
			int position;
			Random random = new Random();   
			// Generates random integers 0 to 8 
			position = random.nextInt(9);  
			return position + 1;
			
		}

	}
	
	public void setPosition() // method to the set the position on the board
	{
		int position;
		//Since Strings are immutable, we can use Boolean values
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
			switch(position)
			{
				case 1: board[0][0]=symbol;
				break;
				case 2: board[0][1]=symbol;
				break;
				case 3: board[0][2]=symbol;
				break;
				case 4: board[1][0]=symbol;
				break;
				case 5: board[1][1]=symbol;
				break;
				case 6: board[1][2]=symbol;
				break;
				case 7: board[2][0]=symbol;
				break;
				case 8: board[2][1]=symbol;
				break;
				case 9: board[2][2]=symbol;
				break;
				default:
				break;
			
			}
			showBoard();
			
			// change the player type from user to computer and vice versa
			player = player ? false : true;
		
		}
	}
}

