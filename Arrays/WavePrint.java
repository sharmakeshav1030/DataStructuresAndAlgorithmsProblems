/*
 * This is the java class with a method which prints the input in Wave Form (Sine-Wave).
 * For a given two-dimensional integer array/list of size (N x M), we need to print the array/list in a sine wave order,
 * i.e, print the first column top to bottom, next column bottom to top and so on.
 */
 
 
public class WavePrint {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
        int rows = input.length;
        int cols = input[0].length;
        
		for (int j = 0; j < cols; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < rows; i++) {
					System.out.print(input[i][j] + " ");
				}
			} else {
				for (int i = rows - 1; i >= 0; i--) {
					System.out.print(input[i][j] + " ");
				}
			}
		}

	}

	
}
