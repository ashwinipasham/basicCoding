package ArrayChallenges_byRaju;

import java.util.Arrays;

public class checkVowels_Consonants {
	
	private static void findVowels_Consonants(String s) {
		// TODO Auto-generated method stub
		
		//Counter variable to store the count of vowels and consonant    
	int vCount = 0; 
	int cCount = 0; 
	
	//Converting entire string to lower case to reduce the comparisons    
	s = s.toLowerCase(); 
	
	for(int i=0; i<s.length(); i++)
	{
		//Checks whether a character is a vowel   
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			//increase increment
			vCount++; 
		}
		//Checks whether a character is a consonant    
		else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			
			cCount++; 
		}
	}
	
	System.out.println("No. of Vowels count: " +vCount);
	System.out.println("No. of Consonants count: " +cCount);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = "This is really a simple sentence"; 
		String s1 = "Ashwini Reddy"; 
		
		findVowels_Consonants(s);
		findVowels_Consonants(s1);

	}

	

}
