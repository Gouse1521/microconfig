package arrayList;

public class String1 {

	public static void main(String[] args) {
		String s="gouse";
    	
    	System.out.println(s.length());
    	System.out.println(s.charAt(0));
    	int count=1;
String s1="gouse"+"_"+String.valueOf(count);


String s2=m1(s1);


System.out.println(s2);
    	 
	}
	
	static String m1(String s1) {
		
		System.out.println("inside m1");
		return s1;
		
		
	}

}
