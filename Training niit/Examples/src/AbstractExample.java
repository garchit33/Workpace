import java.util.Scanner;

abstract class Shape{
	
	abstract int Square(int a);
	abstract int Rectangle(int a, int b );
	int triangle(int b, int h) {
		
		return (int) (0.5*b*h);
	}
	
	
}

class CalArea extends Shape{

	@Override
	int Square(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	int Rectangle(int a,int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	
}
public class AbstractExample {
	
	public static void main(String args[]) {
		
	CalArea ca = new CalArea();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length and breadth of rectangle : ");
	int l = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Area of Rectangle is : "+ca.Rectangle(l, b));
	System.out.println("Enter the side of Square");
	int s = sc.nextInt();
	System.out.println("Area of Square is : "+ca.Square(s));
	System.out.println("Area of Triangle is : "+ca.triangle(10,10));
	}

}
