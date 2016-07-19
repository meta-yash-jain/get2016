/*
 * Assumption: The Exception case is not given in the question so i have not taken the case
 * Condition is numer1 and number 2 should be greater than 0
 */
package Assignment3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestGCD {
	@Test
	public void tests() {
		GCD conversion= new GCD();
		assertEquals(1, conversion.findGCD(2, 1));
		assertEquals(6, conversion.findGCD(12, 18));
		assertEquals(1, conversion.findGCD(100, 3));
	}
}
