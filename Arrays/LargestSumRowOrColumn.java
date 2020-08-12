/*
 * This is the java class with a method which finds out whether row or column has maximum sum.
 */
 
public class LargestSumRowOrColumn {

	
	public static void findLargest(int input[][]){
		
        int rows = input.length;
        int cols = input[0].length;
        
		int largestRowSum = Integer.MIN_VALUE;
		int maxRow = 0;
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += input[i][j];
			}
			if (sum > largestRowSum) {
				largestRowSum = sum;
				maxRow = i;
			}
		}

		int largestColSum = Integer.MIN_VALUE;
		int maxCol = 0;
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum += input[j][i];
			}
			if (sum > largestColSum) {
				largestColSum = sum;
				maxCol = i;
			}
		}

		if (largestRowSum >= largestColSum) {
			System.out.println("row " + maxRow + " " + largestRowSum);
		} else {
			System.out.println("column " +  maxCol + " " + largestColSum);
		}
	}
}
