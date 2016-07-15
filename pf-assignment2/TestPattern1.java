package assignment2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestPattern1 {
	Pattern1 conversion;

	@Before
   public void setUp() throws Exception{	
	 conversion= new Pattern1();
}
	
	//Test cases of spaces
	@Test
	public void testSpace() {
		
		assertEquals("    ", conversion.spaces(1, 5));
		assertEquals("   ", conversion.spaces(2, 5));
		assertEquals("  ", conversion.spaces(3, 5));
		assertEquals(" ", conversion.spaces(4, 5));
		assertEquals("", conversion.spaces(5, 5));
		assertEquals(" ", conversion.spaces(6, 5));
		assertEquals("  ", conversion.spaces(7, 5));
		assertEquals("   ", conversion.spaces(8, 5));
		assertEquals("    ", conversion.spaces(9, 5));
	}

	//Test cases of numbers
	@Test
	public void testNum() {

		assertEquals("1", conversion.numbers(1, 5));
		assertEquals("121", conversion.numbers(2, 5));
		assertEquals("12321", conversion.numbers(3, 5));
		assertEquals("1234321", conversion.numbers(4, 5));
		assertEquals("123454321",conversion.numbers(5, 5));
		assertEquals("1234321", conversion.numbers(6, 5));
		assertEquals("12321", conversion.numbers(7, 5));
		assertEquals("121", conversion.numbers(8, 5));
		assertEquals("1", conversion.numbers(9, 5));		
	}

	//Test cases of whole pattern 	
	@Test
	public void testPrint() {
		
		String expected[] = {"    1", "   121", "  12321", " 1234321", "123454321", " 1234321", "  12321", "   121", "    1"};
		assertArrayEquals(expected, conversion.print(5));
	}
}
