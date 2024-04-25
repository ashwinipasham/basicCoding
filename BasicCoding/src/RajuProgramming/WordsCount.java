package RajuProgramming;

public class WordsCount {
	
	public static int wordsCount(String s) {
		
		//String[] word = s.split(" "); 
		
		return s.split(" ").length; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I ou love Ashwini y"; 
		System.out.println(wordsCount(s));
	

	}

}
