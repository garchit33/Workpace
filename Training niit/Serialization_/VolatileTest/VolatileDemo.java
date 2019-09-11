package VolatileTest;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {

	public static void main(String[] args)
	{
		Data d = new Data();
		
		ExecutorService exservice = Executors.newFixedThreadPool(5);
		exservice.execute(new MyTask(d));
		exservice.execute(new MyTask(d));
		exservice.execute(new MyTask(d));
		exservice.execute(new MyTask(d));
		exservice.execute(new MyTask(d));
		
	}
}
 