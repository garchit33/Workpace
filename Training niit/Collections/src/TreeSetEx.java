import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String args[]) {

//		SortedSet<String> fruits=new TreeSet<>(Comparator.reverseOrder());
//		
//		The abhove TreeSet is the concise form of the following:
//			
//		SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				return s2.compareTo(s1);
//			}
//			
//			
//		});

		SortedSet<String> fruits = new TreeSet<>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Mango");

		System.out.println("Sorted set : " + fruits);

		fruits.add("Banana");
		System.out.println("After Adding duplicate value \"Banana\" : " + fruits);

		fruits.add("banana");
		System.out.println("After Adding duplicate value \"banana\" : " + fruits);

	}
}

// difference between comparable and comparator interface.
