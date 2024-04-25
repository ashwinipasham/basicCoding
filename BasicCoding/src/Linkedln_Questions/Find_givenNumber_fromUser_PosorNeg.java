package Linkedln_Questions;

import java.util.Scanner;

public class Find_givenNumber_fromUser_PosorNeg {

	//Write a Java program to get a number from user. Using if, and else to find the given number is positive or negative
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Give a input number");
			Scanner scn = new Scanner(System.in); 
			float input = scn.nextFloat(); 
			
			if(input>0) {
				System.out.println("Its a POSITIVE number");
			}
			else {
				System.out.println("Its a NEGATIVE number");
			}	
			
			scn.close(); 
		

	}

}
