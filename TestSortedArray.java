package assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSortedArray {


	@Test
	public void testAsec() {

		SortedOrder conversion= new SortedOrder();
		
		//Test case for increasing order
		assertEquals(1,conversion.checksort(new int[] {1,2}));

		//Test case for decreasing order
		assertEquals(2,conversion.checksort(new int[] {5,2,1}));

		//Test case for not in any order
		assertEquals(0,conversion.checksort(new int[] {1,2,1}));
	}

}
