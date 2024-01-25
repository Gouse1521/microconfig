package arrays;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {
		 System.out.println("Welcome Back:)");
		 
		 int [] intarray1=new int[10];
		 int intarray2 []=new int[10];
		 int intarray3 []=new int[] {1,2,3,4,5,6,7,8};
		 int intarray4 []={1,2,3,4,5,6,7,8};
		 System.out.println(intarray1);
		 System.out.println(intarray2);
		 System.out.println(intarray3);
		 System.out.println(Arrays.toString(intarray1));
		 System.out.println(Arrays.toString(intarray2));
		 System.out.println(Arrays.toString(intarray3));
		 for(int i=0;i<intarray3.length;i++) {
			 System.out.print(intarray3[i]+" ");
		 }
		 for(int in:intarray3) {
			 System.out.print(in);
		 }
		 Integer ii=1111111111;
		 intarray1[0]=ii;
		 System.out.println(Arrays.toString(intarray1));
	}

}
