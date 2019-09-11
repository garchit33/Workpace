import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Customer{
	
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this==o)
			return true;
		if(o==null || getClass()!=o.getClass())
			return false;
		Customer customer = (Customer) o;
		return id == customer.id;
		
	}
	
	@Override
	public int hashCode(){
		
		//System.out.println(Objects.hash(id));
		return Objects.hash(id);
		//return 0;
		
	}
	
	public String toString() {
		
		return "Customer{id = "+id+"Name"+name+"}";
	}
}

public class HashSetUserDefined1 {
	
	public static void main(String args[]) {
	
	Set<Customer> cus = new HashSet<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Entries you want to add : ");
	int n = sc.nextInt();
	String name; int id;
	System.out.println("Enter "+n+" Entries : ");
	for(int i=0;i<n;i++) {
		
		id= sc.nextInt();
		name = sc.next();
		cus.add(new Customer(id,name));
		}
	
	for(Customer Customer:cus) {
		System.out.println("ID : "+Customer.getId()+" Name : "+Customer.getName());
		//System.out.println(cus.hashCode());
	}

	}
}
