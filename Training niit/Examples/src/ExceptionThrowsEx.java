
public class ExceptionThrowsEx {
	
	public static int Divide(int a) throws ArithmeticException
	{
		return a;
	}
	public static void main(String args[]) {
		
		try {
			
			System.out.println(Divide(10/0));
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
}
