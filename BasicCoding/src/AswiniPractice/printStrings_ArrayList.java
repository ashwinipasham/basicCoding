package AswiniPractice;

import java.util.ArrayList;

public class printStrings_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>(); 
		names.add("Zoo"); 
		names.add("Poo"); 
		names.add("Xoo"); 
		names.add("Zara"); 
		
		System.out.println("List of names: " + names);
		
		System.out.println(names.contains("Zaras")); 
		System.out.println(names.contains("Zara"));
		
		//printing Student name
		names.forEach((s)->printName(s));
		System.out.println();
		
		
	}
	
	public static void printName(String s) {
		
		System.out.println("Student Name: " + s);
	}
	

}
