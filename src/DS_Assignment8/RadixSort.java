package DS_Assignment8;

public class RadixSort {
	public int[] radixSort(int[] array) {
		System.out.println("radix sort is running");
		int i, max = array[0], divide = 1, size = array.length;
		int[] radix = new int[10];
		for (i = 1; i < size; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		while (max / divide > 0) {
			int[] bucket = new int[10];

			for (i = 0; i < size; i++)
				bucket[(array[i] / divide) % 10]++;
			for (i = 1; i < 10; i++)
				bucket[i] += bucket[i - 1];
			for (i = size - 1; i >= 0; i--)
				radix[--bucket[(array[i] / divide) % 10]] = array[i];
			for (i = 0; i < size; i++)
				array[i] = radix[i];
			divide *= 10;
		}
		return array;
	}
}
