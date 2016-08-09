package DS_Assignment8;

import java.util.Arrays;

public class CountingSort {
	public int[] countingSort(int[] array) {
		int low = array[0];
		int high = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < low) {
				low = array[i];
			} else if (array[i] > high) {
				high = array[i];
			}
		}
		// this will hold all possible values, from low to high
		int[] counts = new int[high - low + 1];
		for (int x : array)
			counts[x - low]++;
		int current = 0;
		for (int i = 0; i < counts.length; i++) {
			// fills counts[i] elements of value i + low in current
			Arrays.fill(array, current, current + counts[i], i + low);
			// leap forward by counts[i] steps
			current += counts[i];
		}
		return array;
	}
}
