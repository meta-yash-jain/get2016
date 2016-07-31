package DS_Assignment1.assignment_3;

import java.util.NoSuchElementException;
public class SinglyLinkedList<E> {
	Node<E> startNode;
	int size = 0;	
	/**
	 * @param location
	 * @param item
	 * @return true if the element is added
	 * this method adds element at a particular index 
	 */
	public boolean add(int location, E item){
		Node<E> newNode = new Node<E>(item) ; 
		int tempPosition = 0;
		if(startNode == null){
			startNode = newNode;
			newNode.nextNode = null;
			size++;
		}else{ 
			if(location-1 > size){
				throw new IllegalArgumentException("Location is greater than size : " + "location: " + location + "," + "Size: " + size);
			}else{
				Node<E> tempNode = startNode;
				while(tempPosition != location-1){
					tempNode = tempNode.nextNode;
					tempPosition++;
				}
				newNode.nextNode = tempNode.nextNode;			
				tempNode.nextNode = newNode;		
				size++;
			}
		}
		return true;	
	}	
	/**
	 * @param value
	 * @return true if the element is removed
	 * this method removes the node of a particular value
	 */
	public boolean remove(E value){
		if(startNode == null){
			throw new NoSuchElementException();
		}else{
			Node<E> tempPrevNode = startNode;
			Node<E> tempCurrentNode = startNode;
			while( !(tempCurrentNode.nodeValue.equals(value))){
				tempPrevNode = tempCurrentNode;
				tempCurrentNode = tempCurrentNode.nextNode;
			}
			tempPrevNode = tempCurrentNode.nextNode;
			tempCurrentNode = null;
		}
		return true;
	}
	/**
	 * @param index
	 * @return true if element is removed
	 * remove the element at a particular index
	 */
	public boolean remove(int index){
		if(startNode == null){
			throw new NoSuchElementException();
		}else{
			int position = 0;
			Node<E> tempPrevNode = startNode;
			Node<E> tempNextNode = startNode;
			while(position != index-1){
				tempPrevNode = tempPrevNode.nextNode;
				tempNextNode = tempNextNode.nextNode;
				position++;
			}
			tempPrevNode = tempNextNode.nextNode;
			tempNextNode = null;
		}
		return true;
	}
	/**
	 * this method reverses the whole linked list
	 */
	public void reverse(){
		Node<E> prevNode = null;
		Node<E> currentNode = startNode;
		while(currentNode != null){
			Node<E> tempNode = currentNode;
			currentNode = currentNode.nextNode;
			tempNode.nextNode = prevNode;
			prevNode = tempNode;
		}
		startNode = prevNode;
	}
	/** 
	 * @param index
	 * @return the element at a particular index
	 */
	public E get(int index){
		if(startNode == null){
			throw new NoSuchElementException();
		}
		Node<E> tempNode = startNode;
		int position = 0;
		while(position != index){
			tempNode = tempNode.nextNode;
			position++;
		}
		return tempNode.nodeValue;
	}
	/**
	 * print the whole linked list
	 */
	public void print(){
		Node<E> tempNode = startNode;
		while(tempNode != null){
			System.out.println(tempNode);
			tempNode = tempNode.nextNode;
		}
	}
}