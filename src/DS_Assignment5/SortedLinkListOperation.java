package DS_Assignment5;

import java.util.LinkedList;

public class SortedLinkListOperation {
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	/**
	 * @param data
	 * To insert an element in linklist
	 */
	public void addElement(int data) {
		if (linkedList.isEmpty()) {
			linkedList.add(data);
		} else {
			addAtIndex(data, 0);
		}
	}
	/*
	 * to add an element at index, recursive call
	 */
	private void addAtIndex(int data, int index) {
		// no more elements
		if (index == linkedList.size()) {
			linkedList.add(data);
			return;
		}
		// Compare data to index element
		if (linkedList.get(index) > data) {
			linkedList.add(index, data);
			return;
		} else {
			index++;
			addAtIndex(data, index);
		}
	}
	/**
	 * @return
	 * getter for linklist
	 */
	public LinkedList<Integer> getLinkedList() {
		return linkedList;
	}
}