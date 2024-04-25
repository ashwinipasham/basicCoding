package AswiniPractice;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 12345678; 
		int reverse = 0; 
		
		while(n!=0)
		{
		reverse = (n*0) + (n%10); 
		n = n/10;
		System.out.print(reverse);
		
		}
				
	}

}
