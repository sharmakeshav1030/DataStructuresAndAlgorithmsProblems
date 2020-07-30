/*
* This is the java class deals with arranging elemnts in a specific way. 
* It takes an input of N any number and that size of array is made. The 
* array gets populated using the integer values in the range 1 to N(both inclusive) 
* in the order - 1,3,.......4,2.
*/

public class Arranging {

	public static int[] arrange(int n) {

		int arranged[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (n % 2 == 0) {
				if (i < n / 2) {
					arranged[i] = 2 * i + 1;
				}
			} else {
				if (i <= n / 2) {
					arranged[i] = 2 * i + 1;
				}
			}
		}

		int p = n;
		for (int i = n - 1; i > 0; i--) {
			if (n % 2 == 0) {
				if (i >= n / 2) {
					arranged[i] = n - p + 2;
					p = p - 2;
				}
			} else {
				if (i > n / 2) {
					arranged[i] = n - p + 2;
					p = p - 2;
				}
			}
		}

		return arranged;
	}

	public static void main(String[] args) {
		int z = 9;
		int finalone[] = arrange(z);
		for (int i = 0; i < z; i++) {
			System.out.print(" " + finalone[i]);
		}
	}
}
