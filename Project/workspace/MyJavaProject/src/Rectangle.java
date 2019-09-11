import java.util.Scanner;


public class Rectangle {

public void calArea(){
		
		float l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Rectangle : ");
		l= sc.nextFloat();
		System.out.print("Enter the breadth of Rectangle : ");
		b = sc.nextFloat();
		
		area = l*b;
		System.out.println("Area of Rectangle is : "+area);
		
	}
}
