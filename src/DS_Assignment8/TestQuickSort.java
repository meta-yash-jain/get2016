package DS_Assignment8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestQuickSort {

	@Test
	public void test() {
		QuickSort quickSort= new QuickSort();
		assertArrayEquals(new int[] {1,6,9},quickSort.quickSort(new int[] {6,1,9}));
	}

}
