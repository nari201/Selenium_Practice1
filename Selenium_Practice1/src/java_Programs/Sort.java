package java_Programs;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args)
	{
	//Unsorted array of numbers
	Integer[] arr = new Integer[] {100, 20, 10, 30, 80, 70, 90, 40, 50, 60};
	
	Integer[] a = new Integer[] { 1,2,5,9,40,60,85};
	

	
	//Sort function to sort the above array
	
	Arrays.sort(a);
	Arrays.sort(arr);

	//Printing the sorted array on console
	System.out.println(Arrays.toString(arr));
	
	System.out.println(Arrays.toString(a));
	
	}

}
