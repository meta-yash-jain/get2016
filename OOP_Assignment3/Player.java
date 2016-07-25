package OOP_Assignment3;

import java.util.Scanner;

public class Player {
	private Scanner in;

	public int player(int player){
		CheckMove check = new CheckMove();
		Testing test = new Testing();
		int temp;
		String position;
		Board draw = new Board();
		if(player==1) {
			System.out.println("Player 1 (X) enter position to move");
		} else {
			System.out.println("Player 2 (O) enter position to move");			
		}
		in = new Scanner(System.in);
		temp = in.nextInt();
		position = temp + "";
		if(check.checkMove(position, player)){
			draw.board();
			return test.testStatus();
		}
		draw.board();
		return 0;
	}
	public void closeScanner(){
		in.close();
	}
}
