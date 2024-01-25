package multithread;

public class Threadpool1 implements Runnable{
 static int i=1;
	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());
		 System.out.println("Gouse");
		i++;
		 System.out.println(i);
	}

}
