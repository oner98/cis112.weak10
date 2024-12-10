package cis112_week10.lab;

/**
 * Write a recursive algorithm that finds all occurrences of a substring in a
 * string. Example - “ab” takes place in “abab” for 2 times or - “aa” takes
 * places in “aaaa” for 3 times. int recursive3( char * substr, char * str);
 * 
 * @author bingol
 */
public class OccuranceNumber {

	private static final boolean DEBUG = false;

	public static void main(String[] args) {
//		String text = "ab";
//		String text = "abab";
//		String text = "ababab";
//		String searched = "ab";

		String text = "aaaaa";
		String searched = "aa";
		System.out.println("Number of occurance=" + recursiveCount(text, searched));
	}

	public static int recursiveCount(String text, String searched) {
		if (DEBUG) {
	        System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
	        System.out.println("text=" + text);
	    }

	    // Base case: If the text is smaller than the searched substring, return 0
	    if (text.length() < searched.length()) {
	        return 0;
	    }

	    // Check if the current portion of the text starts with the searched substring
	    if (text.startsWith(searched)) {
	        // If found, add 1 and recursively check the rest of the string (moving one character forward)
	        return 1 + recursiveCount(text.substring(1), searched);
	    } else {
	        // If not found, move one character forward and continue
	        return recursiveCount(text.substring(1), searched);
	    }
	}
	

}
