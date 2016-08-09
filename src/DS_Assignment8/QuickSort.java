package DS_Assignment8;

public class QuickSort {

	int[] quickSort(int array[]) {
		if (array.length == 0)
			return array;
		recursiveQuickSort(array, 0, array.length - 1);
		return array;
	}

	void recursiveQuickSort(int[] array, int start, int end) {
		int index = partition(array, start, end);
		// Recursively call quick sort with left part of the partitioned array
		if (start < index - 1) {
			recursiveQuickSort(array, start, index - 1);
		}
		// Recursively call quick sort with right part of the partitioned array
		if (end > index) {
			recursiveQuickSort(array, index, end);
		}
	}

	int partition(int[] array, int left, int right) {
		int pivot = array[left];
		// taking first element as pivot
		while (left <= right) {
			// searching number which is greater than pivot, bottom up
			while (array[left] < pivot) {
				left++;
			}
			// searching number which is less than pivot, top down
			while (array[right] > pivot) {
				right--;
			}
			// swap the values
			if (left <= right) {
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				// increment left index and decrement right index
				left++;
				right--;
			}
		}
		return left;
	}
}