package Linkedln_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printLongestString_givenFromInput {

	
	//Write a python program that takes three strings as input from the user and print the longest among the three.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int input = 1; 
		
		List<String> names = new ArrayList<String>(); 
		
		//Print user input in list
		while(input<=3)
		{
			System.out.print("Enter a input String: "); 
			names.add(scn.nextLine()); 
			input++; 
		}

		System.out.println(names);
		scn.close(); 
		
		//loop the array
				
		int maxLength = 0; 
		int maxIndex = 0; 
		
				
		  for(int i=0; i<names.size(); i++) {
		  
			  String temp = names.get(i) ; 
			  System.out.println(temp);
			  
			  if(temp.length()>maxLength) {
				  maxLength = temp.length(); 
				  maxIndex = i; 
			  }
			  
		  }
		 
		  System.out.println("Largest string from the user input: " + names.get(maxIndex));
		 
		
	}

}
