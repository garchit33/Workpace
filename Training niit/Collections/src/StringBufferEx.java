
public class StringBufferEx {

	
	public static void main(String[] args) {
		
		//First way of declaration
		StringBuffer sb = new StringBuffer("This is sample string buffer");
		System.out.println(sb);
		
		//Second way of declaration
		StringBuffer sb1= new StringBuffer();
		sb1.insert(0, "Hello ");
		sb1.append(sb);
		System.out.println(sb1);
		
		int n=sb1.indexOf("is");
		System.out.println(n);
		int a = sb1.lastIndexOf("is");
		System.out.println(a);
		System.out.println(sb1.reverse());
		
		StringBuilder sbb = new StringBuilder(" Hello Guys");
		System.out.println(sbb);
		
		StringBuilder sbb1 = new StringBuilder("Hello");
		sbb1.insert(1, "Java");
		sbb1.append(sbb);
		System.out.println(sbb1);
		
	}
}
