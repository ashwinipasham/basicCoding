package AswiniPractice;

public class EnumDemo {

	enum Size{
		SMALL, 
		MEDIUM, 
		LARGE, 
		XL, 
		Toddler
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the enums to the variables
		Size myVar = Size.MEDIUM; 
		Size arvindVar = Size.XL; 
		Size arjunVar = Size.Toddler; 
		Size rajuVar = Size.LARGE; 
		Size samVar = Size.SMALL; 
		
		System.out.println("Ashwini T-Shirt size is " + myVar);
		System.out.println("Raju T-Shirt size is " + rajuVar);
		System.out.println("Arjun T-Shirt size is " + arjunVar);
		System.out.println("Sam T-Shirt size is " + samVar);
		System.out.println("Arvind T-Shirt size is " + arvindVar);
		
		
	}

}
