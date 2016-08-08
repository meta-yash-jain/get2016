package DS_Assignment8;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestBubbleSort {
	@Test
	public void test() {
		BubbleSort conversion= new BubbleSort();
		assertArrayEquals(new int[] {1,6,8,8,9}, conversion.bubbleSort(new int[] {6,1,9,8,8}));
	}
}
