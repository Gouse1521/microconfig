package exceptionhanding;

import java.io.IOException;

class Ms{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	}  
	class TestThrows2{  
	   public static void main(String args[])throws IOException{//declare exception  
	     Ms m=new Ms();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  