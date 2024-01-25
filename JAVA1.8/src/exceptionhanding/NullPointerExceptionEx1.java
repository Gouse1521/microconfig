package exceptionhanding;

public class NullPointerExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("Start main mehtod");
		try {
		String s="Gouse";
		System.out.println(s.length());
		
		String s1=null;
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		
		}catch(NullPointerException e) {
			System.out.println(e);//java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
			
		}
		System.out.println("End main mehtod");
	}

}
