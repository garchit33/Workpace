import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String args[]) {
		
		List<Integer> NumberBy5 = new ArrayList<>();
		NumberBy5.add(5);
		NumberBy5.add(10);
		NumberBy5.add(15);
		NumberBy5.add(20);
		NumberBy5.add(25);
		
		List<Integer> NumberBy3 = new ArrayList<>();
		NumberBy3.add(3);
		NumberBy3.add(6);
		NumberBy3.add(9);
		NumberBy3.add(12);
		NumberBy3.add(15);
		
		
		Set<Integer> NumberBy5Or3 = new HashSet<>(NumberBy5);
		
		NumberBy5Or3.addAll(NumberBy3);
		System.out.println(NumberBy5Or3);
		
		
	}

}
