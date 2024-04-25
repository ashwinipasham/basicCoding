package practiceSession_1_Apr_2024;

public class FinonacciSequenece {
	
	
	public static void fibnoacciSeries(int n)
	{
		int fb3 = 0; 
		int fb1 = 0; 
		int fb2 = 1; 
		System.out.println(fb1 + " " + fb2);
		int count = 150; 
		
		for(int i=1; i<count; i++)
		{
			fb3 = fb1 + fb2; 
			
			if(fb3>count)
			{
				break; 
			}
			
			System.out.println(" " + fb3);
	
			fb1 = fb2; 
			fb2 = fb3; 
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 fibnoacciSeries(100);
	}

}
