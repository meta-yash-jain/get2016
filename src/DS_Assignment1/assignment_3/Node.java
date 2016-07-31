package DS_Assignment1.assignment_3;

public class Node<E> {
	public E nodeValue;
	public Node<E> nextNode;
	/**
	 * empty constructor to initialize values
	 */
	public Node(){
		nodeValue = null;
		nextNode = null;
	}
	/**
	 * @param item
	 * parameterized constructor to set item as node value
	 */
	public Node(E item){
		nodeValue = item;
		nextNode = null;
	}
	@Override
	public String toString() {
		return nodeValue.toString();
	}
}