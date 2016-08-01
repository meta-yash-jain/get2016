package DS_Assignment2.assignment_1;

import org.junit.Before;
import org.junit.Test;

public class TestOperations {
	Operations operations;
	@Before
	public void setUp() throws Exception {
		operations = new Operations();
	}
	@Test
	public void testInfixToPostFix() {
		assertEquals("AB*CD/+", operations.infixToPostFix("( (A * B) + (C / D) )"));
		assertEquals("ABC+*D/", operations.infixToPostFix("((A * (B + C) ) / D)"));
		assertEquals("ABCD/+*", operations.infixToPostFix("(A * (B + (C / D) ) )"));
		assertEquals("xy/^5z*10+", operations.infixToPostFix("x ^ y / (5 * z) + 10"));
	}
}
