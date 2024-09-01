package test_Java_Programs;

import java.util.ArrayList;
import java.util.Scanner;


public class For_test1 {

	public static void main(String[] args) {
		System.out.println("main");

		For_test1 t = new For_test1();

		/**ArrayList<String> list = new ArrayList<String>();

 list.add("m1");
 list.add("m2");
 list.add("m3");

		 */

		String m1="m1";
		String m2="m2";
		String m3="m3";
		String m4="m4";
		String m5="m5";
		String m6="m6";
		String m7="m7";
		String m8="m8";
		String m9="m9";
		String m10="m10";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter calling method:");
		String string = sc.next();

		while (true) {

			if (string.equals(m1)) {
				t.m1();
				break;
			}else if (string.equals(m2)) {
				t.m2();
				break;
			}else if (string.equals(m3)) {
				t.m3();
				break;
			}else if (string.equals(m4)) {
				t.m4();
				break;
			}else if (string.equals(m5)) {
				t.m5();
				break;
			}else if (string.equals(m6)) {
				t.m6();
				break;
			}else if (string.equals(m7)) {
				t.m7();
				break;
			}
			else {

				System.out.println("Enter Valid Method only");

				string = sc.next();
			}
		}
	}



	public void m1() {

		System.out.println("Method - m1");

		for(int i=1; i<=5;i++) {

			for (int j=1; j<=i;j++) {

				System.out.print(+i +"\t");
			}
			System.out.println();
		}

	}


	public void m2() {

		System.out.println("Method - m2");
		for(int i=1; i<=5;i++) {
			for (int j=1; j<=i;j++) {

				System.out.print(+j +"\t");
			}
			System.out.println();
		}

	}

	public void m3() {
		System.out.println("Method - m3");

		for(int i=1; i<=5;i++) {

			for (int j=1; j<=i;j++) {

				System.out.print("* " );
			}
			System.out.println();
		}

	}

	public void m4() {
		System.out.println("Method - m4");

		// --Triangle

		for(int i=1; i<=13;i++) {


			for (int j=i; j<13;j++) {
				System.out.print(" ");
			}

			for (int k=1; k<=i;k++) {
				System.out.print("*");
			}
			for (int r=2; r<=i;r++) {
				System.out.print("*");
			}
			System.out.println();

		} 

	/*	// Triangle Reverse
		
		for (int i =1; i<=9; i++) {

			for (int j=1; j<=i; j++) {

				System.out.print(" ");

			}
			for (int j=9; j>=i; j--) {

				System.out.print(j);

			}
			for (int j=i; j<9; j++) {

				System.out.print(j);

			}
			
			System.out.println();
		} **/


	}

	public void m5() {
		System.out.println("Method - m5");

		for(int i=1; i<=5;i++) {

			System.out.println(" ");
			for (int j=5; j>=i;j--) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}


	public void m6() {
		System.out.println("Method - m6");

		for( int i=1; i<=9;i++) {

			for (int j=1; j<=i;j++) {

				System.out.print("3 " );
			}
			System.out.println();
		}
		for( int i=1; i<=9;i++) {

			for (int j=9; j>=i;j--) {

				System.out.print("3 " );
			}

			System.out.println();
		}

	}
	

	public void m7() {
		System.out.println("Method - m7");

		for(int i=1; i<=5;i++) {
			
			int n=i;

			for (int j=1; j<=i;j++) {

				System.out.print(n+" ");
				n= n+5-j;
			}
			System.out.println();
		}

	}


}
