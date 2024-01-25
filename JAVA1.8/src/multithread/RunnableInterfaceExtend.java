package multithread;

public class RunnableInterfaceExtend implements Runnable{

	public static void main(String[] args) {
		RunnableInterfaceExtend rie= new RunnableInterfaceExtend();
		Thread t1= new Thread(rie);
		t1.start();//RunnableInterfaceExtend run method running..
	//	t1.stop();

	}

	@Override
	public void run() {
		System.out.println("RunnableInterfaceExtend run method running..");
		
	}

}
