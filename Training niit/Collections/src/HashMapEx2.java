import java.util.*;
import java.util.Map.Entry;
public class HashMapEx2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> pm=new HashMap<>();
		pm.put("TV",500);
		pm.put("Phone",200);
		pm.put("Car",20000);
		pm.put("Bike", 70000);
		pm.put("Farmhouse",8000);
		
		System.out.println("Price Map "+pm);
		
//		Set<String> keys = pm.keySet();
//		Collection<Integer> values = pm.values();
//		Set<Entry<String, Integer>> entries= pm.entrySet();
//		System.out.println("Keys of Map : "+keys);
//		System.out.println("Values from Map : "+values);
//		System.out.println("Entries from Map : "+entries);
		System.out.println("Keys of Map : "+pm.keySet());
		System.out.println("Values from Map : "+pm.values());
		System.out.println("Entries from Map : "+pm.entrySet());
	}

}
