package comparator;

import java.util.Comparator;

public class Student  {

	private int age;
	private String fName;
	
	public Student(int age, String fName) {
		
		this.age=age;
		this.fName=fName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}


	
}