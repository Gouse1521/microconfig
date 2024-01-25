package multithread;

public class MyThread1 {

	public static void main(String[] args) {
		// creating an object of the Thread class using the constructor Thread(String name)   
		Thread t= new Thread("My first thread");  
		// the start() method moves the thread to the active state  
		t.start();//run method not executing
		System.out.println(t.getName());//My first thread
	//	System.out.println(t.getName());
		

	}
public void run() {
		
		System.out.println("MyThread1 run method running..");
		
	}
//Can we start a thread twice
//No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.
}
