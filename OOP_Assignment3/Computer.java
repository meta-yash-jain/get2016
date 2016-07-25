package OOP_Assignment3;

import java.util.Random;

public class Computer {

	public void computer(){
		Random generateRandom = new Random();
		Testing testing = new Testing();
		Board draw = new Board();
		boolean flag = true;
		int status;
		while(flag){
			int row = generateRandom.nextInt(3);
			int column = generateRandom.nextInt(3);
			if(Board.board[row][column]=="X" || Board.board[row][column]=="O"){
				flag = true;
				continue;
			} else {
				System.out.println("Computer moves: ");
				flag = false;
				Board.board[row][column]="O";
				draw.board();
				status = testing.testStatus();
				if(status==1){
					System.out.println("Computer wins");
					break;
				} else {
					if(status==2){
						System.out.println("Match is draw");
						break;							
					}
				}
			}
		}
	}
}