import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Queue<String> waitingQueue = new LinkedList<>();
		waitingQueue.add("Rajeev");
		waitingQueue.add("Sumit");
		waitingQueue.add("Anupam");
		waitingQueue.add("Shubham");
		waitingQueue.add("Mark");
		
		System.out.println("Waiting Queue : "+waitingQueue);
		
		//Removing an element from the queue using remove() (The Dequeue Operation)
		//The remove() method throws NoSuchElementException if queue is empty.
	try {	
			name = waitingQueue.remove();
			System.out.println("Removed from Waiting Queue : "+name+" |New Waiting queue : "+waitingQueue);
	
	}catch(NoSuchElementException e) {
		
		System.out.println("Please enter the elements in queue, Queue is empty.");
	}
		//The poll() method is similar to remove() except that it returns null if queue is empty.
		name = waitingQueue.poll();
		System.out.println("Removed from Waiting Queue : "+name+" |New Waiting queue : "+waitingQueue);
	}

}
