package programs_interview_practise_List;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_queue_using_linkedList {
	
	public static void main(String[] args) {
		
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println("Polled : " + queue.poll());
		System.out.println("Queue now : " + queue);
	}

}
