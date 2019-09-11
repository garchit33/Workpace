import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students you want to add : ");
		int n = sc.nextInt();
		System.out.println("Enter the ID and Name of the Students : ");
		int i;
		for(i=0;i<n;i++) {
			
			String name;
			int  id;
			id = sc.nextInt();
			name = sc.next();
			l1.add(new Student(id,name));
		}
		
		for(Student stu:l1) {
			System.out.println("ID : "+stu.getId()+" "+"Name : "+stu.getName());
		}
	}
}
