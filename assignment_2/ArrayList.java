package DS_Assignment2.assignment_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class ArrayList<E> {
	private int size;
	private Object[] array;
	/** 
	 * @param initialCapacity
	 * Constructor to initialize the array mergedList based on capacity given by user
	 */
	public ArrayList(int initialCapacity){
		if(initialCapacity < 0){
			throw new IllegalArgumentException("Illegal Capacity: "+initialCapacity);
		}
		this.array = new Object[initialCapacity];
	}
	/**
	 * Constructor to initialize array mergedList of size 10 
	 */
	public ArrayList(){
		this.array = new Object[10];
	}
	/**
	 * @param e
	 * @return true if element is added
	 * 
	 * this method adds an element e(value) to mergedList 
	 */
	public boolean add(E e){
		ensureCapacity(size+1);
		array[size++] = e;
		return true;
	}
	/**
	 * @param index
	 * @param e
	 * @return true if element is added 
	 * 
	 * this method adds the element e to a particular index 
	 */
	public boolean add(int index, E e){
		// check for range if it is greater than -1 and less than size
		checkForRange(index);
		for(int i = index; i < size; ++i){
			// to ensure the size of mergedList
			ensureCapacity(size+1);
			array[i+1] = array[i];
		}
		array[index] = e;
		size++;
		return true;
	}
	/**
	 * @param location
	 * @return true if the element is removed
	 * this method removes element at a particular position
 	 */
	public boolean remove(int location){
		checkForRange(location);
		for(int i = location+1; i < size; ++i){
			array[i-1] = array[i];
		}
		size--;
		return true;
	}
	/**
	 * @param e
	 * @return true if element is removed
	 * this method removes element given by user
	 */
	public boolean remove(E e){
		int tempIndex = 0;
		for(int i=0; i < size; ++i){
			if(array[i] == e){
				tempIndex = i;
				break;
			}
		}
		// remove and shift all elements of array
		for(int i = tempIndex+1; i < size; ++i){
			array[i-1] = array[i];
			size--;
		}
		return true;
	}
	/**
	 * @param e
	 * @return the index of value given by user else throw no such element exception
	 */
	public int getIndex(E e){
		int tempIndex = 0, flag = 2;
		// check if element is present in array and store its index
		for(int i=0; i < size; ++i){
			if(array[i] == e){
				tempIndex = i;
				flag = 1;
				break;
			}
		}
		if(flag == 2){
			throw new NoSuchElementException();
		}
		// return index
		return tempIndex;
	}
	/**
	 * @param location
	 * @return element at a particular index
	 */
	@SuppressWarnings("unchecked")
	public E getElement(int location){
		// check if index is in range else throw IndexOutOfBounds exception
		if(location > size-1 || location < 0){
			throw new IndexOutOfBoundsException("location: "+location+","+"size: "+size);
		}
		return (E)array[location];
	}
	public boolean overwriteElement(int location,E newValue){
		if(location > size - 1 || location < 0){
			throw new IndexOutOfBoundsException("location: "+location+","+"size: "+size);
		}
		array[location] = newValue;
		return true;
	}
	/**
	 * @param minCapacity
	 * this method checks if the capacity is less and grows the capacity of array
	 */
	public void ensureCapacity(int minCapacity){
		try{
			// if capacity is less then grow the capacity 
			if(minCapacity - array.length > 0){
				growCapacity(minCapacity);
			}
		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	/**
	 * @return size of array
	 */
	public int getSize(){
		return size;
	}
	/**
	 * @param minCapacity
	 * this method increases the capacity of array by making a new array with increased capacity
	 * and transferring the old array into new one
	 */
	public void growCapacity(int minCapacity){
		try{
			int oldCapacity = array.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			array = Arrays.copyOf(array, newCapacity);
		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	/**
	 * @param index
	 * This method checks the range of index
	 */
	public void checkForRange(int index){
		if(index > size && index < 0){
			throw new ArrayIndexOutOfBoundsException("index: "+index+"size: "+size);
		}
	}
	/**
	 * this method reverses the array mergedList 
	 */
	public void reverseList(){
		int index = 0;
		Object[] reverseArray = new Object[size];
		for(int i = size-1; i >=0; --i ){
			reverseArray[index++] = array[i];
		}
		array = reverseArray;
	}
	/**
	 * this method sorts the array
	 */
	public void sort(){
		// temporary array to store the original values
		Object[] tempArray = new Object[size];
		// comparator object to compare the elements 
		Comparator<E> c = new Comparator<E>() {
			// override compare method to compare two objects
			@Override
			public int compare(E arg0, E arg1) {
				int compareValue = arg0.toString().compareTo(arg1.toString());
				return compareValue;
			}
		};
		// called merge sort to sort the array
		mergeSort(0 , size - 1, tempArray, c);
	}
	/**
	 * @param low
	 * @param high
	 * @param sortedArray
	 * @param c
	 * 
	 * merge sort algorithm is implemented here 
	 * the whole array is divided here into two parts from 0 to mid and mid+1 to size 
	 * each array is sorted recursively each time and merged to create a complete sorted array
	 */
	public void mergeSort(int low , int high , Object[] sortedArray , Comparator<E> c){
		if(low < high){
			int mid = low + (high - low) / 2;
			mergeSort(low , mid , sortedArray , c);
			mergeSort(mid+1 , high , sortedArray , c);
			merge(low , mid , high , sortedArray , c);
		}
	}
	/**
	 * @param low
	 * @param mid
	 * @param high
	 * @param sortedArray
	 * @param c
	 * 
	 * this method compares the elements of two arrays and add the element which is smaller in 
	 * original array which makes original array sorted
	 */
	@SuppressWarnings("unchecked")
	public void merge(int low , int mid , int high , Object[] sortedArray , Comparator<E> c){
		for (int i = low; i <= high; i++) {
			sortedArray[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (c.compare((E)sortedArray[j], (E)sortedArray[i]) > 0 ) {
				array[k] = sortedArray[i];
				i++;
			} else {
				array[k] = sortedArray[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			array[k] = sortedArray[i];
			k++;
			i++;
		}
	}
	/**
	 * @return true 
	 * clears the complete array mergedList by resetting the size to zero
	 */
	public boolean clearList(){
		size = 0;
		return true;
	}
}