package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool1main {

	public static void main(String[] args) {
		//ExecutorService e1= Executors.newFixedThreadPool(6);
		ExecutorService e2= Executors.newCachedThreadPool();
		   for (int i = 0; i < 100; i++) {  
		Runnable r1=new Threadpool1();
		//e1.execute(r1);
		e2.execute(r1);
		   }
		//e1.shutdown();
		e2.shutdown();
		  boolean s1= e2.isShutdown();
		  boolean s2= e2.isTerminated();
		  System.out.println("isShutdown"+s1);
		  System.out.println("isTerminated"+s2);
		  
	}

}
