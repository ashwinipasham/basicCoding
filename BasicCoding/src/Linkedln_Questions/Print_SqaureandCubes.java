package Linkedln_Questions;

public class Print_SqaureandCubes {
	
	//Print the square and cube of the integers from 1 to 5 using a while loop
	
	public static int printSquares(int num) {
		int result = 0; 
		result = num* num; 
		
		return result;
	}

	
	public static int printCubes(int num) {
			
		int result = 0; 
		result = (num*num*num);
		
		return result;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1; 
		
		while(n<=5) {
			System.out.println("Sqaure of the number: " + printSquares(n));
			System.out.println("Cube of the number: " + printCubes(n));
			n++; 
		}
		

	}
	
	

}
