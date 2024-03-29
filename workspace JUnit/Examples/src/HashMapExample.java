import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String args[]) {
	
		Map<Integer, Student> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Students to be added : ");
		int n = sc.nextInt();
		int i;
		System.out.println("Enter the Key, ID and name of the students: ");
		for(i =0;i<n;i++) {
			int id;
			String name;
			hm.put(sc.nextInt(),new Student(sc.nextInt(),sc.next()));
		}
		
	Iterator<Map.Entry<Integer, Student>> itr = hm.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<Integer, Student> map = itr.next();
		System.out.println("Key : "+map.getKey()+" "+"Value : "+map.getValue());
	}
	}
	
}
