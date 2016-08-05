package DS_Assignment5;

import java.util.LinkedList;

public class QueueOperations<E> {
	LinkedList<E> linkedList = new LinkedList<E>();
	public void enqueue(E data) {
		linkedList.addLast(data);
	}
	public E deQueue() {
		return linkedList.remove();
	}
	public E getFront() {
		return linkedList.getFirst();
	}
	public void removeAll() {
		linkedList.clear();
	}
	public int getSize() {
		return linkedList.size();
	}
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
}
