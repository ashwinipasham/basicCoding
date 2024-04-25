package practiceSession_1_Apr_2024;

public class TrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringA = " Wild " ; 
		String stringB = " Irish "; 
		String stringC = " Rose"; 
		String result; 
		
		System.out.println(stringA.trim() + stringB.trim() + stringC);
		
		//print using concat
		result = stringA.concat(stringB).concat(stringC); 
		
		System.out.println("Result Value: " + result);
		
	}

}
