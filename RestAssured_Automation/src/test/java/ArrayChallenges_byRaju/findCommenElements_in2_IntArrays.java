package ArrayChallenges_byRaju;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findCommenElements_in2_IntArrays {
	
	private static void commonElements_inArrays(Integer[] arr1, Integer[] arr2, int n, int m) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1)); 
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2)); 
		
		set1.retainAll(set2); 
		
		System.out.println("Common Elements: " + set1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr1 = {4,6,6,7,8}; 
		Integer[] arr2 = {2,4,8}; 
		
		Integer[] arr3 = {5,6,7}; 
		Integer[] arr4 = {1,2,3}; 
		
		int size1 = arr1.length; 
		int size2 = arr2.length; 
		int size3 = arr3.length; 
		int size4 = arr4.length; 
		
		commonElements_inArrays(arr1, arr2, size1, size2); 
		commonElements_inArrays(arr3, arr4, size3, size4); 

	}

	

}
