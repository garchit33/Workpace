package CloneObject;

class Student implements Cloneable{
	
	int id;
	String name;
	public Student(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	public void GetDetails()
	{
		System.out.println("Id : "+id+"\n"+"Name : "+name);
	}

	public Object StudentCloning() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
}
public class StudentClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1019, "Madrasan");
		System.out.println("The Original Object of Student is : ");
		s1.GetDetails();
		
		try
		{
			Student s2 = (Student) s1.StudentCloning();
			System.out.println("The oject is Cloned..");
			System.out.println("The Cloned Object of Student is : ");
			s2.GetDetails();
			System.out.println("The details of s1"+s1+"\n"+"The Details of s2"+s2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
