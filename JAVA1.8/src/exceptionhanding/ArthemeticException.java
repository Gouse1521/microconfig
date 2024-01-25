package exceptionhanding;

public class ArthemeticException {

	public static void main(String[] args) {//throws ArithmeticException {
System.out.println("Start main mehtod");
try
{
	int i=15/0;
	
	
}catch(Exception e) {
	System.out.println(e.getMessage());//  / by zero
	System.out.println(e);//java.lang.ArithmeticException: / by zero
	
}
System.out.println("End main");

	}

}
