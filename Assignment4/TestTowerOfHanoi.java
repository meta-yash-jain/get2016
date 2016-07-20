package Assignment4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TestTowerOfHanoi {
	@Test
	public void test() {
		TowerOfHanoi toh = new TowerOfHanoi();
		List<String> testCase1 = new ArrayList<String>(Arrays.asList(
				"Move Disk 1 from A to C", "Move Disk 2 from A to B",
				"Move Disk 1 from C to B", "Move Disk 3 from A to C",
				"Move Disk 1 from B to A", "Move Disk 2 from B to C",
				"Move Disk 1 from A to C"));
		assertEquals(testCase1, toh.tower(3,"A", "B", "C"));

		List<String> testCase2 = new ArrayList<String>(Arrays.asList(
				"Move Disk 1 from A to B", "Move Disk 2 from A to C",
				"Move Disk 1 from B to C"));
		assertEquals(testCase2, toh.tower(2,"A", "B", "C"));

		List<String> testCase3 = new ArrayList<String>(Arrays.asList(
				"Move Disk 1 from A to C"));
		assertEquals(testCase3, toh.tower(1,"A", "B", "C"));
	}
}