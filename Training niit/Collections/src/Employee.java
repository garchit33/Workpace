
public class Employee {
	
	private int id;
	private int age;
	private String FName;
	private String lName;
	private String dept;
	
	
	public Employee(int id,int age,String FName,String lName,String dept) {
		
		this.id=id;
		this.FName=FName;
		this.age=age;
		this.lName=lName;
		this.dept=dept;
	}
	
	public void setId(int id) {
		
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	public void setFName(String FName) {
		
		this.FName=FName;
	}
	
	public String getFName() {
		return FName;
	}
	
	public void setlName(String lName) {
		
		this.lName=lName;
	}
	
	public String getlName() {
		return lName;
	}
	public void setdept(String dept) {
		
		this.dept=dept;
	}
	
	public String getdept() {
		return dept;
	}
	
}
