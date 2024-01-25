package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;


public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(100); 
		ArrayList<Integer> al2 = new ArrayList<>();
		 System.out.println(al1);
		 System.out.println(al2);
		// al2.add(null); valid
		 al2.add(1);
		 al2.add(2);
		 al2.add(3);
		 al2.add(4);
		 al2.add(6);
		 al2.add(7);
		 //al2.add(null); valid
		 //al2.add(null); valid
		 al2.add(1,10);
		 System.out.println(al2);
		 System.out.println(al2.get(2));
		
		 System.out.println(al2.size());
		 System.out.println(al1.size());
		 
		 for(int i=0;i<al2.size();i++) {
			 System.out.println("value:"+al2.get(i));
			 
		 }
		 for(Integer i:al2) {
			 System.out.println("value:"+i);	 
			 
		 }
		
		al2.add(1,9);
		 System.out.println(al2);
		al2.remove(1);
		 System.out.println(al2);
		 Iterator<Integer> it = al2.iterator();
			/*
			 * while (it.hasNext()) {
			 * 
			 * // Print the elements of ArrayList System.out.print(it.next() + " "); }
			 */
		 if(al2.contains(1)) {
			 
			 System.out.println("contains:1");
		 }
		 
		 al2.forEach(a1->System.out.println("for each :"+a1));
		 
		 // Getting an enumeration object
	        Enumeration<Integer> e
	            = Collections.enumeration(al2);
	 
	        // Till elements are there
	        while (e.hasMoreElements()) {
	 
	            // Print elements using nextElement() method
	        	  int x =e.nextElement();
	        	  
	            System.out.println(e.nextElement());
	        }
	            while (it.hasNext())
	            {
	            	// System.out.println("contains:2");
	                int x = it.next();
	                if (x < 5) {
	                    it.remove();
	                    System.out.println("removed :"+x);
	                }
	            }
	     
	            System.out.println("Modified ArrayList : "
	                                               + al2);
	        }
	    
	}


