package AptitudeQuestions;

public class TwoMainmethods {
	
	void Test()
	{
		System.out.println("Main method 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TwoMainmethods.Test(); // using static keyword to test method
		TwoMainmethods obj = new TwoMainmethods(); 
		obj.Test();
		System.out.println("Main Method 2");
		
	}

}
