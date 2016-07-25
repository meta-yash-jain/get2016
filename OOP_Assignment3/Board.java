package OOP_Assignment3;

public class Board {
	public static String board[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	public void board(){
		int i, j;
		for(i = 0; i < board.length; i++) { 
			for(j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.print("\n");
			if(i != board.length-1)
				System.out.println("-----------");
		}
	}
}