/*
 * This is the java class with a method which prints the input in Spiral Form.
 * For a given two-dimensional integer array/list of size (N x M), we need to print in the order followed for every iteration:
 * a. First row(left to right)
 * b. Last column(top to bottom)
 * c. Last row(right to left)
 * d. First column(bottom to top)
 */


public class SpiralPrint {

	public static void spiralPrint(int matrix[][]){
		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;

		while (true)
		{
			if (left > right) {
				break;
			}

			// print top row
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			if (top > bottom) {
				break;
			}

			// print right column
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			if (left > right) {
				break;
			}

			// print bottom row
			for (int i = right; i >= left; i--) {
				System.out.print(matrix[bottom][i] + " ");
			}
			bottom--;

			if (top > bottom) {
				break;
			}

			// print left column
			for (int i = bottom; i >= top; i--) {
				System.out.print(matrix[i][left] + " ");
			}
			left++;
		}

	}
}
