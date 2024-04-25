package practiceSession_1_Apr_2024;

public class find_print_largestelement_Number {
	
	
	public static int find_largestNum(int[] numbers)
	{
		int newLargeNum = 0; 
		
		for(int element:numbers)
		{
			if(element>=newLargeNum) {
				newLargeNum = element; 
			}
			
		}
		
		return newLargeNum; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {10, 50, 60, 80, 90}; 
		int [] ar = {0, 5, 10, 6, 7, 1}; 
		int x = find_largestNum(ar);
		
		System.out.println("Largest number of the Array: " + x);

	}

}
