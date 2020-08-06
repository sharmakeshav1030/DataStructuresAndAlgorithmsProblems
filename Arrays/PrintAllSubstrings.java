/*
 * This is the java class deals with printing all the substrings of a given string.
 */

public class PrintAllSubstrings {

	public static void printSubstrings(String str){
	
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}
	

}
