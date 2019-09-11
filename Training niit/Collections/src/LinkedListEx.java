import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can be used in situation when price keeps on updating and sequence remains same.
		LinkedList<String> friends = new LinkedList<>();
		
		friends.add("Rajeev");
		friends.add("Anupam");
		friends.add("Amit");
		friends.add("Sumit");
		friends.add("Shubham");
		
		System.out.println("Initial linked list : "+friends);
		
		friends.add(3,"Archit");
		System.out.println("After Insertion at (3,\"Lisa\") : "+friends);
		
		friends.addFirst("Steve");
		System.out.println("After Insertion at first (\"Steve\") : "+friends);
		
		friends.addLast("John");
		System.out.println("After Insertion at last (\"John\") : "+friends);
		
		List<String> familyfriends=new ArrayList<>();
		familyfriends.add("Jese");
		familyfriends.add("Walt");
		
		friends.addAll(familyfriends);
		System.out.println("After addAll(familyfriends) : "+friends);
		friends.remove(3);
		friends.get(3);
		System.out.println(friends);
		System.out.println(friends.get(3));
	}

}
