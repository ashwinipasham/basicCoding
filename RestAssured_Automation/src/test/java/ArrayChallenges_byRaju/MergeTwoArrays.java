package ArrayChallenges_byRaju;

import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArrays {
	

	private static void mergeArrays(int[] arr1, int[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		
		//Declaring and using map as build in tool to store elements.
		Map<Integer, Boolean> map = new TreeMap<>(); 
		
		for(int i=0; i<n; i++)
		{
			map.put(arr1[i], true); 			
		}
		for(int j= 0; j<m; j++)
		{
			map.put(arr2[j], true); 
		}
		
		//printing keys of the map
		for(Map.Entry<Integer, Boolean> set:map.entrySet())
		{
		System.out.print(set.getKey() + " ");
		}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10, 60, 35, 40}; 
		int[] arr2 = {12, 20, 70, 80}; 
		
		int size1 = arr1.length; 
		int size2 = arr2.length; 
		
		//function call
		mergeArrays(arr1, arr2, size1, size2); 
		
		

	}

	

}
