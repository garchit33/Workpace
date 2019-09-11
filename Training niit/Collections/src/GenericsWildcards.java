import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	public static double sum(List<? extends Number> list) {
		
		double sum = 0;
		for(Number n:list ) {
			
			sum += n.doubleValue();
		}
		return sum;
	}									
	
	public static void main(String args[]) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(10);
		ints.add(20);
		ints.add(30);
																		//Output - 60.0
		double sum = sum(ints);
		System.out.println(sum);
	} 
}

//import java.util.ArrayList;
//import java.util.List;
//
//public class GenericsWildcards {
//
//	public static int sum(List<? extends Integer> list) {
//		
//		int sum = 0;
//		for(Number n:list ) {
//			
//			sum += n.intValue();
//		}
//		return sum;
//	}
//	
//	public static void main(String args[]) {
//		
//		List<Integer> ints = new ArrayList<>();
//		ints.add(10);
//		ints.add(20);
//		ints.add(30);												//Output - 60
//		
//		int sum = sum(ints);
//		System.out.println(sum);
//	} 
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class GenericsWildcards {
//
//	public static double sum(List<? extends Number> list) {
//		
//		double sum = 0;
//		for(Number n:list ) {
//			
//			sum += n.doubleValue();
//		}
//		return sum;
//	}
//	
//	public static void main(String args[]) {
//		
//		List<Double> ints = new ArrayList<>();
//		ints.add(10.1);
//		ints.add(20.2);											//Output - 60.59
//		ints.add(30.3);
//		
//		double sum = sum(ints);
//		System.out.println(sum);
//	} 
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class GenericsWildcards {
//
//	public static int sum(List<? extends Number> list) {
//		
//		int sum = 0;
//		for(Number n:list ) {
//			
//			sum += n.doubleValue();
//		}
//		return sum;
//	}
//	
//	public static void main(String args[]) {
//		
//		List<Double> ints = new ArrayList<>();
//		ints.add(10.1);
//		ints.add(20.2);											//Output - 60.0
//		ints.add(30.3);
//		
//		double sum = sum(ints);
//		System.out.println(sum);
//	} 
//}

