package DS_Assignment1.assignment_4;

public class List {
	public static void main(String[] args) {
		DoublyLinkedList<String> doublyLinkedList =  new DoublyLinkedList<String>();		
		doublyLinkedList.add(0, "yash1");
		doublyLinkedList.add(1, "yash2");
		doublyLinkedList.add(2, "yash3");		
		doublyLinkedList.add(3, "yash4");
		doublyLinkedList.reverse();
		doublyLinkedList.print();
	}
}
