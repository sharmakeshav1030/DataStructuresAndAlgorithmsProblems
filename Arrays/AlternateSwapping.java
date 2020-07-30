/*
 * This is the java class deals with swapping of alternate elements present in the array.
 */

public class AlternateSwapping {

	public static void swap(int arr[]) {

		for (int i = 0; i < arr.length - 1; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arrone[] = { 55, 44, 77, 88, 100};
		swap(arrone);

		for (int i : arrone) {
			System.out.println(i + " ");
		}
	}
}
