package exceptionhanding;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundExceptionEx1 {

	public static void main(String[] args)  {
		System.out.println("Start main mehtod");
		PrintWriter pw = null;
		//pw.write("json.txt");
		
		 try {
			pw = new PrintWriter("jtp.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //may throw exception   
         pw.println("saved");  
         System.out.println(pw);
		System.out.println("End main mehtod");

	}

}
