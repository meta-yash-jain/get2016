package assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarytoOctal {


	@Test
	public void test() {
		//conversion is object of class BinaryToOctal
		BinaryToOctal conversion= new BinaryToOctal();
		
		//4 successful test cases 
		assertEquals(15,conversion.convertBinaryToOctal(1101));
		assertEquals(165,conversion.convertBinaryToOctal(1110101));
		assertEquals(65,conversion.convertBinaryToOctal(110101));
		assertEquals(5,conversion.convertBinaryToOctal(101));
		
	}

}
