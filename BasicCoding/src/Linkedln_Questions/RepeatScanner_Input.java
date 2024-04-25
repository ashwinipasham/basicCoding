package Linkedln_Questions;

import java.util.Scanner;

public class RepeatScanner_Input {
	
	//Repeat the scanner 5 times and sum the value
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); 
		
		int input = 1; 
		int sum = 0; 
		
		while(true) {
			if(input>5) {
				break;
			}
			
			System.out.println("Input number");
			sum = sum + Integer.valueOf(scn.nextLine()); 
			input++; 
			
		}
		
		System.out.println("Total Sum: " + sum);
		
		scn.close(); 
		
	}

}
