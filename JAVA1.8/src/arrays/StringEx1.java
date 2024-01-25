package arrays;

import java.util.HashSet;

public class StringEx1 {

	public static void main(String[] args) {
	
		String s="2022/07/01";
		
	String 	s1=s.replace("/", " ");
	
	System.out.println(s1);
	String s2="123436745678";
	char[] arr = s2.toCharArray();
//	String arr1 = s2.toCharArray().toString();
	System.out.println(arr);
		HashSet<Integer> hs=new HashSet<>();
		
		for(Character c:arr) {
			//System.out.println(c);
			Integer in=Character.getNumericValue(c);
			hs.add(in);
		}
		System.out.println(hs);//op [1, 2, 3, 4, 5, 6, 7, 8]
		
		 for (Integer e : hs) { 
	            
	            System.out.print(e+" "); // 1 2 3 4 5 6 7 8
	        }

	}
	
	
}
