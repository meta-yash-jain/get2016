package DS_Assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	@SuppressWarnings("unchecked")
	public int[] radixSort(int[] array) {
		boolean flag = true;
		int divisor = 1;
		Queue<Integer>[] buckets = new Queue[10];
		for (int i = 0; i < 10; i++)
			buckets[i] = new LinkedList<Integer>();

		while (flag) {
			flag = false;
			// first copy the values into buckets
			for (int i = 0; i < array.length; i++) {
				int hashIndex = (array[i] / divisor) % 10;
				if (hashIndex > 0)
					flag = true;
				((LinkedList<Integer>) buckets[hashIndex]).addLast(new Integer(array[i]));
			}
			// then copy the values back into vector
			divisor *= 10;
			int i = 0;
			for (int j = 0; j < 10; j++) {
				while (!buckets[j].isEmpty()) {
					Integer value = (Integer) ((LinkedList<Integer>) buckets[j]).getFirst();
					((LinkedList<Integer>) buckets[j]).removeFirst();
					array[i++] = value.intValue();
				}
			}
		}
		return array;
	}
}
