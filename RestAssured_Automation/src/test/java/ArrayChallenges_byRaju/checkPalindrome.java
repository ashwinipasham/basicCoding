package ArrayChallenges_byRaju;

public class checkPalindrome {
	
	private static boolean verifyPalidrome(String s) {
		// TODO Auto-generated method stub
		
		//boolean status = false; 
		if(s.length() <=1)
		{
			System.out.println("Its a palindrome");
			return true; 
		}
		
		char[] c = s.toCharArray(); 
		StringBuffer sb = new StringBuffer(); 
		
		for(int i=c.length-1; i>=0; i--)
		{
			sb.append(c[i]); 
		}
		
		String reverse = sb.toString(); 
		
		if(s.equalsIgnoreCase(reverse))
		{
			System.out.println("Its a palindrome");
			return true; 
		}
		System.out.println("Its NOT a palindrome");
		return false; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Madam"; 
		String s1 = ""; 
		String s2 = "babysharK"; 
		
		verifyPalidrome(s); 
		verifyPalidrome(s1); 
		verifyPalidrome(s2); 
		
		System.out.println("The given string is " + s);
		System.out.println("The given string is " + s1);
		System.out.println("The given string is " + s2);
		

	}

	

}
