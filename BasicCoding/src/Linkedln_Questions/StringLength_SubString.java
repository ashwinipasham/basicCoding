package Linkedln_Questions;

public class StringLength_SubString {
	
	//1)Find the length of the below variables and using string slicing, extract and print the substring 'Biomedical' from string 1 and 'I 501' from string Biomedical Informatics Informatics 501 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Biomedical Informatics"; 
		String s1 = "Informatics 501"; 
		
		int s1Length = s.length(); 
		int s2Length = s1.length(); 
		
		//length of the strings
		System.out.println(s1Length);
		System.out.println(s2Length);
		
		//print the substring 'Biomedical' from string 1 
		String subStringOne = s.substring(0,10); 
		System.out.println(subStringOne);
		
		
		//'I 501' from string Informatics 501
		 
		String subStringThree = s1.substring(12, 15); 
		
		System.out.println(s1.charAt(0) + " " +  subStringThree);
		
		//print first and last char of the string s
		char first = s.charAt(0); 
		char last = s.charAt(s1Length-1);
		
		System.out.println("The first char of s: " + first);
		System.out.println("The last char of s: " + last);
		System.out.println("The Upper case of s: " + s.toLowerCase());
		System.out.println("The Lower case of s: " + s1.toUpperCase());
		
	}

}
