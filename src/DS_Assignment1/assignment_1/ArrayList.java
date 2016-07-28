package DS_Assignment1.assignment_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class ArrayList<E> {
	private int size;
	private Object[] array;

	public ArrayList(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);
		}
		this.array = new Object[initialCapacity];
	}

	public ArrayList() {
		this.array = new Object[10];
	}

	public boolean add(E e) {
		ensureCapacity(size + 1);
		array[size++] = e;
		return true;
	}

	public boolean add(int index, E e) {
		checkForRange(index);
		for(int i = index; i < size; ++i) {
			ensureCapacity(size + 1);
			array[i + 1] = array[i];
		}
		array[index] = e;
		size++;
		return true;
	}
	public boolean remove(int location) {
		checkForRange(location);
		for(int i = location + 1; i < size; ++i) {
			array[i - 1] = array[i];
		}
		size--;
		return true;
	}
	public boolean remove(E e) {
		int tempIndex = 0;
		for(int i = 0; i < size; ++i) {
			if(array[i] == e) {
				tempIndex = i;
				break;
			}
		}
		for(int i = tempIndex + 1; i < size; ++i) {
			array[i - 1] = array[i];
			size--;
		}
		return true;
	}
	public int getIndex(E e) {
		int tempIndex = 0, flag = 2;
		for(int i = 0; i < size; ++i) {
			if(array[i] == e) {
				tempIndex = i;
				flag = 1;
				break;
			}
		}
		if(flag == 2) {
			throw new NoSuchElementException();
		}
		return tempIndex;
	}
	@SuppressWarnings("unchecked")
	public E getElement(int location) {
		if(location > size - 1 || location < 0) {
			throw new ArrayIndexOutOfBoundsException("location: " + location + "," + "size: " + size);
		}
		return (E) array[location];
	}
	public void ensureCapacity(int minCapacity) {
		try{
			if(minCapacity - array.length > 0) {
				growCapacity(minCapacity);
			}
		} catch(Exception ex) {
			System.out.println("Something went wrong: " + ex.getMessage());
		}
	}
	public int size() {
		return size;
	}
	public void growCapacity(int minCapacity) {
		try{
			int oldCapacity = array.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			array = Arrays.copyOf(array, newCapacity);
		} catch (Exception ex) {
			System.out.println("Something went wrong: " + ex.getMessage());
		}
	}
	public void checkForRange(int index) {
		if(index > size && index < 0) {
			throw new ArrayIndexOutOfBoundsException("index: " + index + "size: " + size);
		}
	}
	public void reverseList() {
		int index = 0;
		Object[] reverseArray = new Object[size];
		for(int i = size - 1; i >= 0; --i) {
			reverseArray[index++] = array[i];
		}
		array = reverseArray;
	}
	public void sort() {
		Object[] sortedArray = new Object[size];
		Comparator c = null;
		mergeSort(0, size - 1, sortedArray, c);
	}
	public void mergeSort(int low, int high, Object[] sortedArray, Comparator c) {
		if(low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(low, mid, sortedArray, c);
			mergeSort(mid + 1, high, sortedArray, c);
			merge(low, mid, high, sortedArray, c);
		}
	}
	public void merge(int low, int mid, int high, Object[] sortedArray, Comparator c) {
		for(int i = low; i <= high; i++) {
			sortedArray[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while(i <= mid && j <= high) {
			if(c.compare(sortedArray[j], sortedArray[i]) > 0) {
				array[k] = sortedArray[i];
				i++;
			} else {
				array[k] = sortedArray[j];
				j++;
			}
			k++;
		}
		while(i <= mid) {
			array[k] = sortedArray[i];
			k++;
			i++;
		}
	}
	public boolean clearList() {
		size = 0;
		return true;
	}
}