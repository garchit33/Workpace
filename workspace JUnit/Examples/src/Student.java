
import java.util.List;
import java.util.Scanner;

class Student{
	
	private int id;
	private String Name;
	
	Student(int id, String name){
		this.Name = name;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	
	
}

