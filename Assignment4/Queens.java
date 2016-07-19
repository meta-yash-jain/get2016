/*
 * The logic is place the Queen of chess in such a way that they don't attack each other
 * the number of Queen will be equal to the row or column of the matrix
 */
package Assignment4;

public class Queens {
	//global array
	public static int[][] solution;
	public static boolean placeQueens(int queen, int n) {
		// will place the Queens one at a time, for column wise
		if(queen == n) {
			//if we are here that means we have solved the problem
			return true;
		}
		for(int row = 0; row < n; row++) {
			// check if queen can be placed row,column
			if(canPlace(solution, row, queen)) {
				// place the queen
				solution[row][queen] = 1;
				// solve  for next queen
				if(placeQueens(queen + 1, n)) {
					return true;
				}
				//if we are here that means above placement didn't work
				//BACKTRACK
				solution[row][queen] = 0;
			}
		}
		//if we are here that means we haven't found solution
		return false;
	}
	// check if queen can be placed at matrix[row][column]
	public static boolean canPlace(int[][] matrix, int row, int column) {
		// since we are filling one column at a time,
		// we will check if no queen is placed in that particular row
		for (int i = 0; i < column; i++) {
			if (matrix[row][i] == 1) {
				return false;
			}
		}
		// we are filling one column at a time,so we need to check the upper and
		// diagonal as well
		// check upper diagonal
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (matrix[i][j] == 1) {
				return false;
			}
		}
		// check lower diagonal
		for(int i = row, j = column; i < matrix.length && j >= 0; i++, j--) {
			if (matrix[i][j] == 1) {
				return false;
			}
		}
		// if we are here that means we are safe to place Queen at row,column
		return true;
	}
	public static int[][] queen(int n) {
		solution = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				solution[i][j] = 0;
			}
		}
		placeQueens(0,n);
		return solution;
	}
}