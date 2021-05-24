package board;

public class Game {

    public Game() {

        Board board = new Board(); // creates a new board

        boolean player = true; // true represents User and false represents Computer
        char symbol;
        boolean win;

        System.out.println("\n \n ***************Game starts************ \n \n");

        board.showBoard();

        while (true)
        {
            // assigning the symbol on the basis of player type
            // if player is User, symbol='X'
            // if player is Computer, symbol='O'
            symbol = player ? 'X' : 'O';

            board.setPosition(player); // calling the method to get the position to be marked

            board.showBoard();

            win = board.checkWin(symbol);
            if (win)
                break;

            player = player ? false : true; // change the player type from user to computer and vice versa
        }

        if (win)
            System.out.println(player ? "You win :D" : "You lose :(");
    }
}