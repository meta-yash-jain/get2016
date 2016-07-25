/*
 * There are 4 conditions:
 * 1. 1: for win case
 * 2. 2: for draw case
 * 3. 3: for no case 
 */
package OOP_Assignment3;

public class Testing {

	public int testStatus(){
		Testing testing= new Testing();
		if(testing.testHorizontal()==1){			
			return 1;
		} else {
			if(testing.testVertical()==1) { 
				return 1;
			} else {
				if(testing.testRightDiagonal()==1){
					return 1;
				} else {
					if(testing.testLeftDiagonal()==1){
						return 1;
					} else {
						if(CheckMove.count==9){
							return 2;
						} else {
							return 3;
						}
					}
				}
			}
		}
	}	
	//Horizontal	
	public int testHorizontal() {
		int win = 0, i, j;
		for(i = 0, j = 0; i < Board.board.length; i++) { 
			if(Board.board[i][j]==Board.board[i][j+1]){
				if(Board.board[i][j]==Board.board[i][j+2]){
					win = 1;
				}
			}
		}
		return win;
	}
	//Vertical
	public int testVertical() {
		int win = 0, i, j;
		for(i = 0, j = 0; i < Board.board.length; i++) { 
			if(Board.board[j][i]==Board.board[j+1][i]){
				if(Board.board[j][i]==Board.board[j+2][i]){
					win = 1;
				}
			}
		}
		return win;
	}
	//RightDiagonal	
	public int testRightDiagonal() {
		int win = 0, i = 0;
		if(Board.board[i][i]==Board.board[i+1][i+1] && Board.board[i][i]==Board.board[i+2][i+2]){
			win = 1;
		}
		return win;
	}
	//Left Diagonal
	public int testLeftDiagonal() {
		int win = 0, i = 0;
		if(Board.board[i][i+2]==Board.board[i+2][i] && Board.board[i+1][i+1]==Board.board[i+1][i+1]){
			win = 1;
		}
		return win;
	}
}