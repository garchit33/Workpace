
public class CalArea {
	
	public void Area(int l, int b) {
		
		System.out.println("Area of rectangle is : "+l*b);
	}
	
	public void Area(double h, double b) {
		
		System.out.println("Area of Triangle is : "+(0.5*h*b));
	}
	
	public void Area(double r) {
		
		System.out.println("Area of circle is : "+(3.14*r*r)
				);
	}
	
	public static void main(String[] args) {
		
		CalArea c=new CalArea();
		c.Area(5);
		c.Area(10,10);
		c.Area(8.0,8.0);
	}

}
