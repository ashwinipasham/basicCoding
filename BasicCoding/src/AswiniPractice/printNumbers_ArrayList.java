package AswiniPractice;

import java.util.ArrayList;

public class printNumbers_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(12); 
		list.add(20); 
		list.add(30); 
		list.add(40); 
		list.add(50); 
		
		//Using for each and Add All method instead of printing directly
		for(int num:list) {
			System.out.println(num);
		}
		
		list.addAll(list); 
		
		//System.out.println("Print all values: " + list);
		
		
	}

}
