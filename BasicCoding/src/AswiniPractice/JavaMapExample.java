package AswiniPractice;

import java.util.HashMap;
import java.util.Map;

public class JavaMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> map = new HashMap<Integer, String>(); 
		 map.put(1, "Amit"); 
		 map.put(2, "Suraj"); 
		 map.put(3, "Rahul"); 
		 map.put(4, "Anjali"); 
		 
		 //Traverse through the map
		 for(Map.Entry<Integer, String> m: map.entrySet()) {
			 System.out.println(m.getKey() +  " " + m.getValue());
		 }
		 
		 
	}

}
