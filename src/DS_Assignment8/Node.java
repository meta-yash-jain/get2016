package DS_Assignment8;

public class Node<E> {
	private E element;
	private Node<E> left;
	private Node<E> right;
	public E getElement() {
		return element;
	}
	public void setElement(E data) {
		this.element = data;
	}
	public Node<E> getLeft() {
		return left;
	}
	public void setLeft(Node<E> left) {
		this.left = left;
	}
	public Node<E> getRight() {
		return right;
	}
	public void setRight(Node<E> right) {
		this.right = right;
	}
}