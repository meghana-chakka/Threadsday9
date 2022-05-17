package ai.jobiak.threads;

public class TestThreadRunnable {

	public static void main(String[] args) {
		System.out.println("staring main,,,,,,");
		
		ThreadRunnable runnable=new ThreadRunnable();
		Thread t1=new Thread(runnable);
		Thread t2= new Thread(runnable);
		
		
		t1.start();
		t2.start();
		
		
		System.out.println("Exiting main.,,,,,");
	
	
	
	
	}

}
