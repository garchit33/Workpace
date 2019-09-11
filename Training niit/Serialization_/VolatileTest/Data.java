package VolatileTest;

public class Data {
	
	public volatile int counter = 0;
	public int getCounter()
	{
		return counter;
	}
	public void countIncrement()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		++counter;
	}
}

class MyTask implements Runnable{

	private Data d;
	
	
	public MyTask(Data d)
	{
		
		this.d = d;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Value Thread : "+Thread.currentThread().getName() + "Before Increment : " + d.getCounter());
		d.countIncrement();
		System.out.println("Value Thread : "+Thread.currentThread().getName() + "After Increment : " + d.getCounter());
	}
	
}
