package DS_Assignment4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heap<E> {
	List<Jobs> listOfJobs = new ArrayList<Jobs>();
	/**
	 * @param scan is object of Scanner class
	 */
	public void insertJobs(Scanner scan) {
		Jobs job = new Jobs();
		System.out.println("Enter the type of job");
		System.out.println("1 : Under Graduates");
		System.out.println("2 : Graduates");
		System.out.println("3 : Proffesors");
		System.out.println("4 : Chairman");
		int priority = scan.nextInt();
		if(priority > 4){
			System.out.println("Please enter corrct option");
			return;
		}
		job.setPriority(priority);
		listOfJobs.add(job);
		buildHeap();
		scan.nextLine();
	}
	public void buildHeap() {
		if(listOfJobs.isEmpty()) {
			System.out.println("No Jobs \nReady To Print Again!! \n");
		} else {
			for(int i = listOfJobs.size() / 2 - 1; i >= 0; i--) {
				heapify(i);
			}
		}
	}
	/**
	 * @param index from where it had to maintain that property
	 * It maintain map heap property
	 */
	public void heapify(int index) {
		Jobs temp;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int largest = index;
		if (left < listOfJobs.size() && listOfJobs.get(left).compareTo(listOfJobs.get(index)) > 0) {
			largest = left;
		} else {
			largest = index;
		}
		if(right < listOfJobs.size() && listOfJobs.get(right).compareTo(listOfJobs.get(index)) > 0) {
			largest = right;
		}
		if (largest != index) {
			temp = listOfJobs.get(largest);
			listOfJobs.set(largest, listOfJobs.get(index));
			listOfJobs.set(index, temp);
			heapify(largest);
		}
	}
	public void printService() {
		if(listOfJobs.isEmpty()) {
			System.out.println("No Jobs Available");
		} else {
			while(!listOfJobs.isEmpty()) {
				System.out.println(listOfJobs.get(0).getName() + " is getting printed ... \n");
				Jobs temp = listOfJobs.get(listOfJobs.size() - 1);
				listOfJobs.set(0, temp);
				listOfJobs.remove(listOfJobs.size() - 1);
				buildHeap();
			}
		}
	}
}
