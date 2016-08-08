package DS_Assignment8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestCountingSort {
	@Test
	public void test() {
		CountingSort conversion= new CountingSort();
		assertArrayEquals(new int[] {21,26,28,28,29},conversion.countingSort(new int[] {26,21,29,28,28}));
	}
}
