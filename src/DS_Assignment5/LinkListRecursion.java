package DS_Assignment5;

import java.util.LinkedList;

public class LinkListRecursion<E> {
	private LinkedList<E> link = new LinkedList<E>();
	/**
	 * This function add the element in sorted order
	 * @param index where to insert data
	 * @param value is element to be inserted
	 */
	private void add(int index, E value){
		if(index >= link.size()){
			link.add(value);
		}else{
			if(link.get(index).toString().compareTo(value.toString()) > 0){
				link.add(index, value);
			}else{
				add(++index, value);
			}
		}
	}
	/**
	 * This is function which calls add(index,value) function
	 * @param value is element to be inserted
	 */
	public void add(E value){
		if(link.size() == 0){
			link.add(value);
		}else{
			add(0, value);
		}
	}
	
	/**
	 * This function will print all elements in list
	 */
	public void printList(){
		for (E e : link) {
			System.out.println(e);
		}
	}
}