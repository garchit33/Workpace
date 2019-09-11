class threadRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++){
			System.out.println("Child Thread");
		}
		System.out.println("Inside Child Thread "+Thread.currentThread().getName());
		Thread.currentThread().setName("Java Thread");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread());
	}
	
}
public class testRunnable {
	
	public static void main(String[] args) {
		
		threadRunnable tr = new threadRunnable();
		Thread t1 = new Thread(tr);
		t1.start();
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<20;i++) {
			System.out.println("Main Thread");
		}
		System.out.println(t1.getName());
		Thread.currentThread().setName("My Name");
		System.out.println(Thread.currentThread().getName());
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {}
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
	}

}
