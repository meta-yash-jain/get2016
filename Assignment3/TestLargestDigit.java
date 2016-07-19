package Assignment3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLargestDigit {
	@Test
	public void test() {
		LargestDigit conversion= new LargestDigit();
		assertEquals(4, conversion.findLargeDigit(444));
		assertEquals(9, conversion.findLargeDigit(1257369));
		assertEquals(2, conversion.findLargeDigit(2));
		//If number is 0
		assertEquals(0, conversion.findLargeDigit(0));
	}
}
