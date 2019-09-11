import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<>();
		Employee emp1 = new Employee(1,34,"Archit","Garg","DBS");
		Employee emp2 = new Employee(2,36,"Anupam","Singh","Java");
		Employee emp3 = new Employee(3,33,"Rishabh","Garg","Cloud");
		Employee emp4 = new Employee(4,31,"Saksham","Garg","IMS");
		Employee emp5 = new Employee(5,30,"Yash","Garg","SQL");
		
		List<String> lst = Arrays.asList("Archit","Anupam","Rishabh","Saksham","Yash");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		for(String str:lst) {
			
			System.out.println(str);
		}
		
	
	
	
	
	
	
	
	
	`}

}
