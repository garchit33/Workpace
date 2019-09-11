package comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
		if(s1.getfName().compareTo(s2.getfName())==0) {
			if(s1.getAge()>s2.getAge()) {
				return +1;
			}
			else if(s1.getAge()<s2.getAge()) {
			return -1;
			}
			return 0;
		}
		
		return s1.getfName().compareTo(s2.getfName());
	}
	

}
