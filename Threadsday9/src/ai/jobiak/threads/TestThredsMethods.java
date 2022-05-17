package ai.jobiak.threads;

import java.util.Scanner;


public class TestThredsMethods {

	public static void main(String[] args)throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		myThread t1 =new myThread("T1");
		t1.setPriority(Thread.MAX_PRIORITY);
		//IllegalThreadStateException
		myThread t2 = new myThread("T2");
		System.out.println("Starting Threads...");
		//String line= scanner.nextLine();
		t1.start();
		t2.start();
		//Thread.sleep(5000);
		System.out.println("started threads..");
		
		
		
		

		
		
		/*
		
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread());
		*/
	}

}
