/*
 * Assumption: The Exception case is not given in the question so i have not taken the case
 */
package Assignment3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBinarySearch {
	@Test
	public void tests() {
		BinarySearch conversion= new BinarySearch();
		assertEquals(-1, conversion.binarySearch(new int[] {2, 5, 8, 9, 10, 55, 77}, 88));
		assertEquals(7, conversion.binarySearch(new int[] {2, 5, 8, 9, 10, 55, 77}, 77));
		//If array is empty
		assertEquals(-1, conversion.binarySearch(new int[] {}, 88));
	}
}
