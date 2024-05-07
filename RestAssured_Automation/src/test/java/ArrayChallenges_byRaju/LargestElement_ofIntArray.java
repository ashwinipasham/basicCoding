package ArrayChallenges_byRaju;

public class LargestElement_ofIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks = {32, 33, 29, 26, 25}; 
		int maxMarks = 0; 
		int total = 0; 
		
		for(int i: marks)
		{
			if(i>maxMarks)
			{
				maxMarks = i; 				
			}
			total += i; 
		}
		
		System.out.println("Highest marks: " + maxMarks);
		//sum of Array elements 
		System.out.println("Sum of total elements: " +total);
		
		
}
}
