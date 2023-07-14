package thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sq=new Sequence();
		
		Worker w1=new Worker(sq);
		w1.start();
		
		Worker w2=new Worker(sq);
		w2.start();
		
		
		

	}

	
	
}

class Worker extends Thread{
	
	Sequence sq=null;
	
	public Worker (Sequence sq) {
		this.sq=sq;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName() + "got value "+sq.getNext());
		     try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
 