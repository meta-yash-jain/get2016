package DS_Assignment1.assignment_3;

public final class List {
	public static void main(String[] args) {
		SinglyLinkedList<String> singlyLinkedList= new SinglyLinkedList<String>();		
		singlyLinkedList.add(0, "yash1");
		singlyLinkedList.add(1, "yash2");
		singlyLinkedList.add(2, "yash3");
		singlyLinkedList.add(3, "yash4");		
		singlyLinkedList.reverse();		
		singlyLinkedList.print();
	}
}
