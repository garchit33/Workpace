
public class Encap_Employee {

	/**
	 * @param args
	 */
	
	
	public int id = 101;
	private double salary = 45000;
	protected String name = "Sushant";
	
	public static void main(String[] args) {
	
		Encap_Employee e1=new Encap_Employee();
		System.out.println(e1.id+" "+e1.salary+" "+e1.name);
		
		Secretary s = new Secretary();
		//s.display();
		Manager m = new Manager();
		m.managermethod();
		// TODO Auto-generated method stub

	}

}

class Secretary extends Encap_Employee{
	
	public void display()
	{
		System.out.println(id);
		//System.out.println(salary); 			declared private
		System.out.println(name);
	}
}
