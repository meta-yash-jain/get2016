package DS_Assignment8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestRadixSort {
	@Test
	public void test() {
		RadixSort conversion= new RadixSort();
		assertArrayEquals(new int[] {1,21,26,28,28,29},conversion.radixSort(new int[] {26,21,29,1,28,28}));
	}
}
