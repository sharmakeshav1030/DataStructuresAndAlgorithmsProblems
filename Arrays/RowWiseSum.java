/*
 * This is the java class which add ups the row elements of a 2-D array. Like, for a given two-dimensional integer 
 * array/list of size (N x M), it finds and print out the sum of each of the row elements in a single line.
 */
 
import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		int sum = 0;
		
		for (int i = 0; i < rows; i++) {
			for (int j = cols - 1; j >= 0; j--) {
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
			sum = 0;
		}

		scn.close();
	}
}
