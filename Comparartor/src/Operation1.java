
public class Operation1 {

	int data =50;
	void change(Operation op)
	{
	op.data=op.data+100;

	}
	public static void main(String args[])
	{
	Operation op=new Operation();
	System.out.println("Before change:"+op.data);
	op.change(op);
	System.out.println("After change:"+op.data);
	}
}