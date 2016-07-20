package Assignment4;

import org.junit.Test;

public class TestQueens {
	@Test
	public void test() {
		int result[][] = NQueensBT.queen(4);
		int expected[][] = { {0,0,1,0}, {1,0,0,0}, {0,0,0,1}, {0,1,0,0} };
		assertArrayEquals(expected,result);
	}
}
