package ai.jobiak.threads;

import java.util.Scanner;


public class myThread extends Thread {

	String name;
	myThread(String name){
		this.name=name;
	}
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(this.name+"#entered run()="+i);
		}
		//System.out.println(this.currentThread().getName()+ "entered run()");
		
		try {
			sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
