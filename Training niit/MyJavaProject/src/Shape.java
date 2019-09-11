import java.util.Scanner;



public class Shape {

	/**
	 * @param args
	 */
	public double calArea1(double a, double b){
		
		double area;
		area = a*b;
		return area;
	}
	public static void main(String[] args) {
		
		
	/*	Rectangle r = new Rectangle();
		r.calArea();
	*/
		// TODO Auto-generated method stub
		Shape rec=new Shape();
		System.out.println("Enter the length and breadth : ");
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println(rec.calArea1(l, b));
	}

} 


