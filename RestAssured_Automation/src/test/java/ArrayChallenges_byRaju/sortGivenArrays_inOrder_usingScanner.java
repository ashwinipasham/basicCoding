package ArrayChallenges_byRaju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class sortGivenArrays_inOrder_usingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Give some restuarant names: ");
		Scanner scn = new Scanner(System.in); 
		int input = 1; 
		
		Set<String> names = new HashSet<String>(); 

		while(input <=6)
		{
			names.add(scn.nextLine()); 
			input++; 
		}
		
		System.out.print(names);
		
	}

}


Output: 
Give some restuarant names: 
Charles
Biryani
AppleBees
Jack in box
MCD
Biryani bowl
[Biryani bowl, Charles, Jack in box, Biryani, AppleBees, MCD]
