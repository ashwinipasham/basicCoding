package practiceSession_1_Apr_2024;

public class isPalindrome {
	
	boolean isPalindrome = true; 
	
	public static boolean isPalindrome(String original)
	{
	int len = original.length(); 
	StringBuffer sb = new StringBuffer(); 
	
	for(int i=len-1; i>=0; i--)
	{
		sb.append(original.charAt(i)); 
	}
	
	String newString = sb.toString(); 
	
	if(original.equals(newString))
	{		
		System.out.println(" The given string is Palindrome: " + original);
	}
	else {
		System.out.println(" The given string is NOT Palindrome: " + original);
	}
	return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Madame"; 
		String s1 = "civic";
		isPalindrome(s); 
		isPalindrome(s1); 
	}

}
