import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
	
	private String name;
	private int age;
	
	public User(String name, int age){
		
		this.name=name;
		this.age=age;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		
		this.age=age;
	}
	public int getAge() {
		return age;
	}
}
public class ArrayInput {
	
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		System.out.println("Enter how many users you want :");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the name and age of the users");
		String name; int id;
		for(int i=0;i<n;i++) {
			 
			name = sc.next();
			id=sc.nextInt();
			users.add(new User(name,id));
		}
		
		for(User user:users) {
			
			System.out.println("Name : "+user.getName()+"\t"+"Age : "+user.getAge());
			
		}
	}

}
