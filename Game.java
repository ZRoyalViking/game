
public class Game {
	static Slot[][] board = new Slot[6][7];
	public static void main(String[] args) {//-----------------------------------------------------------
		createBoard();
		displayBoard();					//Two-dimensional array of board is built.
		Player p1 = new Player("x");  	//Players initialized.
		Player p2 = new Player("o");
		
		while (true){ //Player 1's turn
			System.out.println("Player 1 - Chips Remaining: "+p1.chips);
			p1.dropChip(board);
			displayBoard();
			if (p1.isWinner == true){
				System.out.print("Player 1 is the winner!");
				break;
			} 		  //Player 2's turn
			System.out.println();
			System.out.println("Player 2 - Chips Remaining: "+p2.chips);
			p2.dropChip(board);
			displayBoard();
			if (p2.isWinner == true){
				System.out.print("Player 2 is the winner!");
				break;
			}
			System.out.println();
		}
	}//---------------------------------------------------------------------------------------------------
	static void createBoard(){
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				board[i][j] = new Slot(" ");
			}
		}
	}//---------------------------------------------------------------------------------------------------
	static void displayBoard(){
		System.out.println("| 1  2  3  4  5  6  7 |");
		for(int i=0;i<6;i++){
			System.out.print("|");
			for(int j=0;j<7;j++){
				System.out.print("("+board[i][j].status+")");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();
	}
	
}
