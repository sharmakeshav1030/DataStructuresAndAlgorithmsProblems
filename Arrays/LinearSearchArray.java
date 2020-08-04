
/*
 * This is the java class deals with searching for the integer X in the given array/list using 'Linear Search'.
 */
 
public class LinearSearchArray{	
	
	public static int linearSearch(int[] arr, int num){
		int i;
        for(i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}   
		}
        return -1;
	}
}
