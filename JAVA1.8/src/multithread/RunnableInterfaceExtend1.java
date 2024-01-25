package multithread;

public class RunnableInterfaceExtend1 implements Runnable{

	public static void main(String[] args) {
		Runnable re1=new RunnableInterfaceExtend1();
		Thread t1= new Thread(re1,"My new thread");
		t1.setPriority(1);
		t1.start();//RunnableInterfaceExtend1 run method running..
		System.out.println(t1);
		Thread t2= new Thread(re1);
		t2.setPriority(10);
		t2.setName("GouseThread1");
		t2.start();
		System.out.println(t2);
		System.out.println(t2);
		System.out.println(t2.getName());
	}

	@Override
	public void run() {
		System.out.println("RunnableInterfaceExtend1 run method running..");
		
	}

}
