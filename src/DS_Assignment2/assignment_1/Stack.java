package DS_Assignment2.assignment_1;

import DS_Assignment1.assignment_3.SinglyLinkedList;

public class Stack<E> {
	SinglyLinkedList<E> linkedList;
	private int top = 0;
	public Stack(){
		linkedList = new SinglyLinkedList<E>();
	}
	public boolean push(E element){
		linkedList.add(element);
		top++;
		return true;
	}
	public E pop(){
		if(top == 0){
			throw new IndexOutOfBoundsException("Stack underflow");
		}
		E value = linkedList.get(top-1);
		linkedList.remove(top-1);
		top--;
		return value;
	}
	public E getTop(){
		if(top == 0){
			throw new IndexOutOfBoundsException("stack is empty");
		}else{
			return linkedList.get(top-1);
		}
	}
	public E get(int index){
		if(top == 0){
			throw new IndexOutOfBoundsException("stack is empty");
		}
		return linkedList.get(index);
	}
	public void print(){
		linkedList.print();
	}
	public boolean isEmpty(){
		if(top == 0){
			return true;
		}
		return false;
	}
	public int getSize(){
		return top;
	}
}