import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetEx2 {
	
	public static void main(String args[]) {
		
		List<Integer> NumberBy5 = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Total Number of Entries to be added : ");
//		int e = sc.nextInt();
		System.out.println("Enter the number divisible by 5 : ");
		for(int i=0;i<5;i++) {
			
			int n1= sc.nextInt();
			NumberBy5.add(n1);
		}
		List<Integer> NumberBy3 = new ArrayList<>();
		System.out.println("Enter the Number Divisible by 3 : ");
		for(int i=0;i<5;i++) {
			
			int n2 = sc.nextInt();
			NumberBy3.add(n2);
		}
		System.out.println("Number divisible by 5 and 3 are : ");
		Set<Integer> NumberBy5Or3 = new HashSet<>(NumberBy5);
		
		NumberBy5Or3.addAll(NumberBy3);
		System.out.println(NumberBy5Or3);
	}

}
