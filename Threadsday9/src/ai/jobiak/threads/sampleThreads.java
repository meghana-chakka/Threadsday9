package ai.jobiak.threads;



public class sampleThreads {

	public static void main(String[] args) {
		
		System.out.println("starting main.......");
		
		myThread t=new myThread("t");
		myThread t1=new myThread("t1");
		System.out.println(t.getName()+"has"+t.getPriority());
		
		
		
		//t.setDaemon(true);
		//t1.setDaemon(true);
		
		
		//t.run();
		
		//t1.run();
		t.start();
		t1.start();
		
		
		
		
		
		
		System.out.println("exiting main....");
		
		

	}

}
