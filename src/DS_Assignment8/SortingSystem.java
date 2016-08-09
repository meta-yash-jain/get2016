package DS_Assignment8;

public class SortingSystem {
	int getSortName;
	public int[] sorting(int array[], int choice) {
		int forRadix = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				throw new IllegalArgumentException();
			}
			if (array[i] > 99) {
				forRadix++;
			}
		}
		if (choice == 1) {
			if (array.length <= 10) {
				getSortName = 1;
				BubbleSort bubbleSort = new BubbleSort();
				return bubbleSort.bubbleSort(array);
			} else {
				getSortName = 2;
				QuickSort quickSort = new QuickSort();
				return quickSort.quickSort(array);
			}
		} else {
			if (forRadix != 0) {
				getSortName = 3;
				RadixSort radixSort = new RadixSort();
				return radixSort.radixSort(array);
			} else {
				getSortName = 4;
				CountingSort countingSort = new CountingSort();
				return countingSort.countingSort(array);
			}
		}
	}
	
	public String getSortName(){
		if(getSortName == 1){
			return "Bubble Sort";
		}
		if(getSortName == 2){
			return "Quick Sort";
		}
		if(getSortName == 3){
			return "Radix Sort";
		}else {
			return "Counting Sort";
		}
	}
}