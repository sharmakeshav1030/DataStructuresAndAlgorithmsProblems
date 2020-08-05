/*
 * This is the java class which finds out whether the given string is a pallindrome or not.
 */
 
 public class CheckPallindrome {

	public static boolean checkPalindrome(String str){
		
        boolean check = false;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);

		if (str.equals(reverse)) {
			check = true;
		}

		return check;

	}
}
