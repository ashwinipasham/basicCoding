package ArrayChallenges_byRaju;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Program"; 
		String rev =""; 
		char[] c = s.toCharArray(); 
		
		//StringBuilder sb = new StringBuilder(); 
		
		for(int i=s.length()-1; i>=0; i--)
		{
			//using String Builder
			//sb.append(c[i]); 
		 rev = rev + c[i];  // Without using any in built functionality
		}
		
		//System.out.println("REverse String: " + sb.toString());
		System.out.println("REverse String: " + rev);

	}

}
