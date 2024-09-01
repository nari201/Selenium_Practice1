package java_Programs;

// Java program to ReverseString using StringBuilder

import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseStr

public class String_Reverse {

	public static void main(String[] args) {
		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		//input1.reverse();

		// print reversed String
		// System.out.println(input1);

		String_Reverse S = new String_Reverse();
		
		S.Reverse11();
		
	//*	S.Reverse2();
		
	}

	/*public void Reverse() {

		String input2 = "naresh 201 **etc";

		System.out.println(input2.length());

		// convert String to character array
		// by using toCharArray

		char[] c = input2.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {

			System.out.print(c[i]);
			
	}
		System.out.println();
		
	} **/
		
		public void Reverse11() {
			
			String r = " test 01o u";
			
			char[] i = r.toCharArray();
		
			for (int k=i.length-1; k>=0; k--) {
				
			System.out.print(i[k]);
				
			}
			
			System.out.println();
		
		}
		
		
		



	public void Reverse2() {
		String input = "abcdijk";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}
	
}
