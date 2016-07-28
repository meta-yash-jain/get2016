package DS_Assignment1.assignment_3;

public class Node<E> {
	public E nodeValue;
	public Node<E> nextNode;
	public Node(){
		nodeValue = null;
		nextNode = null;
	}
	public Node(E item){	
		nodeValue = item;
		nextNode = null;
	}
}
