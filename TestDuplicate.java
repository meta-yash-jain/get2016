package assignment1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDuplicate {

	@Test
	public void test() {

		Duplicate conversion= new Duplicate();
		
		//4 successful test cases 
		assertArrayEquals(new int[] {1,2},conversion.removeDuplicate(new int[] {1,2,1}));
		assertArrayEquals(new int[] {2,5,4,6,3,8,9,0},conversion.removeDuplicate(new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0}));
	}

}
