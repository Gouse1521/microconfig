package exceptionhanding;

public class NumberFormatExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("Start main mehtod");
		try {
		String s="abc";  
		int i=Integer.parseInt(s);//NumberFormatException 
		
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());//For input string: "abc"
			System.out.println(e);//java.lang.NumberFormatException: For input string: "abc"
			e.printStackTrace();//java.lang.NumberFormatException: For input string: "abc"
	//at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	//at java.base/java.lang.Integer.parseInt(Integer.java:668)
	//at java.base/java.lang.Integer.parseInt(Integer.java:786)
	//at exceptionhanding.NumberFormatExceptionEx1.main(NumberFormatExceptionEx1.java:9)
		}
		System.out.println("End main mehtod");

	}

}
