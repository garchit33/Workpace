class Emp{
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
public class GetPropertyClass {
	
	
	public static void main(String[] args) {
		
		Emp e = new Emp();
		e.setId(1);
		e.setName("Archit");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
	
}
