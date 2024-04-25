package Linkedln_Questions;

public class FloatingNums_Add_Sub_Div {

	//Take two floating-point numbers and print addition , subtraction and division of these two numbers

	
	public static float addNum(float x, float y ) {
		
		float result=0; 
		
		result = x+y; 
		
		return result; 
	}
	
	public static float subNum(float x, float y ) {
			
			float result=0; 
			
			result = x-y; 
			
			return result; 
		}

	public static float divNum(float x, float y ) {
		
		float result=0; 
		
		result = x/y; 
		
		return result; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addNum(2,3)); 
		System.out.println(subNum(2,3)); 
		System.out.println(divNum(2,3)); 
		
	}

}
