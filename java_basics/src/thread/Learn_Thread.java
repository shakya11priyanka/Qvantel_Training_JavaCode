package thread;

public class Learn_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // System.out.println("hello");
             
             Task taskrun=new Task();
             taskrun.start();
             System.out.println("hello");
             
             Task taskrun2=new Task();
             taskrun2.start();

	}
}

   class Task extends Thread {
	   public void run() {
	  for(int i=0;i<10;i++) {
		  System.out.println("loop run by number " +i);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	   }
	  
  }
	

