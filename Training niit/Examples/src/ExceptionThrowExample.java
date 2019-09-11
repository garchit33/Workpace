import java.util.Scanner;

public class ExceptionThrowExample {

	public static int Divide(int a, int b) 
	{
		
		try {
			if(b == 0) {
			
				throw new ArithmeticException("Not Valid Input");
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
	}
		return a/b;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println(Divide(a,b));
}
}
