import java.io.File;
import java.util.Scanner;

public class magicSquares {
	/*
	 * reads a matrix  from file matrixFile
	 * 
	 * PreCondition: matrix has been declared ...contains zeros
	 * 
	 * PostCondition: matrix contains values from file
	 * 
	 */
	
	public static void readMatrix(Scanner matrixFile, int[][] matrix) {
		
		//matrix.length represents number of rows in matrix
		//since each element in matrix is an array each element has
		//the attribute length
		//therefore matrix[row].length represents number of columns on the
		//given row
		
		for (int row = 0; row < matrix.length;row++) {
			for (int col = 0; col < matrix[row].length;col++) {
				matrix[row][col] = matrixFile.nextInt();
			}//for each column
		}//for each row
		
	}//reads matrix
	public static void printMatrix(int[][] matrix) {
		
		for (int row = 0; row < matrix.length;row++) {
			for (int col = 0; col < matrix[row].length;col++) {
				System.out.printf("%d ", matrix[row][col]);
			}//for each column
			System.out.println();
		}//for each row
		
	}//prints matrix
	public static boolean isMagicSquare(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
		return false;
		}
	int testSum = 0;
	
	for (int row = 0; row < matrix.length; row++) {
		testSum += matrix[row][0];
	}
		
		//test other columns
	for (int col = 0; col <= matrix[0].length;col++) {
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			testSum += matrix[row][col];
		}
		
			if(sum != testSum) {
				return false;
			}
	} 
	
	for (int row = 0; row <= matrix[0].length;row++) {
		int sum = 0;
		for (int col = 0; col < matrix.length; col++) {
			testSum += matrix[row][col];
		}
		
			if(sum != testSum) {
				return false;
			}
	} 
			return true;
	}//is magic square
	
	
	
	/*
	 * Algorithm:
	 *     1.)Read number of matrices (m) from file
	 *     2.)For matrixNum = 1 to m
	 *     2a.)	Get dimensions of matrix
	 *     2b.)	matrixArray = Read Matrix
	 *     			Print matrix
	 *     2c.)	if (magicSquare(matrixArray))
	 *     			print Matrix is a magic square
	 *     		else
	 *     			print Matrix is not a magic square
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		Scanner matrixFile = new Scanner(new File("Matrices"));
		
		int numberOfMatrices = matrixFile.nextInt();
		
			for(int matrixNum = 1;matrixNum <= numberOfMatrices;matrixNum++) {
				//get dimensions
				int rows = matrixFile.nextInt();
				int cols = matrixFile.nextInt();
				
				int[][] matrix = new int[rows][cols];
				
				readMatrix(matrixFile, matrix);
				printMatrix(matrix);
				if (isMagicSquare(matrix)) {
					System.out.println("Matrix is a magic square");
				} else {
					System.out.println("Matrix is not a magic square");
				}
				
			}//for each matrix
		
	}//main

}//Magic Squares
