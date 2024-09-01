package java_Programs;

public class Piramid1 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		int count =5;
		
		i=1;
		while (i<= count) {
			
			j=1;
			
			while (j<=i) {
				
				System.out.print(" * ");
				
				
				j++;
			}
			
			System.out.println();
			i++;
			
		}
	}

}
