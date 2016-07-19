/*
 * The logic is take the pivot element in my case i have taken first element
 * Then break the array in 2 parts in which the left side contains the less element then the pivot element
 * and right side contains the larger elements than the pivot element and so on..
 * Condition is that the array will sort in the ascending order  
 */
package Assignment3;

public class QuickSort {
	//Function to return resultant array
	 int[] quickSort(int array[]) { 
		 if(array.length == 0)
			 return array;
		 recursiveQuickSort(array, 0, array.length - 1);
		 return array;
		}
	 //Function for the sorting
	 void recursiveQuickSort(int[] array, int start, int end) {
		int idx = partition(array, start, end); 
		// Recursively call quicksort with left part of the partitioned array 
		if (start < idx - 1) {
			recursiveQuickSort(array, start, idx - 1); 
			} 
		// Recursively call quick sort with right part of the partitioned array 
		if (end > idx) { 
			recursiveQuickSort(array, idx, end); 
			}
		}
	 //Function for the partition	
	int partition(int[] array, int left, int right) {
		int pivot = array[left]; 
		// taking first element as pivot 
		while (left <= right) { 
			//searching number which is greater than pivot, bottom up 
			while (array[left] < pivot) { 
				left++; 
				} //searching number which is less than pivot, top down
			while (array[right] > pivot) {
				right--; 
				} // swap the values 
			if (left <= right) { 
				int tmp = array[left];
				array[left] = array[right]; 
				array[right] = tmp; 
				//increment left index and decrement right index 
				left++;
				right--; 
				} 
			} 
		return left; 
		} 
	} 
