package AswiniPractice;

public class StringReverse {
	
	public static String stringReverse(String s)
	{
		
		//int length = s.length(); 
		char[] temp = s.toCharArray();
		String rev = null;
		
		for(int i =temp.length-1; i>=0;  i--)
		{
			System.out.println(temp[i]);
			rev = temp.toString(); 
		}
			
		return rev; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Costco"; 		
		stringReverse(s);
		
		String s2 = "Made in Heavens"; 
		String reverse = ""; 
		
		char[] tempChar = s2.toCharArray();; 
		StringBuffer sb = new StringBuffer(); 
		
		for(int i = tempChar.length-1; i>=0; i--) {
			sb.append(tempChar[i]);
		}
		
		reverse = sb.toString(); 
		
		System.out.println("String Reverse = " + reverse);
		
	}

}
