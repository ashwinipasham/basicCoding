package practiceSession_1_Apr_2024;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Samsung"; 
		char[] c = s.toCharArray(); 
		int len = c.length-1; 
		
		String rev = ""; 
		StringBuffer sb = new StringBuffer(); 
		StringBuffer sb1 = new StringBuffer();
		
		for(int i=len; i>=0; i--)
		{
			rev = sb.append(c[i]).toString(); 
		}
				
		System.out.println(rev);
		System.out.println("First Substring: " + s.substring(0, 3));
		System.out.println("Second Substring: " + s.substring(3, 7));
		String s1 = sb1.append(c[0]).toString().toLowerCase() + s.substring(1, 7);
		
		System.out.println("All lowercase: " + s1);
		
		
	}

}
