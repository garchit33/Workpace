  
class TestGeneric<T> {

	T obj;
	TestGeneric(T ob){
		this.obj= ob;
	}
	public TestGeneric() {
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		
		System.out.println("This type of object is"+obj.getClass().getName());
	}
	public T getObj() {
		
		return obj;
	}
}

public class GenExample{
	
	public static void main(String[] args) {
		
		TestGeneric t1 = new TestGeneric();
		TestGeneric<TestGeneric> tg = new TestGeneric(t1);
		tg.display();
		System.out.println(tg.getObj());
		TestGeneric<String> tg1=new TestGeneric<String>("Hello");
		  tg1.display();
		System.out.println(tg1.getObj());
		TestGeneric<Integer> tg2 = new TestGeneric<Integer>(12);
		tg2.display();
		System.out.println(tg2.getObj());
		TestGeneric<Double> tg3 = new TestGeneric<Double>(2.3);
		tg3.display();
		System.out.println(tg3.getObj());
		
	}
}