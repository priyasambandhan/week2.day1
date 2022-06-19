package week1.day2.Assignment;

import java.util.Arrays;

public class Anagram {
	
	public boolean checkAnagram (String s1, String s2)
	{
    char[] arr1=s1.toCharArray();
    char[] arr2=s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    if (arr1.length!=arr2.length)
{
	
	return true;
}
    for (int i = 0; i < arr1.length; i++) {
    	  		
    		if(arr1[i]!=arr2[i])
    		{
    			return true;
			
		}
		
	}
    return false;
	}
	public static void main(String[] args) {
		
		Anagram obj= new Anagram();
		boolean flag= obj.checkAnagram("POST", "STOP");
		
		if (flag==false)
		{
			System.out.println("The given strings are Anagrams");
		}
		else
		{
			
			System.out.println("The given strings are not Anagrams");
		}
		
	}
	
	
	}
