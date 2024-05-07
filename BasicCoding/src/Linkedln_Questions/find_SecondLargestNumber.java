package Linkedln_Questions;

public class find_SecondLargestNumber {
	
	public static int getSecondLargest(int[] a,  int result)
	{
		result = 0; 
		for(int temp:a)
		{
			System.out.println(temp);
		}
		
		
		return result; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,5,6,3,2}; 
		int b[] = {44,66,99,77,33,22,55}; 
		
		System.out.println(getSecondLargest(a,6));
		

	}

}
