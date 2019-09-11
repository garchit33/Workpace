import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> FivePrimeNo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers : ");
		for(int i = 0;i<5;i++) {
			
			FivePrimeNo.add(sc.nextInt());
		}
		
		Iterator itr = FivePrimeNo.iterator();
		System.out.println(FivePrimeNo.get(3));
		System.out.println(FivePrimeNo);
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
//		
	}

}
