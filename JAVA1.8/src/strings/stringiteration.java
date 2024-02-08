package strings;

public class stringiteration {

	public static void main(String[] args) {
	String s1="shaik gouse";
	//by using length method
	for(int i=0;i<s1.length();i++) {
	System.out.println(s1.charAt(i));
		
	}
	//by using for loop
	
	for(char c:s1.toCharArray()) {
		System.out.println(c);
		
	}
	
	}

}
