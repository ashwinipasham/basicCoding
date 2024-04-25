package AptitudeQuestions;

public class OutputofProgram {
	
	//main { int x,j,k; j=k=6;x=2; x==j*k; printf("%d", x); }) - compile error
	
		public static String toString1() {
			System.out.println("Test toString called");
			return "";
		}

		public static void main(String args[]) {
			System.out.println(toString1());
		}
	

}
