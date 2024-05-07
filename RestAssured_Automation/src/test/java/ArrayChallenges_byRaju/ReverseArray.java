package ArrayChallenges_byRaju;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//no difference between int[] a and int a[], but there is a memory differnce between int[] and Integer[] arrays. Comparitively int[] is more flexible to store length or numbers. 
		// create array of objects==========================Object[] oa; 
		//Create a collection of unknown type    ========== Collection[] ca; 
		//allocation memory to array =======================int[] iArr = new int[20]; 
		
		int[] iArr = {1,2,3,4}; //iterate and print output 3
		
		for(int i=0; i<iArr.length; i++)
		{
			 
		}
		
		System.out.println("Print 3rd element: " + iArr[2]);
		
		//reverse and print Array
		for(int i = iArr.length-1; i>=0; i--)
		{
			System.out.print(iArr[i]);
		}
		
		
		
		
		
		

	}

}
