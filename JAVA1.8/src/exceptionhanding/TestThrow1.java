package exceptionhanding;

public class TestThrow1 {

	public static void validate(int age) {//throws Exception {
		
		if(age<18) {
			//System.out.println("Not Eligible to vote");//Not Eligible to vote
			//throw new Exception("Not Eligible to vote");//Exception in thread "main" java.lang.Exception: Not Eligible to vote
			//at exceptionhanding.TestThrow1.validate(TestThrow1.java:9)
		//	at exceptionhanding.TestThrow1.main(TestThrow1.java:18)
			throw new ArithmeticException("Not Eligible to vote");
			//Exception in thread "main" java.lang.ArithmeticException: Not Eligible to vote
			//at exceptionhanding.TestThrow1.validate(TestThrow1.java:12)
			//at exceptionhanding.TestThrow1.main(TestThrow1.java:21)
		}else {
			System.out.println("Eligible to vote");
			
		}
		
	}
	public static void main(String[] args) { //throws Exception {
	
		validate(10);
		
		System.out.println("main end");//not executed
	}

}
