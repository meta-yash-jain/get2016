package DS_Assignment5;

import java.util.LinkedList;

public class Queue<E> {
	private LinkedList<E> list = new LinkedList<E>();
	/**
	 * Enter the Element into the queue
	 * @param value will insert to queue
	 */
	public void enqueue(E value){
		list.addLast(value);
	}
	/**
	 * Remove the element from the front
	 * @return
	 */
	public E dequeue(){
		return list.removeFirst();
	}
	/**
	 * @return queue is empty or not
	 */
	public boolean isEmpty(){
		return list.isEmpty();
	}
	/**
	 * Checks the value is contain in the queue or not
	 * @param value
	 * @return true if value is contain else false
	 */
	public boolean contains(E value){
		return list.contains(value);
	}
	/**
	 * @return the size of the queue
	 */
	public int size(){
		return list.size();
	}
	/** 
	 * @return the element from the front
	 */
	public E getFront(){
		return list.getFirst();
	}
}