package com.test.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("THis is inside main...."+Thread.currentThread().getName());
		System.out.println("Executor service is getting created : ");
		ExecutorService exservice = Executors.newSingleThreadExecutor();
//		ExecutorService exservice = Executors.newSingleThreadScheduledExecutor();
//		ExecutorService exservice = Executors.newCachedThreadPool();  //assigns new thread if one thread is busy or reuse the same thread if available.
//		ExecutorService exservice = Executors.newFixedThreadPool(10);
		System.out.println("Creating a Runnable..");
		Runnable runn = new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is inside runnable...."+Thread.currentThread().getName());
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
			
		};
		
		System.out.println("Now Submitting the runnable object....");
		exservice.submit(runn);
		exservice.submit(runn);
		exservice.submit(runn);
		exservice.submit(runn);
		exservice.shutdown();
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This is after excecutor submit...."+Thread.currentThread().getName());
	}

}
