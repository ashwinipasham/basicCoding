package RajuProgramming;

public class Need_inaHayStack {

	
	public static boolean findNeedle(int[] array, int needle) {
		
		
		for(int newArray:array) {
			
			if(newArray == needle) {
				
				return true;
			}
		}	
		return false;
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hayStack = {12,14,10,2,3};
		int needle = 2; 
		
		System.out.println(findNeedle(hayStack, needle));
	}

}
