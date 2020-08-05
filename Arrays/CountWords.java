/*
 * This is the java class deals with counting the number of words in the string.
 */
 
 public class CountWords {

	public static int countWords(String str){
	
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
        
        return count + 1;

	}
}
