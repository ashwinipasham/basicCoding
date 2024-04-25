package practiceSession_1_Apr_2024;

public class FactorialNumbers {
	
	
	public static int fact(int n)
	{
		if(n<2)
		{
			return n; 
		}
		else {
			
		int res = 1, i;
		for(i=2; i<=n; i++)
		{
			res *= i; 
		}
		//System.out.println(res);
		return res; 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Factorial");
		System.out.println(fact(6));
		System.out.println(fact(10)); 
	}

}
