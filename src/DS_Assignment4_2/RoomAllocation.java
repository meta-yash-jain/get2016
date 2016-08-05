package DS_Assignment4_2;

import java.util.Scanner;

public class RoomAllocation {
	MyHashTable<Integer, Customer> roomMapping;

	public RoomAllocation() {
		roomMapping = new MyHashTable<Integer, Customer>();
	}
	/**
	 * @param scan is Scanner object to take input
	 * @param room is {@link RoomAllocation} object 
	 * Allocating the Rooms to customer 
	 */
	public void insertCust(Scanner scan, RoomAllocation room){
		System.out.println("Enter your name");
		String customerName = scan.nextLine();
		System.out.println("Enter your age");
		int customerAge = scan.nextInt();
		scan.nextLine();
		Customer customer = new Customer(customerName, customerAge);
		room.roomMapping.insertCustomerInfo(customerAge, customer);
	}
	
	/**
	 * @param scan is Scanner object to take input
	 * @param room is {@link RoomAllocation} object
	 * Getting information of the Customers
	 */
	public void getCustomerInfo(Scanner scan, RoomAllocation room){
		System.out.println("Enter the Customer age");
		int age = scan.nextInt();
		scan.nextLine();
		Customer customer = room.roomMapping.getValue(age);
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("Customer Age : " + customer.getCustomerAge());
	}
	
	public static void main(String [] args){
		System.out.println("Welcome to Jain's Guest House");
		RoomAllocation room = new RoomAllocation();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter your choice");
			System.out.println("1: Insert Customer");
			System.out.println("2: Get Customer Info");
			System.out.println("3: exit");
			int choice =  scan.nextInt();
			scan.nextLine();
			if(choice == 1){
				room.insertCust(scan, room);
			}else if(choice == 2){
				room.getCustomerInfo(scan, room);
			}else if(choice == 3){
				break;
			}else{
				System.out.println("\nEnter Correct Choice\n");
			}
		}while(true);
	}
}
