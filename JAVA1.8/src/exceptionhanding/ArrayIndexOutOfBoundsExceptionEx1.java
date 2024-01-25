package exceptionhanding;

public class ArrayIndexOutOfBoundsExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("Start main mehtod");
		try {

		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException  
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());//Index 10 out of bounds for length 5
			System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
			
		}
		System.out.println("End main mehtod");
	}

}
