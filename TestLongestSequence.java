package assignment1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestLongestSequence {

	@Test
	public void test() {
		
		LongestSequence conversion= new LongestSequence();
		
		assertArrayEquals(new int[] {1,2,4,5,6,7,8,9},conversion.longestSequence(new int[] {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9}));
	}
}
