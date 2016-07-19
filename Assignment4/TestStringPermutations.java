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

		List<String> testCase2 = new ArrayList<String> (Arrays.asList("acdb", "dcab", "acbd", "bcda", "bdca", "bdac",
				"dbca", "bacd", "cabd", "cdba", "cdab", "badc", "dabc", "cadb","dbac", 
				"bcad", "dacb", "cbad", "cbda", "adcb", "adbc", "abdc", "abcd", "dcba"));
		assertEquals(testCase2, strper.generatePermutations("abcd"));
	}
}
