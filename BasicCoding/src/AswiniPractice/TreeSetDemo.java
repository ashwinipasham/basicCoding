package AswiniPractice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new TreeSet<String>(); 
		set.add("A"); 
		set.add("Z"); 
		set.add("L"); 
		set.add("J");  
		set.add("L"); //cannot add duplicates
		
		//Printing the set in sorting order
		System.out.println("Printing Set: " + set);
		

	}

}
