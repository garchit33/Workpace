package com.test.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService exservice = Executors.newScheduledThreadPool(1)
				;
		System.out.println("Creating Runnable..");
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Excuting Task 1 Thread at..."+System.nanoTime());
				System.out.println(Thread.currentThread().getName());
				
			}
		};
	Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Excuting Task 2 Thread at..."+System.nanoTime());
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		System.out.println("Submitting Task at..."+System.nanoTime()+" will execute after 5 Seconds");
		exservice.schedule(task1, 5, TimeUnit.SECONDS);
		exservice.schedule(task2, 5, TimeUnit.SECONDS);
		System.out.println(Thread.currentThread().getName());
		exservice.shutdown();
		System.out.println("After ShutDown : "+Thread.currentThread().getName());
	}

}
