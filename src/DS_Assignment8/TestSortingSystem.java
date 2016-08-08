package DS_Assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortingSystem {
	@Test
	public void test() {
		SortingSystem sort= new SortingSystem();
		assertArrayEquals(new int[] {1,6,9},sort.sorting(new int[] {6,1,9}, 1 ));
	}
}
