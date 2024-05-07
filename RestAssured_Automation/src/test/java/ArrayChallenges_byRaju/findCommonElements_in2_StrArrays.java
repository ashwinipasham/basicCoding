package ArrayChallenges_byRaju;

import java.util.ArrayList;
import java.util.List;

public class findCommonElements_in2_StrArrays {
	
	private static void commonElementsinArrays(String[] arr1, String[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		
		
		//Approach 1 - iterate over two arrays and add to the Array list
		
		List<String> commonElements = new ArrayList<String>(); 
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j =0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					commonElements.add(arr1[i]); 
				}
				
			}
		}
		
		System.out.println("Common ELements: " + commonElements);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1 = {"k", "e", "e", "p"}; 
		
		String[] arr2 = {"p", "e", "a", "k"}; 
		
		int size1 = arr1.length; 
		int size2 = arr2.length; 
		
		commonElementsinArrays(arr1, arr2, size1, size2); 
		

	}

	

}
