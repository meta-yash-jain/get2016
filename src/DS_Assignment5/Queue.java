package DS_Assignment5;

import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		QueueOperations<Integer> queue = new QueueOperations<Integer>();
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1. Insert");
			System.out.println("2. Remove front");
			System.out.println("3. Check empty");
			System.out.println("4. Get front");
			System.out.println("5. Clear");
			System.out.println("6. Size");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter a number to insert");
				int data;
				while (true) {
					try {
						data = scan.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Try again");
						scan.next();
					}
				}
				queue.enqueue(data);
				break;
			case 2:
				System.out.println("Element removed \n" + queue.deQueue());
				break;
			case 3:
				System.out.println("Empty Status : " + queue.isEmpty());
				break;
			case 4:
				System.out.println("Front element : " + queue.getFront());
				break;
			case 5:
				queue.removeAll();
				System.out.println("Priority Queue Cleared");
				break;
			case 6:
				System.out.println("\nSize = " + queue.getSize());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		// To show complete queue
		System.out.println("Queue:");
		for (int data : queue.linkedList) {
			System.out.println(data);
		}
		scan.close();
	}
}