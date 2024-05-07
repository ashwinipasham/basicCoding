package practiceSession_1_Apr_2024;

import java.util.Arrays;

public class first_HighestScore {
	
	public static int firstLargest(int[] numbers)
	{
		int highScore = 0; 
		
		for(int element:numbers)
		{
			if(element>highScore) {
				highScore = element; 
			}
		}
		
		return highScore; 
	}
	
	public static int firstLowest(int[] numbers)
	{
		int lowScore = 100; 
		
		for(int element:numbers)
		{
			if(element<lowScore) {
				lowScore = element; 
			}
		}
		
		return lowScore; 
	}
	
	// Using Arrays Sort function
	private static int sortingScores(int[] scores, int total) {
		// TODO Auto-generated method stub
		
		Arrays.sort(scores);
		
		return scores[total-2]; 
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {93, 49, 97, 60, 52, 100, 200, 50}; 
		
		sortingScores(scores, 8); 
		
		int highScore = firstLargest(scores); 
		int lowScore = firstLowest(scores); 
		
		System.out.println("First Highest Score: " + highScore);
		System.out.println("First Lowest Score: " + lowScore);
		System.out.println("Getting the second largestScore: " + sortingScores(scores, 8));
	}

	

}
