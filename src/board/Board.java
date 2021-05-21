package board;
public class Board {
	private char[][] board;
	public Board() {
		board = new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j] = '-';
			}
		}
	}
	public void showBoard() {
		System.out.println("             1  2  3");
		for(int i=0;i<3;i++) {
			System.out.print("          " + (i+1) + "  ");
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
