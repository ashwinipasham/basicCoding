package AswiniPractice;

public class SwitchCaseDemo {
	
	//Enums are always static and final constants, can be defined anything and implement like an interfaces
	enum Level{
		Low, 
		Medium, 
		High
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Level myVar = Level.Low; 
		
		//loop through an enum
		for(Level myNewVar: Level.values() ) {
			System.out.println(myNewVar);
		}
		
		switch(myVar)
		{
		case Low: 
			System.out.println("LOW level");
			break;
		case Medium:
			System.out.println("Medium level");
			break; 
		case High:
			System.out.println("High level");
			break;
		}
		
	}

}
