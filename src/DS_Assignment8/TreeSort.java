package DS_Assignment8;

import java.util.List;
import java.util.ArrayList;

public class TreeSort<E> extends Node<E> {
	Node<E> root; 
	List<E> result= new ArrayList<E>();
	public TreeSort() {
		root = null;
	}
	/**
	 * insertion For Binary Search Tree
	 * @param data is value that is used to insert
	 * @param pivort is node from where you want to insert
	 */
	public void insert(E data, Node<E> pivort) {
		if(root == null) {
			root = new Node<E>();
			root.setElement(data);
			root.setLeft(null);
			root.setRight(null);
		} else if(data.toString().compareTo(pivort.getElement().toString()) < 0 && pivort.getLeft() == null) {
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			pivort.setLeft(newnode);
			return;
		} else if(data.toString().compareTo(pivort.getElement().toString()) >= 0 && pivort.getRight() == null) {
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			pivort.setRight(newnode);
			return;
		} else {
			if(data.toString().compareTo(pivort.getElement().toString()) < 0) {
				insert(data, pivort.getLeft());
			} else {
				insert(data, pivort.getRight());
			}
		}
	}

	/**
	 * This function prints the inOreder traversal 
	 * @param pNode is the starting point from where you want to print
	 */
	public void inOrder(Node<E> pNode) {
		if (pNode == null)
			return;
		inOrder(pNode.getLeft());
		result.add(pNode.getElement());
		inOrder(pNode.getRight());
	}

	public List<E> sort() {
		inOrder(root);
		return result;
	}
}