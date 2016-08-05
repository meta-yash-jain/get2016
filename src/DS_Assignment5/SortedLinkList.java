package DS_Assignment5;

import java.util.Scanner;

public class SortedLinkList {
	public static void main(String[] args) {
		SortedLinkListOperation sortedLinkList = new SortedLinkListOperation();
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter a number to insert");
			int data;
			while (true) {
				try {
					data = scan.nextInt();
					sortedLinkList.addElement(data);
					break;
				} catch (Exception e) {
					System.out.println("Not valid, Try again");
					scan.next();
				}
			}
			System.out.println("\nDo you want to continue (Type y or n)\n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		// To show sorted linkList
		System.out.println("Sorted LinkList:");
		for (int data : sortedLinkList.linkedList) {
			System.out.println(data);
		}
		scan.close();
	}
}