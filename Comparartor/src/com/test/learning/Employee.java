package com.test.learning;

public class Employee implements Comparable<Employee> {
	private int id;
	private int age;
	private String fName;
	private String lName;
	private String dept;
	
	public Employee(int id,String fName,String lName,String dept) {
		this.id=id;
		this.age=age;
		this.fName=fName;
		this.lName=lName;
		this.dept=dept;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public int compareTo(Employee emp) {
		if(this.fName.compareTo(emp.fName)>0) {
			return 1;
		}else if(this.fName.compareTo(emp.fName)<0) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
