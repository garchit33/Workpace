import java.util.Arrays;
import java.util.List;

public class SUVExample {

	public static void main(String args[]) {
		
		//Below is Lower Bound Integer List.
		List<Integer> list1 = Arrays.asList(45,0,2,3);
		printSuperClass(list1);
		
		List<Number> list2 = Arrays.asList(4,3,5,6,7);
		printSuperClass(list2);
		
//		List<Double> list3 = Arrays.asList(4.0,3.8,5.3,6.0,7.0);
//		printSuperClass(list3);
		
//		List<Float> list4 = Arrays.asList(4.0f,3.8f,5.3f,6.0f,7.0f);
//		printSuperClass(list4);
	}

	private static void printSuperClass(List<? super Integer> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
	}
}
