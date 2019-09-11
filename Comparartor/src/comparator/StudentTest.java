package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> lst = new ArrayList<>();
		Student s1 = new Student(23, "Archit");
		Student s2 = new Student(22, "Paul");
		Student s3 = new Student(29, "Radha");
		Student s4 = new Student(19, "Asad");
		
//		IDComparator cmp = new IDComparator();
		NameComparator nc = new NameComparator();
		
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		System.out.println("Sorting :");
		Collections.sort(lst,nc);
		for(Student st:lst) {
			System.out.println("Age : "+st.getAge());
			System.out.println("Name : "+st.getfName());
		}
		/*System.out.println("Sorting by Name :");
		Collections.sort(lst,nc);
		for(Student st:lst) {
			System.out.println("Age : "+st.getAge());
			System.out.println("Name : "+st.getfName());
		}*/
		
		

	}

}
