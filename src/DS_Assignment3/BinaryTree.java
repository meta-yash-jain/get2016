package DS_Assignment3;

public class BinaryTree<E> extends Node<E> {
	Node<E> root; 
	Node<E> rootMirror;
	public BinaryTree() {
		root = null;
		rootMirror = null;
	}
	/**
	 * insertion For Binary Tree
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
	 * insertion For Mirror Binary Tree
	 * @param data is value that is used to insert
	 * @param pivort is node from where you want to insert
	 */
	public void insertMirror(E data, Node<E> pivort) {
		if (rootMirror == null) {
			rootMirror = new Node<E>();
			rootMirror.setElement(data);
			rootMirror.setLeft(null);
			rootMirror.setRight(null);
		} else if (data.toString().compareTo(pivort.getElement().toString()) >= 0 && pivort.getLeft() == null) {
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			pivort.setLeft(newnode);
			return;
		} else if (data.toString().compareTo(pivort.getElement().toString()) < 0 && pivort.getRight() == null) {
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			pivort.setRight(newnode);
			return;
		} else {
			if (data.toString().compareTo(pivort.getElement().toString()) >= 0) {
				insertMirror(data, pivort.getLeft());
			} else {
				insertMirror(data, pivort.getRight());
			}
		}
	}

	/**
	 * This function prints the preOreder traversal 
	 * @param pNode is the starting point from where you want to print
	 */
	public List<E> preOrder(Node<E> pNode) {
		if (pNode == null)
			return null;
		
		list.add(pNode.getElement());
		preOrder(pNode.getLeft());
		preOrder(pNode.getRight());
		
		return list;
	}
	/**
	 * This function prints the postOreder traversal 
	 * @param pNode is the starting point from where you want to print
	 */
	public List<E> postOrder(Node<E> pNode) {
		if (pNode == null)
			return null;
		postOrder(pNode.getLeft());
		postOrder(pNode.getRight());
		list.add(pNode.getElement());
		
		return list;
	}
	/**
	 * This function check whether the created tree is reversed or not
	 * @param left
	 * @param right
	 * @return
	 */
	boolean mirrorEquals(Node<E> left, Node<E> right) {
		if (left == null || right == null)
			return left == null && right == null;
		return left.getElement().toString().compareTo(right.getElement().toString()) == 0 && mirrorEquals(left.getLeft(), right.getRight()) && mirrorEquals(left.getRight(), right.getLeft());
	}

}
