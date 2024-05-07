package ArrayChallenges_byRaju;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class removeDuplicates_usingMap_DS {
	
	private static void removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//int count = 1; 
		
		for(int i=0; i<arr.length; i++)
		{			
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);		// to print repeated elements
			}
			else
			{
				map.put(arr[i], 1);			// to print non-repeated elements
			}		
			
		}	
		
		Set<Entry<Integer, Integer>> set = map.entrySet(); 
		for(Entry<Integer, Integer> entry: set)
		{
			if(entry.getValue() > 1)
			{
				System.out.println("Duplicate Element: " +entry.getKey() + " found " + entry.getValue() + " times");
			}
			else {
				System.out.println("Element: " +entry.getKey() + " found " + entry.getValue() + " time");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 2, 5, 1, 7, 2, 4, 2}; 
		
		removeDuplicates(arr); 
	}

	

}
