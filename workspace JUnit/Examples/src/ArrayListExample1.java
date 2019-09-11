import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Archit");
		list.add("Anupam");
		list.add("Sumit");
		list.add("Prince");
		list.add("Rishabh");
		
//		Iterator itr = list.iterator();
//		System.out.println("The list of Students is : ");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		Enumeration<String> l = Collections.enumeration(list);
		while(l.hasMoreElements()) {
			System.out.println(l.nextElement());
		}
		
		list.remove(3);
		System.out.println(list);

	}

}
