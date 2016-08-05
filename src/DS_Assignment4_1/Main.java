package DS_Assignment4_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] ar) {
		Heap<Jobs> job = new Heap<Jobs>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1: Insert Jobs");
			System.out.println("2: Print service");
			System.out.println("3: exit");
			int choice = scan.nextInt();
			if(choice == 1){
				job.insertJobs(scan);
			}
			else{ 
				if(choice == 2){
					job.printService();
				} else{ 
					if (choice == 3) {
						break;
					} else {
						System.out.println("\nEnter correct choice\n");
					}
				}
			}
		}
		scan.close();
	}
}
