package arrays;

import java.util.Arrays;

public class StringExample{  
public static void main(String args[]){  
String s1="java";  
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);  
String s3=new String("example");  
System.out.println(ch);  
System.out.println(s1);  

System.out.println(s2);  
System.out.println(s3);  
String[] st2= {"gouse","mayu","shaik"};
System.out.println(st2);
System.out.println(Arrays.toString(st2));

String s="Sachin";  
String s7="pachin"; 
s.concat(" Tendulkar");//concat() method appends the string at the end  
System.out.println(s);//will print Sachin because strings are immutable objects 
s7=s7.concat(" Tendulkar");
System.out.println(s7);
String s11="Sachin";  
String s22="SACHIN";  

System.out.println(s11.equals(s22));
System.out.println(s11.equalsIgnoreCase(s22));//false  
System.out.println(s11==s22);
StringBuilder s12 = new StringBuilder("Hello");    //String 1  
StringBuilder s21 = new StringBuilder(" World");    //String 2  
StringBuilder s111 = s12.append(s21);   //String 3 to store the result  
    System.out.println(s111.toString()); 
    System.out.println(s12);//Displays result  
    String s222="SachinTendulkar";    
    System.out.println("Original String: " + s222);  
    System.out.println("Substring starting from index 6: " +s222.substring(6));//Tendulkar    
    System.out.println("Substring starting from index 0 to 6: "+s222.substring(0,6)); //Sachin  
    String str = "apple";
	StringBuffer stringBuffer = new StringBuffer("apple");
	/*
	 * stringBuffer.append('a'); stringBuffer.append('p'); stringBuffer.append('p');
	 * stringBuffer.append('l'); stringBuffer.append('e');
	 */
	
	boolean result = str.contentEquals(stringBuffer);
	System.out.println("Does str and stringBuffer have same content? " + result);
}}  

