package arrayList;

import java.util.Comparator;

public class Employee implements Comparable {

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*
	 * @Override public int compare(Object o1, Object o2) { Employee
	 * e1=(Employee)o1; Employee e2=(Employee)o2;
	 * 
	 * String e1name=e1.name; String e2name=e2.name;
	 * 
	 * return e1name.compareTo(e2name); }
	 */
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		int i1=e.id;
		int i2=e.id;
		
		
		
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
