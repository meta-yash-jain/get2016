package Assignment3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRemainder {
	//Negative Test Cases
	@Test(expected = IllegalArgumentException.class)
	public void test() {
		Remainder conversion = new Remainder();
		assertEquals(1, conversion.remainder(2, 0));//when denominator is zero
	}
	//Positive Test Cases
	@Test
	public void tests() {
		Remainder conversion = new Remainder();
		assertEquals(1, conversion.remainder(2, 1));
		assertEquals(97, conversion.remainder(100, 3));
	}
}
