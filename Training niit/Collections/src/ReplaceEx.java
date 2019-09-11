
public class ReplaceEx {

	public static void main(String[] args) {
	Student s1 = new Student("Archit", 20);
	Student s2 = new Student("Naman", 22);
	Replace(s1,s2);
	System.out.println(s1.getName()+" "+s2.getName());
	
	
	}
	
	public static void Replace(Student s1, Student s2) {
		
		Student temp;
		temp = s1;
		s1=s2;
		s2=temp;
//		System.out.println(s1.getName()+" "+s2.getName());
	}
}
 