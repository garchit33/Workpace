
public class Aeroplane implements FlyingObject,FlyingVehicle{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aeroplane a = new Aeroplane();
		a.wings();
		a.Fly();
		// TODO Auto-generated method stub

	}

	public void wings() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane has 2 wings");
		
	}

	public void Fly() {
		
		System.out.println("Aeroplane flies high");
		// TODO Auto-generated method stub
		
	}

}
