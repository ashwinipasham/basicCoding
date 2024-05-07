package ArrayChallenges_byRaju;

import java.util.Arrays;

public class sortArray_inAlphabeticalOrder {
	
	private static void orderedGuests(String[] hotel) {
		// TODO Auto-generated method stub
		Arrays.sort(hotel);
		for(String a:hotel)
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] hotel = {"Xoo", "Poo", "Boo", "Shaik", "Myboob", "Angel", "Booby"}; 

		orderedGuests(hotel); 
	}

	

}
