package java_Programs;

import java.util.*;

import java.io.FileOutputStream;

public class Collect {
	

    public static void main(String args[])
    
    {
    
    	Collect n = new Collect();
    	
    	n.List_col();
    	n.set_col();
    	n.MapExample();
    			
    }

        public void List_col()
        
        {
          
  
        // Creating a List
        List<String> al = new ArrayList<>();
  
        // Adding elements in the List
        al.add("mango");
        al.add("orange");
        al.add("Grapes");
  
        // Iterating the List
        // element using for-each loop
        System.out.println(al);
        
        for (String fruit : al)
            System.out.println(fruit);
    }
    
    
    public void set_col()
    
    {
        // Set demonstration using HashSet
        Set<String> Set = new HashSet<String>();
          
        // Adding Elements  
        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Set.add("five");
          
        // Set follows unordered way. 
        System.out.println(Set);
    }
    
    
    public void MapExample () {
    	
    	 // Creating object for Map.
        Map<Integer, String> map
            = new HashMap<Integer, String>();
  
        // Adding Elements using Map.
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
  
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " "
                               + m.getValue());
    }
  }
}


