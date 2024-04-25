package practiceSession_1_Apr_2024;

public class ExamineCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String arr[] = {"meow", "bray", "moo"}; String a = "meow";
		 * 
		 * System.out.println(arr[0]==a);
		 */
		
		
		  String a = "abc"; 
		  String b = new String("abc");
		  String c = "abc"; 
		  
		  System.out.println(a.equals(b)); 
		  System.out.println(a==c);
		  System.out.println(a==b); //creates a new id, so it doesn't match
		 
		
		/*
		 * String a= "meow"; String ab = a+"deal"; String abc = "meowdeal";
		 * 
		 * System.out.println(ab==abc); // the IDs doesn't match
		 */	}

}
