import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx3 {
	
	public static void main(String args[]) {
		
		Map<String, Integer> ud=new HashMap<>();
		int n,i;
		int id;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of entries to be added:");
		n = sc.nextInt();
		System.out.println("Enter Entries");
		for(i=0;i<n;i++) {
			
			 name = sc.next();
			 id=sc.nextInt();
			 ud.put(name,id);
		}
		
		System.out.println("Keys of Map : "+ud.keySet());
		System.out.println("Values from Map : "+ud.values());
		System.out.println("Entries from Map : "+ud.entrySet());
	}

}
