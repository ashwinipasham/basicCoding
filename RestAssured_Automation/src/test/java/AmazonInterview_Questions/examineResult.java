package AmazonInterview_Questions;

public class examineResult {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		
		String s = null; 
		String s1 = ""; 
		
		try {
		System.out.println(s.length()); //null pointer exception
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(s1); // send an empty string
		System.out.println(s1.length());
		
		//What will this Java code print: String x = “Latest version”; String y = “of Selenium”; int z = 3; 
		//System.out.println(“We are learning Selenium”+” and the “+x+” “+y+” is “+z); ?
		
		String x = "Latest version"; 
		String y = "of Selenium"; 
		int z = 3; 
		
		System.out.println("We are learning Selenium”+” and the “+x+” “+y+” is “+z");
		//Expected result
		System.out.println("We are learning selenium and the " +x+  " " +y +" " + z );
						

	}

}

