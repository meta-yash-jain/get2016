package Assignment1;

import java.util.Scanner;

public class Matrix {
	private static Scanner s;
	int [][] matrix;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		Matrix matrixs = new Matrix(); 
		System.out.println("Enter number of rows and columns");
		int i, j, value;
		int row = s.nextInt();
		int column = s.nextInt();
		System.out.println("Enter matrix:");
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				value = s.nextInt();
				matrixs.addElements(row, column, value);
			}
		}
	}
	public boolean addElements(int row, int column, int value) {
		boolean flag = false;
		if(row < matrix.length || column < matrix[row].length ) {
			flag = false;
		} else {
			matrix[row][column] = value;
			flag=true;
		}
		return flag;		
	}
	public int[][] transpose(int matrix[][])
	{
		int i,j;
		int row = matrix.length;
		int column = matrix[0].length;
		for(i = 0; i < column; i++)	{
			for(j = 0; j < row; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println(" ");
		}
		return matrix;
	}
	public int[][] show()
	{
		return matrix;
	}
	public int[][] multiplications(int matrixA[][], int matrixB[][])
	{
		int i, j, k;
		int rowsInA = matrixA.length;
		int columnsInA = matrixA[0].length;
		int rowsInB = matrixB.length;
		int columnsInB = matrixB[0].length;
		if(columnsInA != rowsInB) {
			return null;
		} else {
			int[][] result = new int[rowsInA][columnsInB];
			for(i = 0; i < rowsInA; i++) {
				for(j = 0; j < columnsInB; j++) {
					for(k = 0; k < columnsInA; k++) {
						result[i][j] = result[i][j] + matrixA[i][k] * matrixB[k][j];
					}
				}
			}
			return result;
		}
	}
}
