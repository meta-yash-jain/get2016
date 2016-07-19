/*
 * Assumption: The Exception case is not given in the question so i have not taken the case
 */
package Assignment3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLinearSearch {
	@Test
	public void tests() {
		LinearSearch conversion= new LinearSearch();
		assertEquals(-1, conversion.linearSearch(new int[] {2, 5, 8, 9, 10, 77, 55}, 0, 88));
		assertEquals(6, conversion.linearSearch(new int[] {2, 5, 8, 9, 10, 77, 55, 11}, 0, 77));
		//If array has no element than return -1
		assertEquals(-1, conversion.linearSearch(new int[] {}, 0, 1));
	}
}
