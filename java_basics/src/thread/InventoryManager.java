package thread;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class InventoryManager {
	
	List<Product> soldProductList = new CopyOnWriteArrayList<Product>();
     List<Product> purchaseProductList = new ArrayList<Product>();
     
     Vector vector=new Vector();
     
     public void populateSoldProducts() throws InterruptedException {
    	 for(int i=0;i<1000;i++) {
    		 Product prod=new Product(i,"test_Product"+ i);
    		 soldProductList.add(prod);
    		 System.out.println("Added "+prod);
    		 Thread.sleep(10);
    	 }
     }
     
     public void displaySoldProduct() {
    	 for(Product product:soldProductList) {
    		 System.out.println("Printing the sold Product "+ product);
    	     try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
     }
}
