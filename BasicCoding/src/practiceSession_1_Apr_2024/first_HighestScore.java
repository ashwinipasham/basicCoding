package practiceSession_1_Apr_2024;

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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {93, 49, 97, 60, 52, 100, 200, 50}; 
		
		int highScore = firstLargest(scores); 
		int lowScore = firstLowest(scores); 
		
		System.out.println("First Highest Score: " + highScore);
		System.out.println("First Lowest Score: " + lowScore);

	}

}
