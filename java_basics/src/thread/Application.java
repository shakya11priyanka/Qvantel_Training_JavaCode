package thread;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         InventoryManager manager=new InventoryManager();
         Thread inventoryTask =new Thread(new Runnable() {
        	 
        	 public void run() {
        		 try {
					manager.populateSoldProducts();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	 }
         });
         
         
 Thread displayTask =new Thread(new Runnable() {
        	 
        	 public void run() {
        		 manager.displaySoldProduct();
        	 }
         });
 
  inventoryTask.start();
  try {
	inventoryTask.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   displayTask.start();
	}

}
