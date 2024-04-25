package practiceSession_1_Apr_2024;

import java.util.Arrays;

public class AnagramsString {
	
	private static void isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		
		String s1 = str1.replaceAll("\\s", ""); 
		String s2 = str2.replaceAll("\\s", ""); 
		boolean status = true; 
		
		if(s1.length() != s2.length())
		{
			status = false; 
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams" );	
		}
		else {
			char[] StrArr1 = s1.toLowerCase().toCharArray(); 
			char[] StrArr2 = s2.toLowerCase().toCharArray(); 
			
			Arrays.sort(StrArr1);
			Arrays.sort(StrArr2);
			
			status = Arrays.equals(StrArr1, StrArr2); 
			
			if(status)
			{
				System.out.println(s1 + " and " + s2 + " are Anagrams" );
		
			}
			else {
					System.out.println(s1 + " and " + s2 + " are NOT Anagrams" );			
				
			}
					
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isAnagram("Keep" , "Peek"); 
		isAnagram("Mother in law", "Hitler Woman"); 
		isAnagram("raft", "craft"); 
		isAnagram("Pair", "fair"); 


	}

	

}
