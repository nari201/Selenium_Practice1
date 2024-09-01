package test_Java_Programs;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		Practice1 p = new Practice1();

		System.out.println("Main");
		
		Thread.sleep(1000);

		p.p3();
		
		

	}

	public void p1() {

		Scanner sc = new Scanner(System.in);
		//	String string = sc.next();

		System.out.println("P1");

		for (int i =1;i<=5;i++) {
			for (int j=i; j<=5;j++) {

				System.out.print(j+" ");
			}

			System.out.println();


		}

	}

	public void p2() {

		System.out.println("P2");

		for (int i =1;i<=5;i++) {
			for (int j=1; j<=i;j++) {

				System.out.print("* ");
			}

			System.out.println();


		}

		for (int i =2;i<=5;i++) {

			for (int k=5; k>=i;k--) {

				System.out.print("* ");
			}

			System.out.println();


		}

	}

	public void p3() {

		System.out.println("P3");

		for (int i =1;i<=5;i++) {
			for (int k=i; k<5;k++) {

				System.out.print(" ");
			}
			for (int j=1; j<=i;j++) {

				System.out.print("*");
			}

			for (int j=2; j<=i;j++) {

				System.out.print("*");
			}
			System.out.println();


		}

		for (int i =1;i<=5;i++) {
			for (int k=1; k<i;k++) {

				System.out.print(" ");
			}

			for (int k=5; k>=i;k--) {

				System.out.print("*");
			}
			for (int j=i; j<5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			

	}
	}
}


