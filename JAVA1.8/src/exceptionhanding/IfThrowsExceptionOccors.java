package exceptionhanding;

import java.io.IOException;

class Md{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	class IfThrowsExceptionOccors{  
	   public static void main(String args[])throws IOException{//declare exception  
	     Md m=new Md();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  
