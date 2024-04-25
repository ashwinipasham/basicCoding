package RajuProgramming;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharCount {
	
	
	public static void repeatedCharsCount(String s) {
		
		char[] c = s.toCharArray(); 
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		for(int i = 0; i<c.length; i++)
		{									
			if(map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i])+1);
			}
			else {
				map.put(c[i], 1); 
			}
					
		}
		for(Map.Entry<Character, Integer> m: map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Ashwiniilloveyou"; 
		
	    repeatedCharsCount(s); 

	}

}
