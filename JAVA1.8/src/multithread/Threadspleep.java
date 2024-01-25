package multithread;

public class Threadspleep extends Thread{
	public void run(){    
		  for(int i=1;i<50;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try{Thread.sleep(500);
		    }catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }    
		    System.out.println(i);    
		  }    
		 }    
	public static void main(String[] args) {
		Threadspleep t1=new Threadspleep();    
		Threadspleep t2=new Threadspleep();    
		     t1.setPriority(MIN_PRIORITY);
		  t1.start();    
		  t2.start();    

	}

}
