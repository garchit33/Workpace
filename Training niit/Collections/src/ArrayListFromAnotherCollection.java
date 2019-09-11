import java.util.ArrayList;
import java.util.List;

public class ArrayListFromAnotherCollection {
	
	public static void main(String[] args) {
		List<Integer> FirstFivePrimeNumbers= new ArrayList<>();
		
		FirstFivePrimeNumbers.add(2);
		FirstFivePrimeNumbers.add(3);
		FirstFivePrimeNumbers.add(5);
		FirstFivePrimeNumbers.add(7);
		FirstFivePrimeNumbers.add(11);
		
		List<Integer> FirstTenPrimeNumbers = new ArrayList<>(FirstFivePrimeNumbers);
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		FirstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(FirstTenPrimeNumbers);
	}

}
