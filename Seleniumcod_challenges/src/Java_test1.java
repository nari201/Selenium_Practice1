package test_Java_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import com.google.common.base.CaseFormat;

public class Java_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main");
		
		Java_test1 t1 = new Java_test1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Call the loop method ");
		
		String s = sc.nextLine();
		String n1 = "for";
		 int c = 0;
		
		 while (true) {
			
		if (s.equals(n1)) {
			
			System.out.println("Calling " +n1 +" Loop Method");
			
			t1.m1();
			break;
		
		}else {
			System.out.println("Out of For loop method count "+c);
			
			s =sc.nextLine();
			
			++c;
			
			if (c >=3) {
				
				System.out.println("Limt Exceded, Try again later");
				
				break;
				
				
			}
		}	
    } 
}
	public void m1() {
		System.out.println("For loop method m1");
		
		 String s = "Naresh";
		 
		 ArrayList<String> list=new ArrayList<String>();   
		 
	      list.add("Mango");
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");   
	      list.add("Other");
	      
	      Iterator itr = list.iterator();
	      System.out.println("Selection List: "+list);
	      
	      String V="";
			 for (String str : list) {
		    	   V =str;
		    	   
		    	   if (V.equals("Mango")){
		  			 
						System.out.println("its Mango");
					 } else {
						 
						 System.out.println("not in List");
					 }
		      }
   }
}


