package exceptionhanding;

public class ExceptionHandlingEx2 {
	public static void main(String[] args) {
		System.out.println("Start Main Method");
		
		try {
	int data=100/0;
	System.out.println(data);
		}finally {
			
			System.out.println("Exception Handled");
		}
	
	System.out.println("End Main Method");
	}
}
