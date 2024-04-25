package RajuProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesfromArrayList {

	public static <T> ArrayList<T> removeDups(ArrayList<T> list) {
		
		ArrayList<T> newArray = new ArrayList<T>();
		
		for(T number:list) {
			if(!newArray.contains(number)) {
				newArray.add(number);
			}
		}
				
		return newArray; 
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>  inputList = new ArrayList<>( Arrays.asList(1,10,2,2,10,3,3,3,4,5,5)); 
		System.out.println(removeDups(inputList));
	}

}
