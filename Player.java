import java.util.Scanner;
public class Player {
	int chips = 21;
	String symbol;
	int[] lastPlayed = new int[2];
	boolean isWinner = false;
	public Player(String symbol){
		this.symbol = symbol;
	}
	Slot[][] dropChip(Slot[][] board){
		if (chips == 0){
			System.out.println("You're out of chips!");
			return board;
		}
		System.out.print("Select where to drop your chip (1-7). ");
		Scanner s = new Scanner(System.in);
		int column = s.nextInt() - 1;
		int row = 5;
		
		while(true){
			if (board[row][column].status.equals(" ")){
				board[row][column].status = this.symbol;
				break;
			} else {
				row--;
			}	
			if (row == 0 && board[row][column].status.equals(" ") == false){
				System.out.print("Column full. Select where to drop your chip (1-7). ");
				column = s.nextInt() - 1;
				row = 5;
			}
		}
		chips--;
		checkWinner(column,row);
		return board;
	}
	void checkWinner(int x, int y){ //This is where the program will scan the chips to find a 4-in-a-row pattern
	}
}
