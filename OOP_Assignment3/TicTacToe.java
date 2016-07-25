package OOP_Assignment3;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		int i, status;
		Board draw = new Board();
		Player play = new Player();
		Computer plays = new Computer();
		draw.board();
		System.out.println("1.Human Players");
		System.out.println("2.Computer Players");
		System.out.println("Enter choice");
		Scanner sc= new Scanner(System.in);
		int choice= sc.nextInt();
		for(i = 2; i < 12; i++){
			if (i % 2==0){
				status = play.player(1);
				if(status==0){
					i--;
					System.out.println("Please enter correct position");
					continue;
				} else {
					if(status==1){
						System.out.println("Player 1 wins");
						break;
					} else {
						if(status==2){
							System.out.println("Match is draw");
							break;							
						}
					}
				}
			} else {
				if(choice==2){
					plays.computer();
				} else {
					status = play.player(2);
					if(status==0){
						i--;
						System.out.println("Please enter the correct position");
						continue;
					} else {
						if(status==1){
							System.out.println("Player 2 wins");
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
		sc.close();
		play.closeScanner();
	}
}