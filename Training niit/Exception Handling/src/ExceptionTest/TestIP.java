package ExceptionTest;

class InvalidIpException extends Exception{
	
	public InvalidIpException(String s) {
	super(s);
	}
}
public class TestIP {
	
	static void validate(String str) throws InvalidIpException
	{
		if(str.equals("192.168.2.2"))
			System.out.println("You are connected");
		else
			throw new InvalidIpException("Invalid IP address");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate("192.168.2.2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured: "+e);
		}
		
		
	}

}
