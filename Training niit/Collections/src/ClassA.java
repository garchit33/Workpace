
public class ClassA extends Thread{

	public void run() {
		
		int count = 0;
		for(int i=0;i<=10;i++) {
		System.out.println("Method A is Saying Hii..");
	}
	}
}

class ClassB extends Thread{

	public synchronized  void run() {
		
		int count = 0;
		for(int i=0;i<=10;i++) {
		System.out.println("Method B is Saying Hello..");
	}
	}
}

