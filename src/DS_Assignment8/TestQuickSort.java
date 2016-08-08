package DS_Assignment8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestQuickSort {
	@Test
	public void test() {
		QuickSort conversion= new QuickSort();
		assertArrayEquals(new int[] {1,6,9},conversion.quickSort(new int[] {6,1,9}));
	}
}
