package java_Programs;

import java.util.Scanner;



public class PrimeNum {


	public static void main(String[] args) {

		PrimeNum p = new PrimeNum();

		int i;
		int num = 0;
		int maxCheck = 100; // maxCheck limit till which you want to find prime numbers

		boolean isPrime = true;	       

		String primeNumbersFound = "";

		for (i = 1; i <= maxCheck; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				primeNumbersFound = primeNumbersFound + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + maxCheck + " are:");

		System.out.println(primeNumbersFound);

		//p.prime_N();
		
		p.prime_Read();

	}
	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			//if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}    
	public void prime_N()
	{
		int x, y, flg;

		int N=45;

		System.out.println(
				"All the Prime numbers within 1 and " + N
				+ " are:");

		for (x = 1; x <= N; x++) {

			if (x == 1 || x == 0)
				continue;

			flg = 1;

			for (y = 2; y <= x / 2; ++y) {
				if (x % y == 0) {
					flg = 0;
					break;
				}
			}

			if (flg == 1)
				System.out.print(x + " ");
		}

	}
	public void prime_Read()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to check: ");
		int n = sc.nextInt();
		
		while(true) {
			
		if (n%2 ==1) {
			
			if (n%3!=0) {
			System.out.println(n+ " Is Prime number");
			
			n=sc.nextInt();
			
			}
		else {
			System.out.println(n+ " Is not Prime");
			
			n=sc.nextInt();
		}
		}
	else {
				System.out.println(n+ " Is not Prime");
				
				n=sc.nextInt();
			}
		
	}
		
	}

}
