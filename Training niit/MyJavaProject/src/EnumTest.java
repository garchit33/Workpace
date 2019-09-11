

public class EnumTest {
	
public enum Rainbowcolor{
		
		violet,Indigo,Blue,Green,Yellow,Red,orange
	}
	
	
	Rainbowcolor rcolor;
	
		public EnumTest(Rainbowcolor rcolor) {
		this.rcolor=rcolor;
		}
		public void getRainbowColour() {
		
		switch(rcolor) {
		
		case violet: System.out.println("Color is Red");
					break;
		
		case Indigo: System.out.println("Color is Indigo");
					break;

		case Blue: System.out.println("Color is Blue");
					break;

		case Green: System.out.println("Color is Green");
					break;

		case Yellow: System.out.println("Color is Yellow");
					break;

		case orange: System.out.println("Color is Orange");					
		break;
					
		default: 
		System.out.println("Not Valid");

		}
	}

	public static void main(String[] args) {
		
			EnumTest et=new EnumTest(Rainbowcolor.Blue);
			System.out.println(et.rcolor);
			et.getRainbowColour();

	}

}
