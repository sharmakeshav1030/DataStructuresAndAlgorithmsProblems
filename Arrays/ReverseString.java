/*
 * This is the java class with a method which basically reverses the given string word wise.
 */
 
public class ReverseString {
	public static String reverseWordWise(String input) {
		
        String word[] = input.split(" ");
		String reverse = "";

		for (int i = word.length - 1; i >= 0; i--) {
			reverse += word[i] + " ";
		}
        
        return reverse;
	}
}
