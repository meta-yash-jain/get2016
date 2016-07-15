package assignment2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestPattern2 {
	Pattern2 conversion;

	@Before
   public void setUp() throws Exception{	
	 conversion= new Pattern2();
}
	
	//Test cases of spaces
	@Test
	public void testSpace() {
		
		assertEquals("", conversion.spaces(1, 5));
		assertEquals(" ", conversion.spaces(2, 5));
		assertEquals("  ", conversion.spaces(3, 5));
		assertEquals("   ", conversion.spaces(4, 5));
		assertEquals("    ", conversion.spaces(5, 5));
	}

	//Test cases of numbers
	@Test
	public void testNum() {

		assertEquals("12345", conversion.numbers(1, 5));
		assertEquals("1234", conversion.numbers(2, 5));
		assertEquals("123", conversion.numbers(3, 5));
		assertEquals("12", conversion.numbers(4, 5));
		assertEquals("1", conversion.numbers(5, 5));
	}

	//Test cases of whole pattern 	
	@Test
	public void testPrint() {
		
		String[] expected = {"12345", " 1234", "  123", "   12", "    1"};
		assertArrayEquals(expected, conversion.print(5));
	}
}
