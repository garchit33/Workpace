
public class TestSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA ca1 = new ClassA(); 
		Thread t1 = new Thread(ca1);
		
		ClassB ca2 = new ClassB();
		Thread t2 = new Thread(ca2);
		t1.start();
		t2.start();
	}

}
