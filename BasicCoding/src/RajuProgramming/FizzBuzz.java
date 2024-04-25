package RajuProgramming;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 34; 
		
		while(n<=50)
		{
			if((n%5)==0 && (n%7)==0)
				{
					System.out.println("FizzBuzz");
				}
			else if(n%5==0) {
				System.out.println("Fizz");
			}
			else if(n%7==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(n);
			}

			n++; 
		}
		
	}

}
