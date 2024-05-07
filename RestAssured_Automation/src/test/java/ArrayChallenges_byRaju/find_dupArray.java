package ArrayChallenges_byRaju;

import java.util.Set;
import java.util.TreeSet;

public class find_dupArray {
	
	/*
	 * Approach:
	 * 
	 * Take a Set Insert all array element in the Set. Set does not allow duplicates
	 * and sets like LinkedHashSet maintains the order of insertion so it will
	 * remove duplicates and elements will be printed in the same order in which it
	 * is inserted. Convert the formed set into array. Print elements of Set.
	 */
	
	//function to remove 
	public static void removeDuplicates(int[] arr)
	{
		//LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); // use linkedHashSet to maintain the order
		Set<Integer> tset = new TreeSet<>(); //use Tree Set to sort the array in order
		
		//loop the array
		for(int i=0; i<arr.length; i++)
		{
			//add elements to set
			tset.add(arr[i]); 			
		}		
		System.out.println(tset);		//print set
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,6,7,9,2,2,3,4,4,5,5,6}; //unsorted array
		int[] arr1 = {10, 10, 20, 20, 30, 30, 30, 40}; //sorted array
		
		//call function
		removeDuplicates(arr); 
		removeDuplicates(arr1);
		
		
	}

}
