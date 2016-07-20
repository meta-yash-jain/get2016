package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TestStringPermutations {
	@Test
	public void test() {
		StringPermutations strper = new StringPermutations();
		List<String> testCase1 = new ArrayList<String> (Arrays.asList("ABC", "ACB", "BAC", "BCA", "CBA", "CAB"));
		assertEquals(testCase1, strper.generatePermutations("ABC"));

		List<String> testCase2 = new ArrayList<String> (Arrays.asList("abcd", "abdc", "acbd", "acdb", "bacd", "badc", "bcad", "bcda",
				"bdca", "bdac", "cbda", "cbad", "cdba", "cdab", "cadb", "cabd", "dcab", "dcba", "dacb", 
				"dabc", "dbac", "dbca", "adbc","adcb"));
		assertEquals(testCase2, strper.generatePermutations("abcd"));
	}
}
