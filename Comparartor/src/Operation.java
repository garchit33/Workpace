
public class Operation {
	
	int data =50;
	void change(int data)
	{
	this.data=data+100;
	 
	}
	public static void main(String args[])
	{
	Operation op=new Operation();
	System.out.println("Before change:"+op.data);
	//op.change(500);
	Test test=new Test();
	test.operation(op);
	System.out.println("After change:"+op.data);
	}

}
