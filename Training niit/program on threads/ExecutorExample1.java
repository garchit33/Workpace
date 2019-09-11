package com.test.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample1 {

	public static void main(String args[])
	{
		System.out.println("This is inside main..."+Thread.currentThread().getName());
		System.out.println("Creating Thread Pool of Size 2....");
		ExecutorService exservice = Executors.newFixedThreadPool(3);
		System.out.println("Creating Runnable..");
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is Task 1 Thread..."+Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is Task 2 Thread..."+Thread.currentThread().getName());
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable task3 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is Task 3 Thread..."+Thread.currentThread().getName());
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable task4 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is Task 4 Thread..."+Thread.currentThread().getName());
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		exservice.submit(task1);
		exservice.submit(task2);
		exservice.submit(task3);
		exservice.submit(task4);
	}
}
