package Assignment3;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestQuickSort {
	@Test
	public void test() {
		QuickSort conversion= new QuickSort();
		assertArrayEquals(new int[] {2, 5, 8, 9, 10, 11, 55, 77}, conversion.quickSort(new int[] {2, 5, 8, 9, 10, 77, 55, 11}));
		//If array is empty
		assertArrayEquals(new int[] {}, conversion.quickSort(new int[] {}));
	}
}
