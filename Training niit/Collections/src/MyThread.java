
public class MyThread extends Thread {
	
	public void run() {
		
		int ctr = 0;
		for(int i=0;i<=10;i++) {
			System.out.println(ctr++);
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt1);
		t1.setName("Thread 1");
		t1.start();
		t2.setName("Thread 2");
		t2.start();
		System.out.println(Thread.currentThread());
	}

}
