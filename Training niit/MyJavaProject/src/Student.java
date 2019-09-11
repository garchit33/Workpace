
public class Student {

	/**
	 * @param args
	 */
	int stid;
	String name;
	
	public Student(){
		
		System.out.println("First Constructor");
	}
	public Student(int st, String name){
		
		this.stid=st;
		this.name=name;
		//System.out.println(st);
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Archit");
		Student s2 = new Student(12,"Garg");
		System.out.println(s1.stid+" "+s1.name);
		//System.out.println(s1.name);
		System.out.println(s2.stid+" "+s2.name);
		//System.out.println(s2.name);
		// TODO Auto-generated method stub

	}

}
//hiding important details of the object which is irrelevant to user is ENCAPSULATION.
//showing the important details which are relevant to the user is ABSTRACTION.