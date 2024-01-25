package arrays;

import java.util.Arrays;

//Java program to illustrate creating
//an array of objects

class Student
{
	
	public String name;
	Student(String name)
	{
		this.name = name;
	}
	
	//  @Override public String toString(){ return name; }
	 
}

//Elements of the array are objects of a class Student.
public class GFF
{
	public static void main (String[] args)
	{
		// declares an Array and initializing the elements of the array
		Student[] myStudents = new Student[]{new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
		System.out.println(Arrays.toString(myStudents));
		// accessing the elements of the specified array
		for(Student m:myStudents){ 
			System.out.println(m);
		}
		
		for(int i=0;i<myStudents.length;i++) {
			
			System.out.println(myStudents[i]);
		}
	}
}
