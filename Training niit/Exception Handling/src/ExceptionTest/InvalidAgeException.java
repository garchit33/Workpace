package ExceptionTest;

public class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
	public static class testCustom{
		
		static void validate(int age) throws InvalidAgeException
		{
			if(age <= 18) {
				throw new InvalidAgeException("Not Valid");
			}
			else
				System.out.println("You can Vote");
		}
		
		public static void main(String args[]) {
			
			try {
				validate(14);
				
			}
			catch(Exception e) {
				System.out.println("Exception : "+e);
			}
		}
	}

}
