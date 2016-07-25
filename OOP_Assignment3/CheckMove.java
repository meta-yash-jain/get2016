package OOP_Assignment3;

public class CheckMove {
	static int count = 0;
	public boolean checkMove(String position,int player){
		int i, j;
		boolean flag = false;
		for(i = 0; i < 3; i++) { 
			for(j = 0; j < 3; j++) {
				if(Board.board[i][j].equals(position)){
					if(player == 1){ 
						Board.board[i][j] = "X";
						count++;
					} else {
						Board.board[i][j] = "O";
						count++;
					}
					flag = true;
					break;
				}
			}
			if(flag==true) {
				break;
			}
		}
		return flag;	
	}
}