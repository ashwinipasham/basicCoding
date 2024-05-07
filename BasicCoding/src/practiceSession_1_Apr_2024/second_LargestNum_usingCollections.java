package practiceSession_1_Apr_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class second_LargestNum_usingCollections {
	
	private static int getSecondLargest(Integer[] a, int total) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(a); 
		Collections.sort(list);
		
		int element = list.get(total-2); 		
		return element;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = {20, 100, 80, 70, 60}; 
		Integer[] b = {1,9,8,7,6,5,4}; 
		
		int aTotal = a.length; //length of Array a
		int bTotal = b.length; //length of Array b
		
		System.out.println(aTotal);
		System.out.println(bTotal);
		
		//Arrays.sort(a);
		//System.out.println("Sorted Array " + a); //just print the id
		
		System.out.println("=============Enhanced loop=====================");
		for(int i:a)
		{			
			System.out.print(i + " ");
		}
		System.out.println("Enhanced loop done =====================");
		
		System.out.println("=====================Using Collections method =====================");
		System.out.println("Second largest: " +getSecondLargest(a,5));
		System.out.println("Second largest: " +getSecondLargest(b,7));
		
		

	}

	

}
