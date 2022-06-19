package Week2.Day1;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) {
		String s1="racecar";
		String revS1="";
	    char[] charS1=s1.toCharArray();
	    for (int i = charS1.length-1; i >=0; i--) {
	    	
	    	revS1= revS1+charS1[i];
			
		}
	  //  System.out.println(revS1);
	    if (s1.equals(revS1)==true)
	    	
	    	System.out.println(s1 +" is a Palindrome ");
	    else
	    	System.out.println(s1 +" is not a Palindrome ");
	}
}
