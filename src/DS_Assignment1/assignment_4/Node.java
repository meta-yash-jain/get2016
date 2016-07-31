package DS_Assignment1.assignment_4;

public class Node<E> {
	public E nodeValue;
	public Node<E> nextNode;
	public Node<E> prevNode;	
	/**
	 * empty constructor for node
	 */
	public Node(){		
		nodeValue = null;		
		nextNode = null;
		prevNode = null;
	}	
	/**
	 * parameterized constructor to set the item for node
	 * @param item
	 */
	public Node(E item){		
		nodeValue = item;		
		nextNode = null;		
		prevNode = null;
	}	
	@Override
	public String toString() {
		return nodeValue.toString();
	}
}