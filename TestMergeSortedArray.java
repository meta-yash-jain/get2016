package assignment1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMergeSortedArray {

	//array 1
	int a[] = {1,2,3};

	//array 2
	int b[] = {4,5,6};
	
	@Test
	public void test() {
		MergeSortedArray conversion= new MergeSortedArray();
		
		//check for true
		assertTrue(conversion.merging(a,b));
	}

}
