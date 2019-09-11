import java.util.*;

public class HashMapEx1 {

	public static void main(String args[]) {
		
		Map<String ,Integer> numberMapping = new HashMap<>();
		
		//Adding key values pairs to the HashMap
		
		numberMapping.put("One",1);
		numberMapping.put("Two",2);
		numberMapping.put("three",3);
		numberMapping.put("Four",null);
		//numberMapping.put("Four",null);
		
		System.out.println(numberMapping);
		
	}
}
