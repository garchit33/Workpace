import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1 = new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println(v1.size());
		v1.remove(2);					//value is given as argument.
		System.out.println(v1.size());
		
		ArrayList l1 = new ArrayList<>();
		System.out.println(l1.size());
		l1.add(22);
		l1.add(22);
		l1.add(22);
		l1.add(22);
		l1.add(22);
		System.out.println(l1.size());
		l1.remove(3);					//index is given as argument.
		System.out.println(l1.size());
	}

}

