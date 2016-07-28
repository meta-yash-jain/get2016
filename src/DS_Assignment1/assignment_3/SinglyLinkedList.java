package DS_Assignment1.assignment_3;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
	Node<E> startNode;
	int size = 0;
	public SinglyLinkedList(){
	}
	public boolean add(int location, E item){
		Node<E> newNode = new Node<E>(item) ; 
		Node<E> tempNode;
		int tempPosition = 0;
		location = location - 1;
		if(startNode == null){
			startNode = newNode;
			newNode.nextNode = null;
			size++;
		}else{
			if(location > size){
				throw new IllegalArgumentException("Location is greater than size : " + "location: " + location + "," + "Size: " + size);
			}else{
				 tempNode = startNode;
				while(tempPosition != location){
					tempNode = tempNode.nextNode;
					tempPosition++;
				}
			}
			newNode.nextNode = tempNode.nextNode;
			tempNode.nextNode = newNode;
			size++;
		}
		return true;	
	}
	public boolean remove(E value){
		if(startNode == null){
			throw new NoSuchElementException();
		}else{
			Node<E> tempPrevNode = startNode;
			Node<E> tempCurrentNode = startNode;
			while( ! (tempCurrentNode.nodeValue.equals(value))){
				tempPrevNode = tempCurrentNode;
				tempCurrentNode = tempCurrentNode.nextNode;
			}
			tempPrevNode = tempCurrentNode.nextNode;
			tempCurrentNode = null;
		}
		return true;
	}
	public boolean remove(int index){
		if(startNode == null){
			throw new NoSuchElementException();
		}else{
			index = index - 1;
			int position = 0;
			Node<E> tempPrevNode = startNode;
			Node<E> tempNextNode = startNode;
			while(position != index){
				tempPrevNode = tempPrevNode.nextNode;
				tempNextNode = tempNextNode.nextNode;
				position++;
			}
			tempPrevNode = tempNextNode.nextNode;
			tempNextNode = null;
		}
		return true;
	}
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
}