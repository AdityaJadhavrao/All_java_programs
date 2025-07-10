package interview_programs_practise_Threads;

public class MainClass	 {

	
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		MyThread2 thread1 = new MyThread2();
		
		Thread3 obj = new Thread3();
		Thread t = new Thread(obj);
		
		Thread4 obj2 = new Thread4();
		Thread t1 = new Thread(obj2);
		
		thread.start();
		thread1.start();
		
		t.start();
		t1.start();
	}
}
