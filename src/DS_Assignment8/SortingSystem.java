package DS_Assignment8;

public class SortingSystem {
	public int[] sorting(int array[], int choice) {
		int forRadix = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				throw new IllegalArgumentException();
			}
			if (array[i] > 99 || array[i] < -99) {
				forRadix++;
			}
		}
		if (choice == 1) {
			if (array.length <= 10) {
				BubbleSort bubbleSort = new BubbleSort();
				return bubbleSort.bubbleSort(array);
			} else {
				QuickSort quickSort = new QuickSort();
				return quickSort.quickSort(array);
			}
		} else {
			if (forRadix != 0) {
				RadixSort radixSort = new RadixSort();
				return radixSort.radixSort(array);
			} else {
				CountingSort countingSort = new CountingSort();
				return countingSort.countingSort(array);
			}
		}
	}
}
