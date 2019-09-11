import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapEx {
	
	public static void main(String args[]) {

		int n,i;
		//String name; 
		LinkedHashMap<Integer,Student> si = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries you want to add : ");
		n=sc.nextInt();
		System.out.println("Enter the Entries");
		for(i=0;i<n;i++) {
			
			//name=sc.next();
			//age=sc.nextInt();
			si.put(sc.nextInt(),(new Student(sc.next(),sc.nextInt())));
		}
		
		Iterator <Map.Entry<Integer, Student>> itr = si.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Student> l= itr.next();
			System.out.println("Key = "+l.getKey()+" "+ "Value = "+l.getValue());
		}
		
	}

}