package Assignment1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestMatrix {

	@Test
	public void test() {
		Matrix matrixs = new Matrix(); 
		int transposeResult[][] = { {1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1} };
		int transposeExpected[][] = matrixs.transpose(transposeResult);
		assertArrayEquals(transposeExpected, transposeResult);

		int multiplicationMatrixA[][] = { {1, 3, 4}, {2, 5, 6} };
		int multiplicationMatrixB[][] = { {1, 5, 6}, {2, 5, 4}, {1, 1, 1} };
		int multiplicationExpected[][] = { {11, 24, 22},{18, 41, 38} };

		int multiplicationResult[][] = matrixs.multiplications(multiplicationMatrixA, multiplicationMatrixB);
		assertArrayEquals(multiplicationExpected, multiplicationResult);
	}
}
