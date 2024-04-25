package Linkedln_Questions;

public class FindLongString_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that takes three strings from array and print the longest among the three.

		String[] array = { "one", "two", "three" };

		int maxLength = 0; 
		int maxIndex = 0;
		
		/*
		 * for (String temp : array) 
		 * { 
		 * if(temp.length()>maxlength) { maxlength =
		 * temp.length(); }
		 * 
		 * }
		 */
		
		
		for(int i = 0; i<array.length; i++)
		{
			String temp = array[i]; 
			if(temp.length()>maxLength)
			{
				maxLength = temp.length(); 
				maxIndex= i; 
			}
		}
		
		System.out.println(maxLength + " --"+ array[maxIndex]);
	}

}
