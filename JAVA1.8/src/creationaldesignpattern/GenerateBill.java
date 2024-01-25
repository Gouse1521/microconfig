package creationaldesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		 GetPlanFactory planFactory = new GetPlanFactory();  
	        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	      Plan p=   planFactory.getPlan(planName);
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	      if(p==null) {
	    	  System.out.print("plan number is empty/null please reEnter the name of plan for which the bill will be generated: ");  
		      BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));  
		      String planName1=br1.readLine();  
		     // System.out.print("Enter the number of units for bill will be calculated: "); 
		       p=   planFactory.getPlan(planName1);
		      System.out.println("Plan Name :"+planName1+" And  units :"+units);  
		   
	      }
	       System.out.println("Plan Name :"+planName+" And  units :"+units);  
	       p.getRate();
           p.calculateBill(units);
	   
	   
	      
	}

}
