package java_Programs;

public class Piramid_num_order {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		
		int count =5;
		
		for (a=7; a>=0;a--) {
			
			for (b=7;b>=a;b--) {
				
				System.out.print(b+ " ");
			}
			System.out.println();
		}

	}

}
