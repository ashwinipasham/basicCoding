package RajuProgramming;


import java.util.HashSet;

public class RemoveDuplicates {
	
	
	public static String removeDups(String[] array) {
		HashSet<String> set = new HashSet<String>();
		StringBuffer sb = new StringBuffer(); 
		StringBuffer nonrep_sb = new StringBuffer(); 
		
		
		for(String s:array)
		{
			if(!set.contains(s)) {
				set.add(s); 
				sb.append(s);
				
			}	
			else {
				nonrep_sb.append(s); 		
				System.out.println("Repeated Strings: " + nonrep_sb.toString());
			}			
			
		}
		
		
		return sb.toString(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] list = {"geek", "for", "geeks", "for", "geek", "lovers"};
		System.out.println("Non repeated Strings: " + removeDups(list));
		//System.out.println("Repeated Strings: " + removeDups(list));
		
	}

}
