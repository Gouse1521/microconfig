package arrays;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
	String[] st1=new String[10];
	 System.out.println(Arrays.toString(st1));
	 String[] st2= {"gouse","mayu","shaik"};
	 System.out.println(Arrays.toString(st2));
	 for(int i=0;i<st2.length;i++) {
		 System.out.println(st2[i]);
		 
	 }
	 st1[0]="vu";
	 st1[1]="samsung";
	 st1[2]="dabba";
	 System.out.println(Arrays.toString(st1));
	 System.out.println(st1.length);
	 for(int i=0;i<st1.length;i++) {
		 System.out.println(st1[i]);
		 
	 }
	 
	 for(String s:st2) {
		 
		 System.out.print(s+" ");
	 }
	}
	 
}
