import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1 = new Stack();
		s1.push(12);
		s1.push(13);
		s1.push(14);
		s1.push(15);
		
		System.out.println("Before removing : "+s1);
		s1.pop();
		System.out.println("After Removing : "+s1);
		

	}

}
