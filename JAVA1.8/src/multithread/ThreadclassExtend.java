package multithread;

public class ThreadclassExtend extends Thread{

	public void run() {
		
		System.out.println("ThreadclassExtend run method running..");
		
	}
	public static void main(String[] args) {
		ThreadclassExtend tec=new ThreadclassExtend();
		tec.run();//normal execution//ThreadclassExtend run method running..
		tec.start();//ThreadclassExtend run method running..
	}

}
