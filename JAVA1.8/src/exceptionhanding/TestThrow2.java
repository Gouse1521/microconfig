package exceptionhanding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {
	  //function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {  
  //try {
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
 // }catch(Exception e){//
        throw new FileNotFoundException();  //java.io.FileNotFoundException
       // rest of the code...
    	//at exceptionhanding.TestThrow2.method(TestThrow2.java:15)
    	//at exceptionhanding.TestThrow2.main(TestThrow2.java:22)
  //}
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
        	System.out.println(e);//java.io.FileNotFoundException: C:\Users\Anurati\Desktop\abc.txt (The system cannot find the path specified)
        	//rest of the code...

           // e.printStackTrace();  ///java.io.FileNotFoundException: C:\Users\Anurati\Desktop\abc.txt (The system cannot find the path specified)
        	//at java.base/java.io.FileInputStream.open0(Native Method)
        	//at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        	//at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        	//at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        	//at java.base/java.io.FileReader.<init>(FileReader.java:60)
        	//at exceptionhanding.TestThrow2.method(TestThrow2.java:11)
        	//at exceptionhanding.TestThrow2.main(TestThrow2.java:25)
       // rest of the code...

        }  
        System.out.println("rest of the code...");    
  }    
}
