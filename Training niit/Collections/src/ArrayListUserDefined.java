import java.util.ArrayList;
import java.util.List;

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
public class ArrayListUserDefined {

	public static void main(String args[]) {
		
		List<User> users = new ArrayList<>();
		users.add(new User("Archit",22));
		users.add(new User("Anubhav",21));
		users.add(new User("Sumit",23));
		users.add(new User("Rachit",25));
		users.add(new User("Anupam",28));
		
//		users.for(user -> {
//			System.out.println("Name : "+user.getName()+"\t"+"Age : "+user.getAge());
//			});
		
		for(User user:users) {
			System.out.println("Name : "+user.getName()+"\t"+"Age : "+user.getAge());
		}
	
	}
}
