import java.util.Scanner;

interface S {
	
	public int Rectangle(int l, int b);
	public int Square(int a);
	
	default double triangle(double base, double height){
		return (0.5*base*height);
		
	}
	

}
class CalArea1 implements S{

	@Override
	public int Rectangle(int l, int b) {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public int Square(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}
	
}
public class Result{
	
	public static void main(String args[]) {
		CalArea1 ca = new CalArea1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area of Rectangle is : "+ca.Rectangle(l, b));
		System.out.println("Enter the side of Square");
		int s = sc.nextInt();
		System.out.println("Area of Square is : "+ca.Square(s));
		System.out.println("Enter the base of triangle : ");
		double base = sc.nextDouble();
		System.out.println("Enter the height of triangle : ");
		double height = sc.nextDouble();
		System.out.println("Area of Triangle is : "+ca.triangle(base,height));
	}
}