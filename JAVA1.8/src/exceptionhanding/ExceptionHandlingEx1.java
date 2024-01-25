package exceptionhanding;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		System.out.println("Start Main Method");
		
		try {
	int data=100/0;
	System.out.println(data);
		}catch(Exception e){
			System.out.println(e);//java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage());/// by zero
			System.out.println(e.getStackTrace());//[Ljava.lang.StackTraceElement;@515f550a
			
		e.printStackTrace();//java.lang.ArithmeticException: / by zero
		//at exceptionhanding.ExceptionHandlingEx1.main(ExceptionHandlingEx1.java:9)
			
		}finally {
			
			System.out.println("Exception Handled");
		}
	
	System.out.println("End Main Method");
	}

}
