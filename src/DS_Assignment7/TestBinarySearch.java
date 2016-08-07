package DS_Assignment7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBinarySearch {
	@Test
	public void tests() {
		BinarySearch conversion= new BinarySearch();
		assertEquals(1,conversion.binarySearch(new int[] {1,1,1,2,2,2,2,3,4,4},1));
		assertEquals(-1,conversion.binarySearch(new int[] {},3));
	}
}
